package com.burntpieceoftoast.steamfoundation.init;

import java.util.ArrayList;
import java.util.List;

import com.burntpieceoftoast.steamfoundation.items.ItemBase;
import com.burntpieceoftoast.steamfoundation.items.ItemCustomFood;
import com.burntpieceoftoast.steamfoundation.objects.armour.ArmorBase;
import com.burntpieceoftoast.steamfoundation.objects.tools.ToolAxe;
import com.burntpieceoftoast.steamfoundation.objects.tools.ToolHoe;
import com.burntpieceoftoast.steamfoundation.objects.tools.ToolPickaxe;
import com.burntpieceoftoast.steamfoundation.objects.tools.ToolShovel;
import com.burntpieceoftoast.steamfoundation.objects.tools.ToolSword;
import com.burntpieceoftoast.steamfoundation.objects.armour.ArmorBase;
import com.burntpieceoftoast.steamfoundation.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//items
	public static final Item RAW_AMBER = new ItemBase("raw_amber");
	public static final Item AMBER_INGOT = new ItemBase("amber_ingot");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item DIAMOND_BIT = new ItemBase("diamond_bit");
	public static final Item CRACKED_EGG = new ItemBase("cracked_egg");
	public static final Item COOCKED_EGG = new ItemCustomFood("cooked_egg", 2, false);
	public static final Item COAL_DUST = new ItemBase("coal_dust");
	public static final Item STEEL_DUST = new ItemBase("steel_dust");
	public static final Item IRON_DUST = new ItemBase("iron_dust");
	public static final Item COPPER_COIL = new ItemBase("copper_coil");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	
	//materials
	public static final ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("tool_steel", 2, 700, 6.0F, 4.0F, 12);
	public static final ArmorMaterial ARMOR_STEEL = EnumHelper.addArmorMaterial("armor_steel", Reference.MOD_ID + ":steel", 23, new int[]{3, 6, 7, 3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	
	//tools
	public static final Item STEEL_AXE = new ToolAxe("steel_axe" , TOOL_STEEL);
	public static final Item STEEL_HOE = new ToolHoe("steel_hoe", TOOL_STEEL);
	public static final Item STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", TOOL_STEEL);
	public static final Item STEEL_SHOVEL = new ToolShovel("steel_shovel", TOOL_STEEL);
	public static final Item STEEL_SWORD = new ToolSword("steel_sword", TOOL_STEEL);
	
	//Armor
	public static final Item STEEL_HELMET = new ArmorBase("steel_helmet" , ARMOR_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ArmorBase("steel_chestplate", ARMOR_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ArmorBase("steel_leggings", ARMOR_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ArmorBase("steel_boots", ARMOR_STEEL, 1, EntityEquipmentSlot.FEET);
	
}
