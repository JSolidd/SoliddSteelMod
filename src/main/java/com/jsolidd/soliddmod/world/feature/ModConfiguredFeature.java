package com.jsolidd.soliddmod.world.feature;

import com.jsolidd.soliddmod.block.ModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeature {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SOLIDD_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SOLIDD_ORE_BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SOLIDD_ORE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> SOLIDD_ORE = FeatureUtils.register("solidd_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_SOLIDD_ORES, 6 /* vein size */ )));

    public static final ConfiguredFeature<?, ?> SOLIDD_ORE_LOWER = FeatureUtils.register("solidd_ore_lower",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_SOLIDD_ORES, 5 /* vein size */ )));
}
