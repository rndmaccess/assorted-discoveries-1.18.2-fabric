package rndm_access.assorteddiscoveries.common.block.screen;

import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;

import net.minecraft.client.gui.screen.ingame.StonecutterScreen;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.DataSlot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;
import rndm_access.assorteddiscoveries.common.core.ADMenuTypes;
import rndm_access.assorteddiscoveries.common.core.ADRecipeTypes;
import rndm_access.assorteddiscoveries.common.core.ADSoundEvents;
import rndm_access.assorteddiscoveries.common.item.crafting.ADWoodcuttingRecipe;

public class ADWoodcutterScreenHandler extends ScreenHandler {
    private ContainerLevelAccess access;
    private DataSlot selectedRecipeIndex = DataSlot.standalone();
    private Level level;
    private List<ADWoodcuttingRecipe> recipes = Lists.newArrayList();
    private ItemStack input = ItemStack.EMPTY;
    private long lastSoundTime;
    final Slot inputSlot;
    final Slot resultSlot;
    private Runnable slotUpdateListener = () -> {
    };

    public final Container inputInventory = new SimpleContainer(1) {
        @Override
        public void setChanged() {
            super.setChanged();
            ADWoodcutterScreenHandler.this.slotsChanged(this);
            ADWoodcutterScreenHandler.this.slotUpdateListener.run();
        }
    };

    private final ResultContainer resultContainer = new ResultContainer();

    public ADWoodcutterScreenHandler(int windowIdIn, Inventory playerInventoryIn) {
        this(windowIdIn, playerInventoryIn, ContainerLevelAccess.NULL);
    }

