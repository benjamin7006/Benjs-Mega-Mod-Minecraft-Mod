package net.Benj.BenjsMegaMod.world.dimension.magic;

import net.Benj.BenjsMegaMod.init.BiomeInit;
import net.Benj.BenjsMegaMod.init.DimensionInit;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionMagic extends WorldProvider {

	public DimensionMagic() {
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.MAGIC_DIMENSION);
	}

	@Override
	public DimensionType getDimensionType() {
		
		return DimensionInit.MAGIC;
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		
		return new ChunkGeneratorMagic(world, true, world.getSeed());
	}

	@Override
	public boolean canRespawnHere() {
		
		return true;
	}
	
	@Override
	public boolean isSurfaceWorld() {
		
		return false;
		
	}
}
