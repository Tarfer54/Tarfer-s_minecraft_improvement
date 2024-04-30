
package net.mcreator.tarferssminecraftimprovement.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModItems;

public class LeadPickaxeItem extends PickaxeItem {
	public LeadPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TarferssMinecraftImprovementModItems.LEAD_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
