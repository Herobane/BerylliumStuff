package com.herobane.berylliumstuff.items;

import com.herobane.berylliumstuff.Main;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBerylliumArmor extends ItemArmor {

	public ItemBerylliumArmor(ArmorMaterial material, int type) {
		super(material, 0, type);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(slot == 2) {
			return Main.MODID + ":textures/models/armors/beryllium_layer_2.png";
		}
		
		return Main.MODID + ":textures/models/armors/beryllium_layer_1.png";
		
	}
	
}
