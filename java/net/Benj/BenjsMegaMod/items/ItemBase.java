package net.Benj.BenjsMegaMod.items;

import net.Benj.BenjsMegaMod.Main;
import net.Benj.BenjsMegaMod.Util.IHasModel;
import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name, CreativeTabs creativetab) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativetab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
