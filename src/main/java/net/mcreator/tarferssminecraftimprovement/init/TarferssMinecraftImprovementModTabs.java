
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tarferssminecraftimprovement.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.tarferssminecraftimprovement.TarferssMinecraftImprovementMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TarferssMinecraftImprovementModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TarferssMinecraftImprovementMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(TarferssMinecraftImprovementModBlocks.RUBY_BLOCK.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.LEAD_BLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_FENCE_GATE.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY_TOOLS_SWORD.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_TOOLS_SWORD.get());
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY_ARMOR_ARMOR_HELMET.get());
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY_ARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY_ARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY_ARMOR_ARMOR_BOOTS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_ARMOR_HELMET.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_ARMOR_CHESTPLATE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_ARMOR_LEGGINGS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_ARMOR_BOOTS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_SWORD.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_ARMOR_HELMET.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_ARMOR_CHESTPLATE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_ARMOR_LEGGINGS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_ARMOR_BOOTS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_SWORD.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_ARMOR_HELMET.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_ARMOR_LEGGINGS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_ARMOR_BOOTS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ANTI_RAD_ALUMINIUM_ARMOR_HELMET.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ANTI_RAD_ALUMINIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ANTI_RAD_ALUMINIUM_ARMOR_LEGGINGS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ANTI_RAD_ALUMINIUM_ARMOR_BOOTS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ANTI_RAD_RUBY_ARMOR_HELMET.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ANTI_RAD_RUBY_ARMOR_CHESTPLATE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ANTI_RAD_RUBY_ARMOR_LEGGINGS.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ANTI_RAD_RUBY_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_INGOT.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_INGOT.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_INGOT.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TarferssMinecraftImprovementModBlocks.RUBY_ORE.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.RUBY_DEEPSLATE_ORE.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.AMETHYST_BASALT_ORE.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.AMETHYST_CALCITE_ORE.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_LEAVES.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_FENCE.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.LEAD_ORE.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.BAUXITE_ORE.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModBlocks.BAUXITE_DEEPSLATE_ORE.get().asItem());
			tabData.accept(TarferssMinecraftImprovementModItems.ACID_BUCKET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY_TOOLS_AXE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY_TOOLS_PICKAXE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY_TOOLS_SHOVEL.get());
			tabData.accept(TarferssMinecraftImprovementModItems.RUBY_TOOLS_HOE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_TOOLS_PICKAXE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_TOOLS_AXE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_TOOLS_SHOVEL.get());
			tabData.accept(TarferssMinecraftImprovementModItems.AMETHYST_TOOLS_HOE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_PICKAXE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_AXE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_SHOVEL.get());
			tabData.accept(TarferssMinecraftImprovementModItems.LEAD_HOE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_PICKAXE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_AXE.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_SHOVEL.get());
			tabData.accept(TarferssMinecraftImprovementModItems.ALUMINIUM_HOE.get());
		}
	}
}
