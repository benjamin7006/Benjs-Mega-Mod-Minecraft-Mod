package net.Benj.BenjsMegaMod.Tabs;

import net.Benj.BenjsMegaMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MostumItemsTab extends CreativeTabs {

	public MostumItemsTab(String label) {
		super("mostuffitems"); 
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.AMETHYST);
	}
	
	
}
