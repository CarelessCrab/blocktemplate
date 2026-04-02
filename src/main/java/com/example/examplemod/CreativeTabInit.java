package com.example.examplemod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(net.minecraftforge.registries.RegistryObject.of(net.minecraftforge.registries.ForgeRegistries.CREATIVE_MODE_TABS, ExampleMod.MODID), ExampleMod.MODID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = TABS.register("example_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ItemInit.EXAMPLE_BLOCK_ITEM.get()))
                    .title(net.minecraft.network.chat.Component.translatable("itemGroup." + ExampleMod.MODID + ".example_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ItemInit.EXAMPLE_BLOCK_ITEM.get());
                    })
                    .build());
}
