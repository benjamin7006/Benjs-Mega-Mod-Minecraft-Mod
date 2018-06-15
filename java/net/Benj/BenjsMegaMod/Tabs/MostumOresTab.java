package net.Benj.BenjsMegaMod.Tabs;

import net.Benj.BenjsMegaMod.init.ModBlocks;
import net.Benj.BenjsMegaMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MostumOresTab extends CreativeTabs {

	public MostumOresTab(String label) {
		super("mostuffores"); 
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.ORE_OVERWORLD));
	}
	
	
}
