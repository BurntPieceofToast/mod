package com.burntpieceoftoast.steamfoundation.blocks;

import java.util.Random;

import com.burntpieceoftoast.steamfoundation.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class CopperOre extends BlockBase
{
	public CopperOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.SNOW);
		setHardness(1.0f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(1);
		setLightOpacity(1);
		//setBlockUnbreakable();
	}
}
