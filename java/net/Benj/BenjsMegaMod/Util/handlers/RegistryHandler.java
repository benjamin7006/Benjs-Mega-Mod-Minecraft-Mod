package net.Benj.BenjsMegaMod.Util.handlers;

import net.Benj.BenjsMegaMod.Util.IHasModel;
import net.Benj.BenjsMegaMod.init.BiomeInit;
import net.Benj.BenjsMegaMod.init.DimensionInit;
import net.Benj.BenjsMegaMod.init.ModBlocks;
import net.Benj.BenjsMegaMod.init.ModEntity;
import net.Benj.BenjsMegaMod.init.ModItems;
import net.Benj.BenjsMegaMod.world.gen.WorldGenCustomOres;
import net.Benj.BenjsMegaMod.world.gen.WorldGenCustomStructures;
import net.Benj.BenjsMegaMod.world.types.WorldTypeTest;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ModItems.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries() {
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		BiomeInit.registerBiomes();
		DimensionInit.registerDimensions();
		
		ModEntity.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	public static void postInitRegistries() {
		WorldType TEST = new WorldTypeTest();
	}
}
