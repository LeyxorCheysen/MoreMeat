package com.leyxorcheysen.moremeat.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class RawFlesh extends ItemFood {
	
	public RawFlesh() {
		
		super(2, 2.0F, true);
		
		this.setCreativeTab(CreativeTabs.FOOD);
		this.setRegistryName("raw_flesh");
		this.setUnlocalizedName("raw_flesh");
		
	}

}