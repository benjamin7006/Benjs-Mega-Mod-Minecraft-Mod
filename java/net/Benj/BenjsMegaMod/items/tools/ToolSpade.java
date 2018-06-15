package net.Benj.BenjsMegaMod.items.tools;

import net.Benj.BenjsMegaMod.Main;
import net.Benj.BenjsMegaMod.Util.IHasModel;
import net.Benj.BenjsMegaMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel{
	
public ToolSpade(String name, ToolMaterial material, CreativeTabs creativetab) {
		
		super(material);
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
