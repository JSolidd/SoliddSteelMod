package com.jsolidd.soliddmod.block;

import com.jsolidd.soliddmod.SoliddMod;
import com.jsolidd.soliddmod.item.ModCreativeModeTab;
import com.jsolidd.soliddmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SoliddMod.MOD_ID);

    public static final RegistryObject<Block> SOLIDD_STEEL_BLOCK = registerBlock("solidd_steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .strength(5f, 7f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.SOLIDD_TAB);

    public static final RegistryObject<Block> PACKED_SOLIDD_ORE = registerBlock("packed_solidd_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SOLIDD_TAB);

    public static final RegistryObject<Block> SOLIDD_ORE_BLOCK = registerBlock("solidd_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SOLIDD_TAB);

    public static final RegistryObject<Block> DEEPSLATE_SOLIDD_ORE = registerBlock("deepslate_solidd_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f, 3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SOLIDD_TAB);

    //Helpers

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
