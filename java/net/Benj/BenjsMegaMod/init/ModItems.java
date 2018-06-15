package net.Benj.BenjsMegaMod.init;

import java.util.ArrayList;
import java.util.List;

import net.Benj.BenjsMegaMod.Main;
import net.Benj.BenjsMegaMod.Tabs.MostumArmorTab;
import net.Benj.BenjsMegaMod.Tabs.MostumItemsTab;
import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.armor.ArmorBase;
import net.Benj.BenjsMegaMod.items.ItemBase;
import net.Benj.BenjsMegaMod.items.MagicDimTeleportItem;
import net.Benj.BenjsMegaMod.items.tools.ToolAxe;
import net.Benj.BenjsMegaMod.items.tools.ToolBow;
import net.Benj.BenjsMegaMod.items.tools.ToolHoe;
import net.Benj.BenjsMegaMod.items.tools.ToolPickaxe;
import net.Benj.BenjsMegaMod.items.tools.ToolSpade;
import net.Benj.BenjsMegaMod.items.tools.ToolSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Tool Materials
	//                              EnumHelper.addToolMaterial("name", harvest_level, maxUses, efficiency, damage, enchantability);
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 2341, 16.0F, 4.0F, 10);
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 3, 1311, 8.0F, 2.0F, 10);
	
	//Armor Materials
	public static final ArmorMaterial ARMOR_OBSIDIAN = EnumHelper.addArmorMaterial("armor_obsidian", Reference.MOD_ID + ":obsidian" , 50, new int[] {8, 8, 8, 8}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON , 5.0f);
	public static final ArmorMaterial ARMOR_RUBY = EnumHelper.addArmorMaterial("armor_ruby", Reference.MOD_ID + ":ruby" , 35, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON , 1.0f);
	public static final ArmorMaterial ARMOR_AMETHYST = EnumHelper.addArmorMaterial("armor_amethyst", Reference.MOD_ID + ":amethyst" , 30, new int[]{4, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	
	//Items
	public static final Item OBSIDIAN_DUST = new ItemBase("obsidian_dust", Main.mostumItemsTab);
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot", Main.mostumItemsTab);
	public static final Item RUBY = new ItemBase("ruby", Main.mostumItemsTab);
	public static final Item AMETHYST = new ItemBase("amethyst", Main.mostumItemsTab);
	public static final Item MAGIC_DUST = new ItemBase("magic_dust", Main.mostumItemsTab);
	
	//Obsidian Tools
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN, Main.mostumToolsTab);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN, Main.mostumToolsTab);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN, Main.mostumToolsTab);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN, Main.mostumToolsTab);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN, Main.mostumToolsTab);
	
	//Ruby Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY, Main.mostumToolsTab);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY, Main.mostumToolsTab);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY, Main.mostumToolsTab);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY, Main.mostumToolsTab);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY, Main.mostumToolsTab);
	
	//Amethyst Tools
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL_AMETHYST, Main.mostumToolsTab);
	public static final ItemPickaxe AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", MATERIAL_AMETHYST, Main.mostumToolsTab);
	public static final ItemAxe AMETHYST_AXE = new ToolAxe("amethyst_axe", MATERIAL_AMETHYST, Main.mostumToolsTab);
	public static final ItemSpade AMETHYST_SHOVEL = new ToolSpade("amethyst_shovel", MATERIAL_AMETHYST, Main.mostumToolsTab);
	public static final ItemHoe AMETHYST_HOE = new ToolHoe("amethyst_hoe", MATERIAL_AMETHYST, Main.mostumToolsTab);
	public static final ItemBow AMETHYST_BOW = new ToolBow("amethyst_bow", Main.mostumToolsTab);
	
	//Amethyst Armor
	public static final Item HELMET_AMETHYST = new ArmorBase("amethyst_helmet", ARMOR_AMETHYST, 1, EntityEquipmentSlot.HEAD, Main.mostumArmorTab);
	public static final Item CHEST_AMETHYST = new ArmorBase("amethyst_chest", ARMOR_AMETHYST, 1, EntityEquipmentSlot.CHEST, Main.mostumArmorTab);
	public static final Item LEGGINGS_AMETHYST = new ArmorBase("amethyst_leggings", ARMOR_AMETHYST, 1, EntityEquipmentSlot.LEGS, Main.mostumArmorTab);
	public static final Item BOOTS_AMETHYST = new ArmorBase("amethyst_boots", ARMOR_AMETHYST, 1, EntityEquipmentSlot.FEET, Main.mostumArmorTab);
	
	//Obsidian Armor 
	public static final Item HELMET_OBSIDIAN = new ArmorBase("obsidian_helmet", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.HEAD, Main.mostumArmorTab);
	public static final Item CHEST_OBSIDIAN = new ArmorBase("obsidian_chest", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.CHEST, Main.mostumArmorTab);
	public static final Item LEGGINGS_OBSIDIAN = new ArmorBase("obsidian_leggings", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.LEGS, Main.mostumArmorTab);
	public static final Item BOOTS_OBSIDIAN = new ArmorBase("obsidian_boots", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.FEET, Main.mostumArmorTab);
	
	//Obsidian Armor 
	public static final Item HELMET_RUBY = new ArmorBase("ruby_helmet", ARMOR_RUBY, 1, EntityEquipmentSlot.HEAD, Main.mostumArmorTab);
	public static final Item CHEST_RUBY = new ArmorBase("ruby_chest", ARMOR_RUBY, 1, EntityEquipmentSlot.CHEST, Main.mostumArmorTab);
	public static final Item LEGGINGS_RUBY = new ArmorBase("ruby_leggings", ARMOR_RUBY, 1, EntityEquipmentSlot.LEGS, Main.mostumArmorTab);
	public static final Item BOOTS_RUBY = new ArmorBase("ruby_boots", ARMOR_RUBY, 1, EntityEquipmentSlot.FEET, Main.mostumArmorTab);
	
	//Cheat Items
	public static final Item MAGIC_DIM_TELEPORTER = new MagicDimTeleportItem("magic_dim_tp", Main.mostumItemsTab);
	
	
}
