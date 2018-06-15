package net.Benj.BenjsMegaMod.items.tools;

import net.Benj.BenjsMegaMod.Main;
import net.Benj.BenjsMegaMod.Util.IHasModel;
import net.Benj.BenjsMegaMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	public ToolPickaxe(String name, ToolMaterial material, CreativeTabs creativetab) {
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
