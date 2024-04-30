
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tarferssminecraftimprovement.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.tarferssminecraftimprovement.block.RubyOreBlock;
import net.mcreator.tarferssminecraftimprovement.block.RubyDeepslateOreBlock;
import net.mcreator.tarferssminecraftimprovement.block.RubyBlockBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodWoodBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodStairsBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodSlabBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodPressurePlateBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodPlanksBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodLogBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodLeavesBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodFenceGateBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodFenceBlock;
import net.mcreator.tarferssminecraftimprovement.block.Petrified_WoodButtonBlock;
import net.mcreator.tarferssminecraftimprovement.block.LeadOreBlock;
import net.mcreator.tarferssminecraftimprovement.block.LeadBlockBlock;
import net.mcreator.tarferssminecraftimprovement.block.BauxiteOreBlock;
import net.mcreator.tarferssminecraftimprovement.block.BauxiteDeepslateOreBlock;
import net.mcreator.tarferssminecraftimprovement.block.AmethystCalciteOreBlock;
import net.mcreator.tarferssminecraftimprovement.block.AmethystBasaltOreBlock;
import net.mcreator.tarferssminecraftimprovement.block.AcidBlock;
import net.mcreator.tarferssminecraftimprovement.TarferssMinecraftImprovementMod;

public class TarferssMinecraftImprovementModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, TarferssMinecraftImprovementMod.MODID);
	public static final DeferredHolder<Block, Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final DeferredHolder<Block, Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final DeferredHolder<Block, Block> RUBY_DEEPSLATE_ORE = REGISTRY.register("ruby_deepslate_ore", () -> new RubyDeepslateOreBlock());
	public static final DeferredHolder<Block, Block> AMETHYST_BASALT_ORE = REGISTRY.register("amethyst_basalt_ore", () -> new AmethystBasaltOreBlock());
	public static final DeferredHolder<Block, Block> AMETHYST_CALCITE_ORE = REGISTRY.register("amethyst_calcite_ore", () -> new AmethystCalciteOreBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_WOOD = REGISTRY.register("petrified_wood_wood", () -> new Petrified_WoodWoodBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_LOG = REGISTRY.register("petrified_wood_log", () -> new Petrified_WoodLogBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_PLANKS = REGISTRY.register("petrified_wood_planks", () -> new Petrified_WoodPlanksBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_LEAVES = REGISTRY.register("petrified_wood_leaves", () -> new Petrified_WoodLeavesBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_STAIRS = REGISTRY.register("petrified_wood_stairs", () -> new Petrified_WoodStairsBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_SLAB = REGISTRY.register("petrified_wood_slab", () -> new Petrified_WoodSlabBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_FENCE = REGISTRY.register("petrified_wood_fence", () -> new Petrified_WoodFenceBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_FENCE_GATE = REGISTRY.register("petrified_wood_fence_gate", () -> new Petrified_WoodFenceGateBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_PRESSURE_PLATE = REGISTRY.register("petrified_wood_pressure_plate", () -> new Petrified_WoodPressurePlateBlock());
	public static final DeferredHolder<Block, Block> PETRIFIED_WOOD_BUTTON = REGISTRY.register("petrified_wood_button", () -> new Petrified_WoodButtonBlock());
	public static final DeferredHolder<Block, Block> LEAD_ORE = REGISTRY.register("lead_ore", () -> new LeadOreBlock());
	public static final DeferredHolder<Block, Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new LeadBlockBlock());
	public static final DeferredHolder<Block, Block> BAUXITE_ORE = REGISTRY.register("bauxite_ore", () -> new BauxiteOreBlock());
	public static final DeferredHolder<Block, Block> BAUXITE_DEEPSLATE_ORE = REGISTRY.register("bauxite_deepslate_ore", () -> new BauxiteDeepslateOreBlock());
	public static final DeferredHolder<Block, Block> ACID = REGISTRY.register("acid", () -> new AcidBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
