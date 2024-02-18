
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tarferssminecraftimprovement.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.tarferssminecraftimprovement.enchantment.IncisionEnchantment;
import net.mcreator.tarferssminecraftimprovement.TarferssMinecraftImprovementMod;

public class TarferssMinecraftImprovementModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TarferssMinecraftImprovementMod.MODID);
	public static final RegistryObject<Enchantment> INCISION = REGISTRY.register("incision", () -> new IncisionEnchantment());
}
