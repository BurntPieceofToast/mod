package com.burntpieceoftoast.steamfoundation.objects.tools;

import net.minecraft.item.Item;

import com.burntpieceoftoast.steamfoundation.Main;
import com.burntpieceoftoast.steamfoundation.init.ModItems;
import com.burntpieceoftoast.steamfoundation.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;



public class ToolAxe extends ItemAxe implements IHasModel {



	public ToolAxe(String name, ToolMaterial material)

	{
		super(material, 6.0F, -3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.steamfoundation);

		ModItems.ITEMS.add(this);
	}

	public void registerModels()

	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
