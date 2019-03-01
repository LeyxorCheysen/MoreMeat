package com.leyxorcheysen.moremeat;

import com.leyxorcheysen.moremeat.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "moremeat", name = "More Meat", version = "0.0.0", dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true, acceptedMinecraftVersions = "[1.12.2]", modLanguage = "java", updateJSON = "https://raw.githubusercontent.com/LeyxorCheysen/MoreMeat/master/versions.json")
public class MoreMeat {
	
	@Instance
	public static MoreMeat instance;
	
	@SidedProxy(clientSide = "com.leyxorcheysen.moremeat.client.ClientProxy", serverSide = "com.leyxorcheysen.moremeat.common.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	    proxy.preInit(event);
	    
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	    proxy.init(event);
	    
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	    proxy.postInit(event);
	    
	}

}