
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tarferssminecraftimprovement.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.tarferssminecraftimprovement.fluid.types.AcidFluidType;
import net.mcreator.tarferssminecraftimprovement.TarferssMinecraftImprovementMod;

public class TarferssMinecraftImprovementModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TarferssMinecraftImprovementMod.MODID);
	public static final RegistryObject<FluidType> ACID_TYPE = REGISTRY.register("acid", () -> new AcidFluidType());
}
