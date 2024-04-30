
package net.mcreator.tarferssminecraftimprovement.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModItems;
import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModFluids;
import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModFluidTypes;
import net.mcreator.tarferssminecraftimprovement.init.TarferssMinecraftImprovementModBlocks;

public abstract class AcidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> TarferssMinecraftImprovementModFluidTypes.ACID_TYPE.get(), () -> TarferssMinecraftImprovementModFluids.ACID.get(),
			() -> TarferssMinecraftImprovementModFluids.FLOWING_ACID.get()).explosionResistance(100f).tickRate(3).bucket(() -> TarferssMinecraftImprovementModItems.ACID_BUCKET.get())
			.block(() -> (LiquidBlock) TarferssMinecraftImprovementModBlocks.ACID.get());

	private AcidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	public static class Source extends AcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
