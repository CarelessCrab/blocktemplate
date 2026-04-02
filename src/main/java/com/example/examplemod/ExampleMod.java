package com.example.examplemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MODID)
public class ExampleMod {
    public static final String MODID = "examplemod";

    public ExampleMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Common setup code
    }

    @SubscribeEvent
    public void onServerStarting(net.minecraftforge.fml.event.server.FMLServerStartingEvent event) {
        // Do something when the server starts
    }
}
