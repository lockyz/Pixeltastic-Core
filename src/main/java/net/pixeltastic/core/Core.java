package net.pixeltastic.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.pixeltastic.core.init.ModItems;
import net.pixeltastic.core.init.ModRecipes;

import org.apache.logging.log4j.Logger;

@Mod(modid = Core.MODID, name = Core.NAME, version = Core.VERSION)
public class Core
{
    public static final String MODID = "pixeltastic";
    public static final String NAME = "PixelTastic Core";
    public static final String VERSION = "1.1.1.0";

    private static Logger logger;
    
    @Instance
    public static Core instance;
    
    //public static Item badge1;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	System.out.println(MODID + ":preInit");
        logger = event.getModLog();
        ModItems.init();
        ModRecipes.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	System.out.println(MODID + ":init");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	System.out.println(MODID + ":postInit");
    }
}