    public ADWoodcutterScreenHandler(int windowIdIn, Inventory inventoryIn, final ContainerLevelAccess accessIn) {
        super(ADMenuTypes.WOODCUTTER, windowIdIn);
        this.access = accessIn;
        this.level = inventoryIn.player.level;
        this.inputSlot = this.addSlot(new Slot(this.inputInventory, 0, 20, 33));
        this.resultSlot = this.addSlot(new Slot(this.resultContainer, 1, 143, 33) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
                stack.onCraftedBy(player.level, player, stack.getCount());
                ADWoodcutterScreenHandler.this.resultContainer.awardUsedRecipes(player);
                ItemStack itemstack = ADWoodcutterScreenHandler.this.inputSlot.remove(1);
                Random random = player.getRandom();

                if (!itemstack.isEmpty()) {
                    ADWoodcutterScreenHandler.this.setupResultSlot();
                }

                accessIn.execute((level, pos) -> {
                    long l = level.getGameTime();
                    if (ADWoodcutterScreenHandler.this.lastSoundTime != l) {
                        level.playSound((Player) null, pos, ADSoundEvents.UI_WOODCUTTER_TAKE_RESULT.get(),
                                SoundSource.BLOCKS, 1.0F + random.nextFloat(), 1.0F + random.nextFloat());
                        ADWoodcutterScreenHandler.this.lastSoundTime = l;
                    }
                });
                super.onTake(player, stack);
            }
        });

        // Add inventory slots (3*9 = 27 slots added here with index starting at
        // OUTPUT+1 and ending at OUTPUT+27)
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(inventoryIn, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        // Add hotbar slots (9 more slots added here, index starts at OUTPUT+27+1 and
        // ends at OUTPUT+27+1+9)
        for (int k = 0; k < 9; ++k) {
            this.addSlot(new Slot(inventoryIn, k, 8 + k * 18, 142));
        }

        this.addDataSlot(this.selectedRecipeIndex);
    }

    @Override
    public boolean stillValid(Player playerIn) {
        return stillValid(this.access, playerIn, ADBlocks.WOODCUTTER.get());
    }

    @Override
    public boolean clickMenuButton(Player playerIn, int idIn) {
        if (this.isValidRecipeIndex(idIn)) {
            this.selectedRecipeIndex.set(idIn);
            this.setupResultSlot();
        }
        return true;
    }

    private boolean isValidRecipeIndex(int idIn) {
        return idIn >= 0 && idIn < this.recipes.size();
    }

    @Override
    public void slotsChanged(Container inventoryIn) {
        ItemStack itemstack = this.inputSlot.getItem();
        if (itemstack.getItem() != input.getItem()) {
            this.input = itemstack.copy();
            this.setupRecipeList(inventoryIn, itemstack);
        }
    }

    private void setupRecipeList(Container inventoryIn, ItemStack stack) {
        this.recipes.clear();
        this.selectedRecipeIndex.set(-1);
        this.resultSlot.set(ItemStack.EMPTY);
        if (!stack.isEmpty()) {
            this.recipes = this.level.getRecipeManager().getRecipesFor(ADRecipeTypes.WOODCUTTING, inventoryIn,
                    this.level);
        }
    }

    private void setupResultSlot() {
        if (!this.recipes.isEmpty() && this.isValidRecipeIndex(this.selectedRecipeIndex.get())) {
            ADWoodcuttingRecipe woodcuttingRecipe = this.recipes.get(this.selectedRecipeIndex.get());
            this.resultContainer.setRecipeUsed(woodcuttingRecipe);
            this.resultSlot.set(woodcuttingRecipe.assemble(this.inputInventory));
        } else {
            this.resultSlot.set(ItemStack.EMPTY);
        }
        this.broadcastChanges();
    }

    @Override
    public MenuType<?> getType() {
        return ADMenuTypes.WOODCUTTER.get();
    }

    @OnlyIn(Dist.CLIENT)
    public void registerUpdateListener(Runnable listener) {
        this.slotUpdateListener = listener;
    }

    @Override
    public boolean canTakeItemForPickAll(ItemStack stack, Slot slotIn) {
        return slotIn.container != this.resultContainer && super.canTakeItemForPickAll(stack, slotIn);
    }

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            Item item = itemstack1.getItem();
            itemstack = itemstack1.copy();

            // Move the stack from the output slot.
            if (index == 1) {
                item.onCraftedBy(itemstack1, playerIn.level, playerIn);
                if (!this.moveItemStackTo(itemstack1, 2, 38, true)) {
                    return ItemStack.EMPTY;
                }

                slot.onQuickCraft(itemstack1, itemstack);
            }
            // Move the stack from the input slot.
            else if (index == 0) {
                if (!this.moveItemStackTo(itemstack1, 2, 38, false)) {
                    return ItemStack.EMPTY;
                }
            }
            // Move the stack to the input slot.
            else if (this.level.getRecipeManager()
                    .getRecipeFor(ADRecipeTypes.WOODCUTTING, new SimpleContainer(itemstack1), this.level).isPresent()) {
                if (!this.moveItemStackTo(itemstack1, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            }
            // Move the stack around the inventory.
            else if (index >= 2 && index < 29) {
                if (!this.moveItemStackTo(itemstack1, 29, 38, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (index >= 29 && index < 38 && !this.moveItemStackTo(itemstack1, 2, 29, false)) {
                return ItemStack.EMPTY;
            }

            // Moved the stack to a different slot.
            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            }

            // The stack stayed in the same slot.
            slot.setChanged();
            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
            this.broadcastChanges();
        }
        return itemstack;
    }

    @Override
    public void removed(Player playerIn) {
        super.removed(playerIn);
        this.resultContainer.removeItemNoUpdate(1);
        this.access.execute((level, pos) -> {
            this.clearContainer(playerIn, this.inputInventory);
        });
    }

    public int getSelectedRecipeIndex() {
        return this.selectedRecipeIndex.get();
    }

    public List<ADWoodcuttingRecipe> getRecipes() {
        return this.recipes;
    }

    public int getNumRecipes() {
        return this.recipes.size();
    }

    public boolean hasInputItem() {
        return this.inputSlot.hasItem() && !this.recipes.isEmpty();
    }
}
