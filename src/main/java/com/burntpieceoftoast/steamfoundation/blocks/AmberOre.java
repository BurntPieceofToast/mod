package com.burntpieceoftoast.steamfoundation.blocks;

import java.util.Random;

import com.burntpieceoftoast.steamfoundation.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AmberOre extends BlockBase {

	public AmberOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.SNOW);
		setHardness(1.0f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(1);
		setLightOpacity(1);
		//setBlockUnbreakable();
		
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return ModItems.RAW_AMBER;
	    }

	int minDropAmount = 2;
	int maxDropAmount = 4;
	

	public int quantityDropped(Random random)
	{
		if(this.minDropAmount>this.maxDropAmount) {
			int i = this.minDropAmount;
			this.minDropAmount=this.maxDropAmount;
			this.maxDropAmount=i;
		}
		return this.minDropAmount + random.nextInt(this.maxDropAmount - this.minDropAmount + 1);

	}
}
