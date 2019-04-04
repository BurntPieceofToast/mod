package com.burntpieceoftoast.steamfoundation.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.burntpieceoftoast.steamfoundation.init.ModItems;
import com.burntpieceoftoast.steamfoundation.init.ModBlocks;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.RAW_AMBER, new ItemStack(ModItems.AMBER_INGOT), 2);
		GameRegistry.addSmelting(ModItems.CRACKED_EGG, new ItemStack(ModItems.COOCKED_EGG), 2);
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 1);
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE,new ItemStack(ModItems.COPPER_INGOT), 5);
	}
}
