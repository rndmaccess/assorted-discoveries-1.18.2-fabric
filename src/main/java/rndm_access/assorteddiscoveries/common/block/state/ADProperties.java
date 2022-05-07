package rndm_access.assorteddiscoveries.common.block.state;

import net.minecraft.state.property.IntProperty;

public class ADProperties {
    public static final IntProperty STACK_SIZE;
    public static final IntProperty PUFFED;
    public static final IntProperty LENGTH;

    static {
        STACK_SIZE = IntProperty.of("stack_size", 1, 3);
        PUFFED = IntProperty.of("puffed", 0, 2);
        LENGTH = IntProperty.of("length", 0, 16);
    }
}
