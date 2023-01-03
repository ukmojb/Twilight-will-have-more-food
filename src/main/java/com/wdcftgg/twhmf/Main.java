package com.wdcftgg.twhmf;

import com.wdcftgg.twhmf.Proxy.CommonProxy;
import com.wdcftgg.twhmf.util.Reference;
import com.wdcftgg.twhmf.util.Util;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME , modid = Reference.MODID , version = Reference.VERSION)
public class Main {
    @Mod.Instance
    public static Main instance = new Main();
    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS , clientSide = Reference.CILENT_PROXY_CLASS)
    public static CommonProxy Proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        Util.logger = event.getModLog();
        Util.logger.warn("It's preInit");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        Util.logger.warn("It's init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        Util.logger.warn("It's postInit");
    }
}
