package net.Benj.BenjsMegaMod.armor;

import net.Benj.BenjsMegaMod.Main;
import net.Benj.BenjsMegaMod.Util.IHasModel;
import net.Benj.BenjsMegaMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs creativetab) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
			
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
