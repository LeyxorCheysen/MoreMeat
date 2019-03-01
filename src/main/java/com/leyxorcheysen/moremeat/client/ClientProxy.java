package com.leyxorcheysen.moremeat.client;

import com.leyxorcheysen.moremeat.common.CommonProxy;
import com.leyxorcheysen.moremeat.init.ItemsInit;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void preInit(FMLPreInitializationEvent event) {
		
        super.preInit(event);
        
    }

    @Override
    public void init(FMLInitializationEvent event) {
    	
        super.init(event);
        
        ItemsInit.registerRender();
        
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
    	
        super.postInit(event);
        
    }

}