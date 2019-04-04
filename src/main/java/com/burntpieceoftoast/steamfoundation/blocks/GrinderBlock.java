package com.burntpieceoftoast.steamfoundation.blocks;

import com.burntpieceoftoast.steamfoundation.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class GrinderBlock extends BlockBase
{
	public static final AxisAlignedBB GRINDER_BLOCK_AABB = new AxisAlignedBB(0, 0, 0, 1, 1 ,1);
	
	public GrinderBlock(String name) 
	{
		super(name, Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0);
		setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return GRINDER_BLOCK_AABB;
	}

}
