package com.jsolidd.soliddmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SOLIDD_TAB = new CreativeModeTab("soliddmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SOLIDD_STEEL_INGOT.get());
        }
    };
}
