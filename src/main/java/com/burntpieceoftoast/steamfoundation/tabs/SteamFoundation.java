package com.burntpieceoftoast.steamfoundation.tabs;

import com.burntpieceoftoast.steamfoundation.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SteamFoundation extends CreativeTabs
{
	public SteamFoundation(String label)
	{
		super("steamfoundation");
		this.setBackgroundImageName("steamfoundation.png");
	}
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.STEEL_INGOT);
	}
}
