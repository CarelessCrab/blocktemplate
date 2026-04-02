package com.example.examplemod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.ForgeRegistries;
import net.neoforged.neoforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final CreativeModeTab EXAMPLE_TAB = new CreativeModeTab(ExampleMod.MODID + ".example_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(net.minecraft.world.level.block.Blocks.STONE);
        }
    };

    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties().tab(EXAMPLE_TAB)));
}
