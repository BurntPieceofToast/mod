package com.burntpieceoftoast.steamfoundation.objects.tools;

import com.burntpieceoftoast.steamfoundation.Main;
import com.burntpieceoftoast.steamfoundation.init.ModItems;
import com.burntpieceoftoast.steamfoundation.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel 
{
	public ToolSword(String name, ToolMaterial material) 
	{
		super(material);
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
