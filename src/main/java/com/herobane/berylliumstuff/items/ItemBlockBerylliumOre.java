package com.herobane.berylliumstuff.items;

import com.herobane.berylliumstuff.blocks.BlockBerylliumOre;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBlockBerylliumOre extends ItemBlock {

	public ItemBlockBerylliumOre(Block block) {
		super(block);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}

	@Override
	public int getMetadata(int metadata) {
		return metadata;
	}

	@Override
	public IIcon getIconFromDamage(int metadata) {
		return this.field_150939_a.getIcon(2, metadata);	
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		int metadata = stack.getItemDamage();
		
		if(metadata < 0 || metadata >= BlockBerylliumOre.subBlocks.length) {
			metadata = 0;
		}
		
		return super.getUnlocalizedName() + "." + BlockBerylliumOre.subBlocks[metadata];
		
	}
	
	

}
