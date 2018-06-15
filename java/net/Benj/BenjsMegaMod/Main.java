package net.Benj.BenjsMegaMod;

import net.Benj.BenjsMegaMod.Tabs.MostumBlocksTab;
import net.Benj.BenjsMegaMod.Tabs.MostumItemsTab;
import net.Benj.BenjsMegaMod.Tabs.MostumToolsTab;
import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.Util.handlers.RegistryHandler;
import net.Benj.BenjsMegaMod.init.ModRecipes;
import net.Benj.BenjsMegaMod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs mostumItemsTab = new MostumItemsTab("mostuffitems");
	public static final CreativeTabs mostumBlocksTab = new MostumBlocksTab("mostuffblocks");
	public static final CreativeTabs mostumToolsTab = new MostumToolsTab("mostufftools");
	public static final CreativeTabs mostumOresTab = new MostumToolsTab("mostuffores");
	public static final CreativeTabs mostumArmorTab = new MostumToolsTab("mostuffarmor");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.CONSOLE_PERFIX + "Pre-Initialization Event Started");
		RegistryHandler.preInitRegistries();
		System.out.println(Reference.CONSOLE_PERFIX + "Pre-Initialization Event Finished");
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		System.out.println(Reference.CONSOLE_PERFIX + "Initialization Event Started");
		ModRecipes.init();
		System.out.println(Reference.CONSOLE_PERFIX + "Initialization Event Finished");
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		System.out.println(Reference.CONSOLE_PERFIX + "Post-Initialization Event Started");
		RegistryHandler.postInitRegistries();
		System.out.println(Reference.CONSOLE_PERFIX + "Post-Initialization Event Finished");
	
	}
}
