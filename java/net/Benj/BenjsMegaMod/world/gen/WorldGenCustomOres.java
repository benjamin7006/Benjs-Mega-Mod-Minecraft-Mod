package net.Benj.BenjsMegaMod.world.gen;

import java.util.Random;

import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.Util.handlers.EnumHandler;
import net.Benj.BenjsMegaMod.blocks.BlockOres;
import net.Benj.BenjsMegaMod.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator {
	
	private WorldGenerator ore_overworld_ruby, ore_nether_ruby, ore_end_ruby;
	private WorldGenerator ore_overworld_amethyst, ore_nether_amethyst, ore_end_amethyst;
	
	public WorldGenCustomOres() {
		
		//Ruby
		ore_overworld_ruby = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIENT, EnumHandler.EnumType.RUBY), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_nether_ruby = new WorldGenMinable(ModBlocks.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIENT, EnumHandler.EnumType.RUBY), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_end_ruby = new WorldGenMinable(ModBlocks.ORE_END.getDefaultState().withProperty(BlockOres.VARIENT, EnumHandler.EnumType.RUBY), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		
		//Amethyst
		ore_overworld_amethyst = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIENT, EnumHandler.EnumType.AMETHYST), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_nether_amethyst = new WorldGenMinable(ModBlocks.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIENT, EnumHandler.EnumType.AMETHYST), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_end_amethyst = new WorldGenMinable(ModBlocks.ORE_END.getDefaultState().withProperty(BlockOres.VARIENT, EnumHandler.EnumType.AMETHYST), 9, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case -1: 
			
			//runGenrator(Ore, *world*, *random*, *chunkX*, *chunkZ*, chance, minHeight, maxHeight);
			runGenerator(ore_nether_ruby, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_nether_amethyst, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 0: 
			
			//runGenrator(Ore, *world*, *random*, *chunkX*, *chunkZ*, chance, minHeight, maxHeight);
			runGenerator(ore_overworld_ruby, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_overworld_amethyst, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 1: 
			
			//runGenrator(Ore, *world*, *random*, *chunkX*, *chunkZ*, chance, minHeight, maxHeight);
			runGenerator(ore_end_ruby, world, random, chunkX, chunkZ, 50, 0, 256);
			runGenerator(ore_end_amethyst, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException(Reference.CONSOLE_PERFIX + " ERROR: Ore Generated Out Of Bounds");
		
		int heightDiff = maxHeight -  minHeight + 1;
		for(int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
