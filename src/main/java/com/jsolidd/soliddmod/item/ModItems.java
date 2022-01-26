package com.jsolidd.soliddmod.item;

import com.jsolidd.soliddmod.SoliddMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.io.serialization.ValidatingObjectInputStream;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SoliddMod.MOD_ID);

    public static final RegistryObject<Item> SOLIDD_STEEL_INGOT = ITEMS.register("solidd_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_ORE = ITEMS.register("solidd_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
