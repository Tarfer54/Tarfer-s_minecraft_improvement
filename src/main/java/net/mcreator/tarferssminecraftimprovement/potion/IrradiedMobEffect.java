
package net.mcreator.tarferssminecraftimprovement.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class IrradiedMobEffect extends MobEffect {
	public IrradiedMobEffect() {
		super(MobEffectCategory.HARMFUL, -13382656);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tarferss_minecraft_improvement.irradied";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
