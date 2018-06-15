package net.Benj.BenjsMegaMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MetalBlock extends BlockBase {

	public MetalBlock(String name, Material material, CreativeTabs creativetab) {
		super(name, material, creativetab);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}

}
