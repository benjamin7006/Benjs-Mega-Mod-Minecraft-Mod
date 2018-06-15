package net.Benj.BenjsMegaMod.blocks;

import net.Benj.BenjsMegaMod.Main;
import net.Benj.BenjsMegaMod.Util.IHasModel;
import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.init.ModBlocks;
import net.Benj.BenjsMegaMod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material, CreativeTabs creativetab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativetab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	


	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}}
