
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tarferssminecraftimprovement.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.tarferssminecraftimprovement.item.ThermiteItem;
import net.mcreator.tarferssminecraftimprovement.item.Ruby_toolsSwordItem;
import net.mcreator.tarferssminecraftimprovement.item.Ruby_toolsShovelItem;
import net.mcreator.tarferssminecraftimprovement.item.Ruby_toolsPickaxeItem;
import net.mcreator.tarferssminecraftimprovement.item.Ruby_toolsHoeItem;
import net.mcreator.tarferssminecraftimprovement.item.Ruby_toolsAxeItem;
import net.mcreator.tarferssminecraftimprovement.item.RubyItem;
import net.mcreator.tarferssminecraftimprovement.item.RubyArmorArmorItem;
import net.mcreator.tarferssminecraftimprovement.item.LeadSwordItem;
import net.mcreator.tarferssminecraftimprovement.item.LeadShovelItem;
import net.mcreator.tarferssminecraftimprovement.item.LeadPickaxeItem;
import net.mcreator.tarferssminecraftimprovement.item.LeadIngotItem;
import net.mcreator.tarferssminecraftimprovement.item.LeadHoeItem;
import net.mcreator.tarferssminecraftimprovement.item.LeadAxeItem;
import net.mcreator.tarferssminecraftimprovement.item.LeadArmorItem;
import net.mcreator.tarferssminecraftimprovement.item.IronPowderItem;
import net.mcreator.tarferssminecraftimprovement.item.AntiRadRubyArmorItem;
import net.mcreator.tarferssminecraftimprovement.item.AntiRadAmethystArmorItem;
import net.mcreator.tarferssminecraftimprovement.item.AntiRadAluminiumArmorItem;
import net.mcreator.tarferssminecraftimprovement.item.Amethyst_toolsSwordItem;
import net.mcreator.tarferssminecraftimprovement.item.Amethyst_toolsShovelItem;
import net.mcreator.tarferssminecraftimprovement.item.Amethyst_toolsPickaxeItem;
import net.mcreator.tarferssminecraftimprovement.item.Amethyst_toolsHoeItem;
import net.mcreator.tarferssminecraftimprovement.item.Amethyst_toolsAxeItem;
import net.mcreator.tarferssminecraftimprovement.item.AmethystIngotItem;
import net.mcreator.tarferssminecraftimprovement.item.AmethystArmorItem;
import net.mcreator.tarferssminecraftimprovement.item.AluminiumSwordItem;
import net.mcreator.tarferssminecraftimprovement.item.AluminiumShovelItem;
import net.mcreator.tarferssminecraftimprovement.item.AluminiumPowderItem;
import net.mcreator.tarferssminecraftimprovement.item.AluminiumPickaxeItem;
import net.mcreator.tarferssminecraftimprovement.item.AluminiumIngotItem;
import net.mcreator.tarferssminecraftimprovement.item.AluminiumHoeItem;
import net.mcreator.tarferssminecraftimprovement.item.AluminiumAxeItem;
import net.mcreator.tarferssminecraftimprovement.item.AluminiumArmorItem;
import net.mcreator.tarferssminecraftimprovement.item.AcidItem;
import net.mcreator.tarferssminecraftimprovement.TarferssMinecraftImprovementMod;

public class TarferssMinecraftImprovementModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, TarferssMinecraftImprovementMod.MODID);
	public static final DeferredHolder<Item, Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final DeferredHolder<Item, Item> RUBY_ORE = block(TarferssMinecraftImprovementModBlocks.RUBY_ORE);
	public static final DeferredHolder<Item, Item> RUBY_BLOCK = block(TarferssMinecraftImprovementModBlocks.RUBY_BLOCK);
	public static final DeferredHolder<Item, Item> RUBY_DEEPSLATE_ORE = block(TarferssMinecraftImprovementModBlocks.RUBY_DEEPSLATE_ORE);
	public static final DeferredHolder<Item, Item> RUBY_TOOLS_PICKAXE = REGISTRY.register("ruby_tools_pickaxe", () -> new Ruby_toolsPickaxeItem());
	public static final DeferredHolder<Item, Item> RUBY_TOOLS_AXE = REGISTRY.register("ruby_tools_axe", () -> new Ruby_toolsAxeItem());
	public static final DeferredHolder<Item, Item> RUBY_TOOLS_SWORD = REGISTRY.register("ruby_tools_sword", () -> new Ruby_toolsSwordItem());
	public static final DeferredHolder<Item, Item> RUBY_TOOLS_SHOVEL = REGISTRY.register("ruby_tools_shovel", () -> new Ruby_toolsShovelItem());
	public static final DeferredHolder<Item, Item> RUBY_TOOLS_HOE = REGISTRY.register("ruby_tools_hoe", () -> new Ruby_toolsHoeItem());
	public static final DeferredHolder<Item, Item> AMETHYST_BASALT_ORE = block(TarferssMinecraftImprovementModBlocks.AMETHYST_BASALT_ORE);
	public static final DeferredHolder<Item, Item> AMETHYST_CALCITE_ORE = block(TarferssMinecraftImprovementModBlocks.AMETHYST_CALCITE_ORE);
	public static final DeferredHolder<Item, Item> AMETHYST_TOOLS_PICKAXE = REGISTRY.register("amethyst_tools_pickaxe", () -> new Amethyst_toolsPickaxeItem());
	public static final DeferredHolder<Item, Item> AMETHYST_TOOLS_AXE = REGISTRY.register("amethyst_tools_axe", () -> new Amethyst_toolsAxeItem());
	public static final DeferredHolder<Item, Item> AMETHYST_TOOLS_SWORD = REGISTRY.register("amethyst_tools_sword", () -> new Amethyst_toolsSwordItem());
	public static final DeferredHolder<Item, Item> AMETHYST_TOOLS_SHOVEL = REGISTRY.register("amethyst_tools_shovel", () -> new Amethyst_toolsShovelItem());
	public static final DeferredHolder<Item, Item> AMETHYST_TOOLS_HOE = REGISTRY.register("amethyst_tools_hoe", () -> new Amethyst_toolsHoeItem());
	public static final DeferredHolder<Item, Item> AMETHYST_INGOT = REGISTRY.register("amethyst_ingot", () -> new AmethystIngotItem());
	public static final DeferredHolder<Item, Item> RUBY_ARMOR_ARMOR_HELMET = REGISTRY.register("ruby_armor_armor_helmet", () -> new RubyArmorArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> RUBY_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_armor_chestplate", () -> new RubyArmorArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> RUBY_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_armor_leggings", () -> new RubyArmorArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> RUBY_ARMOR_ARMOR_BOOTS = REGISTRY.register("ruby_armor_armor_boots", () -> new RubyArmorArmorItem.Boots());
	public static final DeferredHolder<Item, Item> AMETHYST_ARMOR_HELMET = REGISTRY.register("amethyst_armor_helmet", () -> new AmethystArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> AMETHYST_ARMOR_CHESTPLATE = REGISTRY.register("amethyst_armor_chestplate", () -> new AmethystArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> AMETHYST_ARMOR_LEGGINGS = REGISTRY.register("amethyst_armor_leggings", () -> new AmethystArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> AMETHYST_ARMOR_BOOTS = REGISTRY.register("amethyst_armor_boots", () -> new AmethystArmorItem.Boots());
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_WOOD = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_WOOD);
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_LOG = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_LOG);
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_PLANKS = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_PLANKS);
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_LEAVES = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_LEAVES);
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_STAIRS = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_STAIRS);
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_SLAB = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_SLAB);
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_FENCE = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_FENCE);
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_FENCE_GATE = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_FENCE_GATE);
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_PRESSURE_PLATE = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> PETRIFIED_WOOD_BUTTON = block(TarferssMinecraftImprovementModBlocks.PETRIFIED_WOOD_BUTTON);
	public static final DeferredHolder<Item, Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final DeferredHolder<Item, Item> LEAD_ORE = block(TarferssMinecraftImprovementModBlocks.LEAD_ORE);
	public static final DeferredHolder<Item, Item> LEAD_BLOCK = block(TarferssMinecraftImprovementModBlocks.LEAD_BLOCK);
	public static final DeferredHolder<Item, Item> LEAD_PICKAXE = REGISTRY.register("lead_pickaxe", () -> new LeadPickaxeItem());
	public static final DeferredHolder<Item, Item> LEAD_AXE = REGISTRY.register("lead_axe", () -> new LeadAxeItem());
	public static final DeferredHolder<Item, Item> LEAD_SWORD = REGISTRY.register("lead_sword", () -> new LeadSwordItem());
	public static final DeferredHolder<Item, Item> LEAD_SHOVEL = REGISTRY.register("lead_shovel", () -> new LeadShovelItem());
	public static final DeferredHolder<Item, Item> LEAD_HOE = REGISTRY.register("lead_hoe", () -> new LeadHoeItem());
	public static final DeferredHolder<Item, Item> LEAD_ARMOR_HELMET = REGISTRY.register("lead_armor_helmet", () -> new LeadArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> LEAD_ARMOR_CHESTPLATE = REGISTRY.register("lead_armor_chestplate", () -> new LeadArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> LEAD_ARMOR_LEGGINGS = REGISTRY.register("lead_armor_leggings", () -> new LeadArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> LEAD_ARMOR_BOOTS = REGISTRY.register("lead_armor_boots", () -> new LeadArmorItem.Boots());
	public static final DeferredHolder<Item, Item> BAUXITE_ORE = block(TarferssMinecraftImprovementModBlocks.BAUXITE_ORE);
	public static final DeferredHolder<Item, Item> BAUXITE_DEEPSLATE_ORE = block(TarferssMinecraftImprovementModBlocks.BAUXITE_DEEPSLATE_ORE);
	public static final DeferredHolder<Item, Item> ALUMINIUM_INGOT = REGISTRY.register("aluminium_ingot", () -> new AluminiumIngotItem());
	public static final DeferredHolder<Item, Item> ACID_BUCKET = REGISTRY.register("acid_bucket", () -> new AcidItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_PICKAXE = REGISTRY.register("aluminium_pickaxe", () -> new AluminiumPickaxeItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_AXE = REGISTRY.register("aluminium_axe", () -> new AluminiumAxeItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_SWORD = REGISTRY.register("aluminium_sword", () -> new AluminiumSwordItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_SHOVEL = REGISTRY.register("aluminium_shovel", () -> new AluminiumShovelItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_HOE = REGISTRY.register("aluminium_hoe", () -> new AluminiumHoeItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_ARMOR_HELMET = REGISTRY.register("aluminium_armor_helmet", () -> new AluminiumArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> ALUMINIUM_ARMOR_CHESTPLATE = REGISTRY.register("aluminium_armor_chestplate", () -> new AluminiumArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> ALUMINIUM_ARMOR_LEGGINGS = REGISTRY.register("aluminium_armor_leggings", () -> new AluminiumArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> ALUMINIUM_ARMOR_BOOTS = REGISTRY.register("aluminium_armor_boots", () -> new AluminiumArmorItem.Boots());
	public static final DeferredHolder<Item, Item> ANTI_RAD_ALUMINIUM_ARMOR_HELMET = REGISTRY.register("anti_rad_aluminium_armor_helmet", () -> new AntiRadAluminiumArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> ANTI_RAD_ALUMINIUM_ARMOR_CHESTPLATE = REGISTRY.register("anti_rad_aluminium_armor_chestplate", () -> new AntiRadAluminiumArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> ANTI_RAD_ALUMINIUM_ARMOR_LEGGINGS = REGISTRY.register("anti_rad_aluminium_armor_leggings", () -> new AntiRadAluminiumArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> ANTI_RAD_ALUMINIUM_ARMOR_BOOTS = REGISTRY.register("anti_rad_aluminium_armor_boots", () -> new AntiRadAluminiumArmorItem.Boots());
	public static final DeferredHolder<Item, Item> ANTI_RAD_RUBY_ARMOR_HELMET = REGISTRY.register("anti_rad_ruby_armor_helmet", () -> new AntiRadRubyArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> ANTI_RAD_RUBY_ARMOR_CHESTPLATE = REGISTRY.register("anti_rad_ruby_armor_chestplate", () -> new AntiRadRubyArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> ANTI_RAD_RUBY_ARMOR_LEGGINGS = REGISTRY.register("anti_rad_ruby_armor_leggings", () -> new AntiRadRubyArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> ANTI_RAD_RUBY_ARMOR_BOOTS = REGISTRY.register("anti_rad_ruby_armor_boots", () -> new AntiRadRubyArmorItem.Boots());
	public static final DeferredHolder<Item, Item> ANTI_RAD_AMETHYST_ARMOR_HELMET = REGISTRY.register("anti_rad_amethyst_armor_helmet", () -> new AntiRadAmethystArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> ANTI_RAD_AMETHYST_ARMOR_CHESTPLATE = REGISTRY.register("anti_rad_amethyst_armor_chestplate", () -> new AntiRadAmethystArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> ANTI_RAD_AMETHYST_ARMOR_LEGGINGS = REGISTRY.register("anti_rad_amethyst_armor_leggings", () -> new AntiRadAmethystArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> ANTI_RAD_AMETHYST_ARMOR_BOOTS = REGISTRY.register("anti_rad_amethyst_armor_boots", () -> new AntiRadAmethystArmorItem.Boots());
	public static final DeferredHolder<Item, Item> IRON_POWDER = REGISTRY.register("iron_powder", () -> new IronPowderItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_POWDER = REGISTRY.register("aluminium_powder", () -> new AluminiumPowderItem());
	public static final DeferredHolder<Item, Item> THERMITE = REGISTRY.register("thermite", () -> new ThermiteItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
