package net.Benj.BenjsMegaMod.init;

import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.world.biomes.BiomeMagic;
import net.Benj.BenjsMegaMod.world.biomes.BiomeTest;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {

	public static final Biome TEST = new BiomeTest();
	public static final Biome MAGIC_DIMENSION = new BiomeMagic();
	
		public static void registerBiomes() {
			initBiome(TEST, "Test", BiomeType.WARM, Type.HILLS, Type.MOUNTAIN, Type.MUSHROOM, Type.DRY);
			initBiome(MAGIC_DIMENSION, "Magic", BiomeType.WARM, Type.PLAINS, Type.DENSE);
		}
		
		private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types) {
			
			biome.setRegistryName(name);
			ForgeRegistries.BIOMES.register(biome);
			System.out.println(Reference.CONSOLE_PERFIX + "Biome Registered");
			BiomeDictionary.addTypes(biome, types);
			BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
			BiomeManager.addSpawnBiome(biome);
			System.out.println(Reference.CONSOLE_PERFIX + "Biome Added");
			return biome;
		}
}
