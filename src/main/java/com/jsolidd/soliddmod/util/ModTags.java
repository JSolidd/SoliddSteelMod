package com.jsolidd.soliddmod.util;

import com.jsolidd.soliddmod.SoliddMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {

    public static void register() {
        Blocks.registerBlockTags();
        Items.registerItemTags();
    }

    public static class Blocks {


        private static Tags.IOptionalNamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(SoliddMod.MOD_ID, name));

        }

        private static Tags.IOptionalNamedTag<Block> forgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));

        }

        public static void registerBlockTags() {
        }
    }

    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> SOLIDD_STEEL_INGOTS = forgeTag("ingots/solidd_steel");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
                return ItemTags.createOptional(new ResourceLocation(SoliddMod.MOD_ID, name));

        }

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
                return ItemTags.createOptional(new ResourceLocation("forge", name));

        }

        public static void registerItemTags() {
        }
    }
}
