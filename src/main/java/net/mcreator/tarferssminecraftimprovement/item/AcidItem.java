
package net.mcreator.tarferssminecraftimprovement.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModFluids;

public class AcidItem extends BucketItem {
	public AcidItem() {
		super(TarferssMinecraftImprovementModFluids.ACID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
