package net.Benj.BenjsMegaMod.init;

import java.util.ArrayList;
import java.util.List;

import net.Benj.BenjsMegaMod.Main;
import net.Benj.BenjsMegaMod.blocks.BlockBase;
import net.Benj.BenjsMegaMod.blocks.BlockOres;
import net.Benj.BenjsMegaMod.blocks.MetalBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {

		public static final List<Block> BLOCKS = new ArrayList<Block>();
		
		//Blocks
		public static final Block RUBY_BLOCK = new MetalBlock("ruby_block", Material.IRON, Main.mostumBlocksTab);
		public static final Block AMETHYST_BLOCK = new MetalBlock("amethyst_block", Material.IRON, Main.mostumBlocksTab);
		
		//public static final
		
		//Ore Generation (Do Not Edit)
		public static final Block ORE_OVERWORLD = new BlockOres ("ore_overworld", "overworld", Main.mostumOresTab);
		public static final Block ORE_NETHER = new BlockOres ("ore_nether", "nether", Main.mostumOresTab);
		public static final Block ORE_END = new BlockOres ("ore_end", "end", Main.mostumOresTab);
}
