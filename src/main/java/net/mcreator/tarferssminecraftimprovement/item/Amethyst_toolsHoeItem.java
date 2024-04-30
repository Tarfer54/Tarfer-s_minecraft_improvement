
package net.mcreator.tarferssminecraftimprovement.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModItems;

public class Amethyst_toolsHoeItem extends HoeItem {
	public Amethyst_toolsHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1650;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TarferssMinecraftImprovementModItems.AMETHYST_INGOT.get()));
			}
		}, 0, 0f, new Item.Properties());
	}
}
