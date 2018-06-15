package net.Benj.BenjsMegaMod.Tabs;

import net.Benj.BenjsMegaMod.init.ModBlocks;
import net.Benj.BenjsMegaMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MostumToolsTab extends CreativeTabs {

	public MostumToolsTab(String label) {
		super("mostufftools"); 
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.OBSIDIAN_SWORD);
	}
	
	
}
