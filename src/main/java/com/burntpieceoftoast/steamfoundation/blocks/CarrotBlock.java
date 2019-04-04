package com.burntpieceoftoast.steamfoundation.blocks;

import java.util.Random;

import com.burntpieceoftoast.steamfoundation.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CarrotBlock extends BlockBase
{
	public static final AxisAlignedBB CARROT_BLOCK_AABB = new AxisAlignedBB(0.1875, 0.1875, 0.1875, 0.8125, 0.1875 ,0.8125);
	
	public CarrotBlock(String name) 
	{
		super(name, Material.CACTUS);
		setSoundType(SoundType.PLANT);
		setHardness(0.2f);
		setResistance(2.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0);
		setLightOpacity(0);
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
		return CARROT_BLOCK_AABB;
	}
	
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return Items.CARROT;
	    }
}
