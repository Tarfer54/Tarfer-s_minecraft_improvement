
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tarferssminecraftimprovement.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.tarferssminecraftimprovement.fluid.types.AcidFluidType;
import net.mcreator.tarferssminecraftimprovement.TarferssMinecraftImprovementMod;

public class TarferssMinecraftImprovementModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, TarferssMinecraftImprovementMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> ACID_TYPE = REGISTRY.register("acid", () -> new AcidFluidType());
}
