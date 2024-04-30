
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tarferssminecraftimprovement.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.core.registries.Registries;

import net.mcreator.tarferssminecraftimprovement.enchantment.IncisionEnchantment;
import net.mcreator.tarferssminecraftimprovement.TarferssMinecraftImprovementMod;

public class TarferssMinecraftImprovementModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(Registries.ENCHANTMENT, TarferssMinecraftImprovementMod.MODID);
	public static final DeferredHolder<Enchantment, Enchantment> INCISION = REGISTRY.register("incision", () -> new IncisionEnchantment());
}
