package net.Benj.BenjsMegaMod.Tabs;

import net.Benj.BenjsMegaMod.init.ModBlocks;
import net.Benj.BenjsMegaMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MostumArmorTab extends CreativeTabs {

	public MostumArmorTab(String label) {
		super("mostuffarmor"); 
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.CHEST_OBSIDIAN);
	}
	
	
}
