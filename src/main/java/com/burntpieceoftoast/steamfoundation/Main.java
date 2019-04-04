package com.burntpieceoftoast.steamfoundation;

import com.burntpieceoftoast.steamfoundation.init.ModRecipes;
import com.burntpieceoftoast.steamfoundation.proxy.CommonProxy;
import com.burntpieceoftoast.steamfoundation.tabs.SteamFoundation;
import com.burntpieceoftoast.steamfoundation.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION )

public class Main {
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs steamfoundation = new SteamFoundation("steam foundation");
	
	@SidedProxy(clientSide= Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	
}