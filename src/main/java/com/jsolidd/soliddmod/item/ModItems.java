package com.jsolidd.soliddmod.item;

import com.jsolidd.soliddmod.SoliddMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SoliddMod.MOD_ID);

    public static final RegistryObject<Item> SOLIDD_STEEL_INGOT = ITEMS.register("solidd_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_ORE = ITEMS.register("solidd_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));


    //TOOLS
    public static final RegistryObject<Item> SOLIDD_STEEL_SWORD = ITEMS.register("solidd_steel_sword",
            () -> new SwordItem(ModTiers.SOLIDD_STEEL, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_STEEL_SHOVEL = ITEMS.register("solidd_steel_shovel",
            () -> new ShovelItem(ModTiers.SOLIDD_STEEL, 1.5f, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_STEEL_PICKAXE = ITEMS.register("solidd_steel_pickaxe",
            () -> new PickaxeItem(ModTiers.SOLIDD_STEEL, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_STEEL_AXE = ITEMS.register("solidd_steel_axe",
            () -> new AxeItem(ModTiers.SOLIDD_STEEL, 6, -3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_STEEL_HOE = ITEMS.register("solidd_steel_hoe",
            () -> new HoeItem(ModTiers.SOLIDD_STEEL, -2, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_STEEL_SHEARS = ITEMS.register("solidd_steel_shears",
            () -> new ShearsItem(new Item.Properties(). durability(714).tab(ModCreativeModeTab.SOLIDD_TAB) ));

   /* public static final RegistryObject<Item> SOLIDD_STEEL_SHIELD = ITEMS.register("solidd_steel_shield",
            () -> new ShieldItem(new Item.Properties().durability(1011).tab(ModCreativeModeTab.SOLIDD_TAB)));
    */

    //ARMOR
    public static final RegistryObject<Item> SOLIDD_STEEL_HELMET = ITEMS.register("solidd_steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.SOLIDD_STEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_STEEL_CHESTPLATE = ITEMS.register("solidd_steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SOLIDD_STEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_STEEL_LEGGINGS = ITEMS.register("solidd_steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.SOLIDD_STEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));

    public static final RegistryObject<Item> SOLIDD_STEEL_BOOTS = ITEMS.register("solidd_steel_boots",
            () -> new ArmorItem(ModArmorMaterials.SOLIDD_STEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.SOLIDD_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
