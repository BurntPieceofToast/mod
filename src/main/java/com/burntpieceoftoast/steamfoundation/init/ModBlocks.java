package com.burntpieceoftoast.steamfoundation.init;

import java.util.ArrayList;
import java.util.List;

import com.burntpieceoftoast.steamfoundation.blocks.AmberOre;
import com.burntpieceoftoast.steamfoundation.blocks.BlockBase;
import com.burntpieceoftoast.steamfoundation.blocks.CarrotBlock;
import com.burntpieceoftoast.steamfoundation.blocks.CopperOre;
import com.burntpieceoftoast.steamfoundation.blocks.GrinderBlock;
import com.burntpieceoftoast.steamfoundation.blocks.RawAmberBlock;
import com.burntpieceoftoast.steamfoundation.blocks.RefinedAmberBlock;
//import com.burntpieceoftoast.steamfoundation.util.BlockOres;
import com.burntpieceoftoast.steamfoundation.util.BlockOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block AMBER_ORE = new AmberOre("amber_ore", Material.SNOW);
	public static final Block RAW_AMBER_BLOCK = new RawAmberBlock("raw_amber_block", Material.SNOW);
	public static final Block REFINED_AMBER_BLOCK = new RefinedAmberBlock("refined_amber_block", Material.IRON);
	public static final Block GRINDER_BLOCK = new GrinderBlock("grinder_block");
	public static final Block CARROT_BLOCK = new CarrotBlock("carrot_block");
	public static final Block COPPER_ORE = new CopperOre ("copper_ore", Material.IRON);

	
	//public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	//public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
}