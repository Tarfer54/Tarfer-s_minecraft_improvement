
package net.mcreator.tarferssminecraftimprovement.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModItems;

public class Amethyst_toolsAxeItem extends AxeItem {
	public Amethyst_toolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1650;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 7f;
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
		}, 1, -3f, new Item.Properties());
	}
}
