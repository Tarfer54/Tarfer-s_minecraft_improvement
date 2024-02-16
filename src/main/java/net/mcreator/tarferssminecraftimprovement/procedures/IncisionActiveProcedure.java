package net.mcreator.tarferssminecraftimprovement.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModMobEffects;
import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IncisionActiveProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		double fromZ = 0;
		double fromX = 0;
		double fromY = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(TarferssMinecraftImprovementModEnchantments.INCISION.get()) == 1) {
			if (Math.random() <= 0.05) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TarferssMinecraftImprovementModMobEffects.BLEEDING.get(), 200, 1));
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(TarferssMinecraftImprovementModEnchantments.INCISION.get()) == 2) {
			if (Math.random() <= 0.1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TarferssMinecraftImprovementModMobEffects.BLEEDING.get(), 200, 1));
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(TarferssMinecraftImprovementModEnchantments.INCISION.get()) == 3) {
			if (Math.random() <= 0.15) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TarferssMinecraftImprovementModMobEffects.BLEEDING.get(), 200, 1));
			}
		}
	}
}
