package net.Benj.BenjsMegaMod.items;

import ibxm.Player;
import net.Benj.BenjsMegaMod.Main;
import net.Benj.BenjsMegaMod.Util.IHasModel;
import net.Benj.BenjsMegaMod.Util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.Template.EntityInfo;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class MagicDimTeleportItem extends ItemBase {

	public MagicDimTeleportItem(String name, CreativeTabs creativeTab) {
		super(name, creativeTab);
		
		setMaxStackSize(1);
		
	}
	
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		 ItemStack itemstack = playerIn.getHeldItem(handIn);
		 
		 if(playerIn.dimension == Reference.DIMENSION_MAGIC_ID) {
			 playerIn.changeDimension(0);
		 } else {
			 playerIn.changeDimension(Reference.DIMENSION_MAGIC_ID);
		 }
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
