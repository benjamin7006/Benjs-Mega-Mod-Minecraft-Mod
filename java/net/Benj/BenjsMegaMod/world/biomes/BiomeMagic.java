package net.Benj.BenjsMegaMod.world.biomes;

import net.Benj.BenjsMegaMod.Util.handlers.EnumHandler;
import net.Benj.BenjsMegaMod.blocks.BlockOres;
import net.Benj.BenjsMegaMod.entity.EntityDevilcorn;
import net.Benj.BenjsMegaMod.entity.EntityUnicorn;
import net.Benj.BenjsMegaMod.init.ModBlocks;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeMagic extends Biome {
	
	public BiomeMagic() {
		super(new BiomeProperties("Magic").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.8F).setRainDisabled().setWaterColor(8323072));

		topBlock = ModBlocks.AMETHYST_BLOCK.getDefaultState();
		fillerBlock = Blocks.GRASS.getDefaultState();
		
		this.decorator.coalGen = new WorldGenMinable(ModBlocks.RUBY_BLOCK.getDefaultState(), 10);
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityUnicorn.class, 10, 1, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityDevilcorn.class, 5, 1, 5));
	}

}
