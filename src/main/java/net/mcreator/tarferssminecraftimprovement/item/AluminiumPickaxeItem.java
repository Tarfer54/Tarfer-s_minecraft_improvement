
package net.mcreator.tarferssminecraftimprovement.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModItems;

public class AluminiumPickaxeItem extends PickaxeItem {
	public AluminiumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1250;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TarferssMinecraftImprovementModItems.ALUMINIUM_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
