package com.jsolidd.soliddmod.world.feature;

import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final PlacedFeature SOLIDD_ORE_PLACED = PlacementUtils.register("solidd_ore_placed",
            ModConfiguredFeature.SOLIDD_ORE.placed(ModOrePlacement.commonOrePlacement(6,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32)))));

    public static final PlacedFeature SOLIDD_ORE_LOWER = PlacementUtils.register("solidd_ore_lower",
            ModConfiguredFeature.SOLIDD_ORE_LOWER.placed(ModOrePlacement.commonOrePlacement(7,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-48)))));
}
