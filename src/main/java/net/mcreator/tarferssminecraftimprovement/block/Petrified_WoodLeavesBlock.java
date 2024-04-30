
package net.mcreator.tarferssminecraftimprovement.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class Petrified_WoodLeavesBlock extends LeavesBlock {
	public Petrified_WoodLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.GRASS).strength(0.3f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 45;
	}
}
