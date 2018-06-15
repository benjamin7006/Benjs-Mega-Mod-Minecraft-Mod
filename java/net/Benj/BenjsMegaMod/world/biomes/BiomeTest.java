package net.Benj.BenjsMegaMod.world.biomes;

import net.Benj.BenjsMegaMod.Util.handlers.EnumHandler;
import net.Benj.BenjsMegaMod.blocks.BlockOres;
import net.Benj.BenjsMegaMod.entity.EntityDevilcorn;
import net.Benj.BenjsMegaMod.entity.EntityUnicorn;
import net.Benj.BenjsMegaMod.init.ModBlocks;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeTest extends Biome {

	public BiomeTest() {
		super(new BiomeProperties("Test").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.2F).setRainDisabled().setWaterColor(8323072));

		topBlock = ModBlocks.AMETHYST_BLOCK.getDefaultState();
		fillerBlock = ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIENT, EnumHandler.EnumType.RUBY);
		
		this.decorator.coalGen = new WorldGenMinable(ModBlocks.RUBY_BLOCK.getDefaultState(), 10);
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityUnicorn.class, 10, 1, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityDevilcorn.class, 10, 1, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 10, 1, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWither.class, 5, 1, 1));
		
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 10, 1, 5));
	}

}
