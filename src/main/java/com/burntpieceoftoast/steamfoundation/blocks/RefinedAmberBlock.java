package com.burntpieceoftoast.steamfoundation.blocks;

import com.burntpieceoftoast.steamfoundation.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RefinedAmberBlock extends BlockBase 
{

	public RefinedAmberBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(2);
		setLightOpacity(1);
		//setBlockUnbreakable();
		
		
	}
	
}
