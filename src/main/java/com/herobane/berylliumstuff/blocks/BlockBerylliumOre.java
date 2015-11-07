package com.herobane.berylliumstuff.blocks;

import java.util.List;

import com.herobane.berylliumstuff.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockBerylliumOre extends Block {

	public static String[] subBlocks = {"beryllium_ore", "beryllium_ore_nether", "beryllium_ore_end"};
	public IIcon[] iconArray = new IIcon[subBlocks.length];

	public BlockBerylliumOre(Material material) {
		super(material);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		for(int i = 0; i < subBlocks.length; i++) {
			this.iconArray[i] = iconRegister.registerIcon(Main.MODID + ":" + subBlocks[i]);
		}
		
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
		
		for(int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
		
	}

	@Override
	public IIcon getIcon(int side, int metadata) {
		
		if(metadata >= 0 && metadata < subBlocks.length) {
			return this.iconArray[metadata];
		}
		
		return this.iconArray[0];
		
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;	
	}
	
	
	
	

}
