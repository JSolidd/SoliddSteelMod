package com.jsolidd.soliddmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier SOLIDD_STEEL = new ForgeTier(2, 650, 7f,
            2f, 12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.SOLIDD_STEEL_INGOT.get()));
}
