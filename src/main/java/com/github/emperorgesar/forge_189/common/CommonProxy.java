package com.github.emperorgesar.forge_189.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.github.emperorgesar.forge_189.entity.EntityLoader;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        new EntityLoader();
    }

    public void init(FMLInitializationEvent event)
    {
        new EventLoader();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
