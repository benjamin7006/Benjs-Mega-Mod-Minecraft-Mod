package net.Benj.BenjsMegaMod.world.types;

import net.Benj.BenjsMegaMod.init.BiomeInit;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeTest extends WorldType {

	public WorldTypeTest() {
		super("Test");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world) {
		
		return new BiomeProviderSingle(BiomeInit.TEST);
	}
}
