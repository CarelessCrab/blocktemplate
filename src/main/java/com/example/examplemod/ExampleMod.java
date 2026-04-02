package com.example.examplemod;

import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.eventbus.api.IEventBus;
import net.neoforged.neoforge.eventbus.api.SubscribeEvent;
import net.neoforged.neoforge.fml.common.Mod;
import net.neoforged.neoforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.event.level.BlockEvent;

@Mod(ExampleMod.MODID)
public class ExampleMod {
    public static final String MODID = "examplemod";

    public ExampleMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::commonSetup);

        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Common setup code
    }

    @SubscribeEvent
    public void onServerStarting(net.neoforged.neoforge.fml.event.server.FMLServerStartingEvent event) {
        // Do something when the server starts
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        // Example: Apply something when any block is broken
        System.out.println("Block broken: " + event.getState().getBlock().getDescriptionId());
    }
}
