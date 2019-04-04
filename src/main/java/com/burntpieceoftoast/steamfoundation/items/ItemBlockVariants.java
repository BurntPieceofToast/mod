package com.burntpieceoftoast.steamfoundation.items;

import com.burntpieceoftoast.steamfoundation.util.interfaces.IMetaName;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVariants extends ItemBlock
{
	public ItemBlockVariants(Block blocks) 
	{
		super(blocks);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	@Override
	public int getMetadata(int damage) 
	{
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
		return super.getUnlocalizedName() + " " + ((IMetaName)this.block).getSpecialName(stack);
	}
}
