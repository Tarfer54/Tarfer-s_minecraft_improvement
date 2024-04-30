
package net.mcreator.tarferssminecraftimprovement.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModItems;

public class Ruby_toolsShovelItem extends ShovelItem {
	public Ruby_toolsShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 50;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TarferssMinecraftImprovementModItems.RUBY.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
