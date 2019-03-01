package com.leyxorcheysen.moremeat.init;

import com.leyxorcheysen.moremeat.items.RawFlesh;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsInit {
	
	public static ItemFood RAW_FLESH = new RawFlesh();
	
	public static void registerItems() {
		
		setRegister(RAW_FLESH);
		
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
    	
    	setRender(RAW_FLESH);
    	
    }

    private static void setRegister(Item item) {
    	
        ForgeRegistries.ITEMS.register(item);
        
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }

}