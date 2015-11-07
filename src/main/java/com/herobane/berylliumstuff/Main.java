package com.herobane.berylliumstuff;

import com.herobane.berylliumstuff.blocks.BlockBeryllium;
import com.herobane.berylliumstuff.blocks.BlockBerylliumOre;
import com.herobane.berylliumstuff.generation.BerylliumOreGenerator;
import com.herobane.berylliumstuff.items.ItemBerylliumArmor;
import com.herobane.berylliumstuff.items.ItemBerylliumAxe;
import com.herobane.berylliumstuff.items.ItemBerylliumHoe;
import com.herobane.berylliumstuff.items.ItemBerylliumIngot;
import com.herobane.berylliumstuff.items.ItemBerylliumPickaxe;
import com.herobane.berylliumstuff.items.ItemBerylliumSpade;
import com.herobane.berylliumstuff.items.ItemBerylliumSword;
import com.herobane.berylliumstuff.items.ItemBlockBerylliumOre;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	
    public static final String MODID = "BerylliumStuff";
    public static final String VERSION = "Alpha 1.0";
    
    public static ToolMaterial berylliumMaterial = EnumHelper.addToolMaterial("beryllium", 2, 999, 7.0F, 2.0F, 15);
    public static ArmorMaterial berylliumArmorMaterial = EnumHelper.addArmorMaterial("beryllium_armor", 25, new int[]{2, 6, 5, 2}, 15);
    
    // Items
    public static Item berylliumSword;
    public static Item berylliumPickaxe;
    public static Item berylliumAxe;
    public static Item berylliumSpade;
    public static Item berylliumHoe;
    public static Item berylliumIngot;
    
    // Armors
    public static Item berylliumHelmet;
    public static Item berylliumChestplate;
    public static Item berylliumLeggings;
    public static Item berylliumBoots;
    
    // Blocks
    public static Block berylliumOre;
    public static Block berylliumBlock;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	// Items initialization
    	berylliumSword = new ItemBerylliumSword(berylliumMaterial)
    			.setUnlocalizedName("beryllium_sword")
    			.setCreativeTab(CreativeTabs.tabCombat)
    			.setTextureName(MODID + ":beryllium_sword");
    	
    	berylliumPickaxe = new ItemBerylliumPickaxe(berylliumMaterial)
    			.setUnlocalizedName("beryllium_pickaxe")
    			.setCreativeTab(CreativeTabs.tabTools)
    			.setTextureName(MODID + ":beryllium_pickaxe");
    	
    	berylliumAxe = new ItemBerylliumAxe(berylliumMaterial)
    			.setUnlocalizedName("beryllium_axe")
    			.setCreativeTab(CreativeTabs.tabTools)
    			.setTextureName(MODID + ":beryllium_axe");
    	
    	berylliumSpade = new ItemBerylliumSpade(berylliumMaterial)
    			.setUnlocalizedName("beryllium_spade")
    			.setCreativeTab(CreativeTabs.tabTools)
    			.setTextureName(MODID + ":beryllium_spade");
    	
    	berylliumHoe = new ItemBerylliumHoe(berylliumMaterial)
    			.setUnlocalizedName("beryllium_hoe")
    			.setCreativeTab(CreativeTabs.tabTools)
    			.setTextureName(MODID + ":beryllium_hoe");
    	
    	berylliumIngot = new ItemBerylliumIngot()
    			.setUnlocalizedName("beryllium_ingot")
    			.setCreativeTab(CreativeTabs.tabMaterials)
    			.setTextureName(MODID + ":beryllium_ingot");
    	
    	// Armors initialization
    	berylliumHelmet = new ItemBerylliumArmor(berylliumArmorMaterial, 0)
    			.setUnlocalizedName("beryllium_helmet")
    			.setCreativeTab(CreativeTabs.tabCombat)
    			.setTextureName(MODID + ":beryllium_helmet");
    	
    	berylliumChestplate = new ItemBerylliumArmor(berylliumArmorMaterial, 1)
    			.setUnlocalizedName("beryllium_chestplate")
    			.setCreativeTab(CreativeTabs.tabCombat)
    			.setTextureName(MODID + ":beryllium_chestplate");
    	
    	berylliumLeggings = new ItemBerylliumArmor(berylliumArmorMaterial, 2)
    			.setUnlocalizedName("beryllium_leggings")
    			.setCreativeTab(CreativeTabs.tabCombat)
    			.setTextureName(MODID + ":beryllium_leggings");
    	
    	berylliumBoots = new ItemBerylliumArmor(berylliumArmorMaterial, 3)
    			.setUnlocalizedName("beryllium_boots")
    			.setCreativeTab(CreativeTabs.tabCombat)
    			.setTextureName(MODID + ":beryllium_boots");
    	
    	// Blocks initialization
    	berylliumOre = new BlockBerylliumOre(Material.rock)
    			.setHardness(3.0F)
    			.setBlockTextureName(MODID + ":beryllium_ore")
    			.setBlockName("beryllium_ore")
    			.setCreativeTab(CreativeTabs.tabBlock);
    	
    	berylliumBlock = new BlockBeryllium(Material.iron)
    			.setHardness(3.0F)
    			.setBlockTextureName(MODID + ":beryllium_block")
    			.setBlockName("beryllium_block")
    			.setCreativeTab(CreativeTabs.tabBlock);
    
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	// Items registration
		GameRegistry.registerItem(berylliumSword, "beryllium_sword");
		GameRegistry.registerItem(berylliumPickaxe, "beryllium_pickaxe");
		GameRegistry.registerItem(berylliumAxe, "beryllium_axe");
		GameRegistry.registerItem(berylliumSpade, "beryllium_spade");
		GameRegistry.registerItem(berylliumHoe, "beryllium_hoe");
		GameRegistry.registerItem(berylliumIngot, "beryllium_ingot");
		
		// Armors registration
		GameRegistry.registerItem(berylliumHelmet, "beryllium_helmet");
		GameRegistry.registerItem(berylliumChestplate, "beryllium_chestplate");
		GameRegistry.registerItem(berylliumLeggings, "beryllium_leggings");
		GameRegistry.registerItem(berylliumBoots, "beryllium_boots");
		
		// Blocks registration
		GameRegistry.registerBlock(berylliumOre, ItemBlockBerylliumOre.class, "beryllium_ore");
		GameRegistry.registerBlock(berylliumBlock, "beryllium_block");
		
		// WorldGenerator registration
		GameRegistry.registerWorldGenerator(new BerylliumOreGenerator(), 0);
		
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    	// Crafts registration
    	GameRegistry.addRecipe(new ItemStack(berylliumSword), 
    		"b",
    		"b",
    		"s", 'b', berylliumIngot, 's', Items.stick
    			);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumPickaxe), 
    		"bbb",
    		" s ",
    		" s ", 'b', berylliumIngot, 's', Items.stick
    			);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumAxe), 
    		"bb",
    		"bs",
    		" s", 'b', berylliumIngot, 's', Items.stick
    			);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumAxe), 
        	"bb",
        	"sb",
        	"s ", 'b', berylliumIngot, 's', Items.stick
        		);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumSpade), 
    		"b",
    		"s",
    		"s", 'b', berylliumIngot, 's', Items.stick
    			);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumHoe), 
    		"bb",
    		" s",
    		" s", 'b', berylliumIngot, 's', Items.stick
    			);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumHoe), 
        	"bb",
        	"s ",
        	"s ", 'b', berylliumIngot, 's', Items.stick
        		);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumHelmet), 
    		"bbb",
    		"b b", 'b', berylliumIngot
    			);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumChestplate), 
    		"b b",
    		"bbb",
    		"bbb", 'b', berylliumIngot
    			);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumLeggings), 
    		"bbb",
    		"b b",
    		"b b", 'b', berylliumIngot
    			);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumBoots), 
    		"b b",
    		"b b", 'b', berylliumIngot
    			);
    	
    	GameRegistry.addRecipe(new ItemStack(berylliumBlock), 
    		"bbb",
    		"bbb",
    		"bbb", 'b', berylliumIngot
    			);
    	
    	// Smeltings registration
    	GameRegistry.addSmelting(berylliumOre, new ItemStack(berylliumIngot), 1.0F);
    	
    }
    
}
