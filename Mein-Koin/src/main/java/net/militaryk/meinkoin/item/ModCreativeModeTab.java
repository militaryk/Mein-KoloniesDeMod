package net.militaryk.meinkoin.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MEINKOIN_TAB = new CreativeModeTab("meinkoin") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MEINKOIN.get());
        }
    };
}
