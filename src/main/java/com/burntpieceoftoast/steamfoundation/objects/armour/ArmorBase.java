package com.burntpieceoftoast.steamfoundation.objects.armour;

import com.burntpieceoftoast.steamfoundation.Main;
import com.burntpieceoftoast.steamfoundation.init.ModItems;
import com.burntpieceoftoast.steamfoundation.util.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item.ToolMaterial;

public class ArmorBase extends ItemArmor implements IHasModel 
{
	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
		{
			super(materialIn, renderIndexIn, equipmentSlotIn);
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
