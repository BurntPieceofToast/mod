package com.burntpieceoftoast.steamfoundation.items;

import com.burntpieceoftoast.steamfoundation.Main;
import com.burntpieceoftoast.steamfoundation.init.ModItems;
import com.burntpieceoftoast.steamfoundation.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.steamfoundation);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
