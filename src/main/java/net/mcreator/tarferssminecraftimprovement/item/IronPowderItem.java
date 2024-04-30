
package net.mcreator.tarferssminecraftimprovement.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronPowderItem extends Item {
	public IronPowderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
