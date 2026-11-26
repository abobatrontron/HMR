package net.abobatrontron.hmr.creativemodetab;

import net.abobatrontron.hmr.HMR;
import net.abobatrontron.hmr.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import javax.swing.*;

public class ModCreativeModeTabs {
    public static final CreativeModeTab KNOWLEDGE_BOOK_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(HMR.MOD_ID, "rs_ingot_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(Items.KNOWLEDGE_BOOK))
                    .title(Component.translatable( "creativemodetab.hmr.hmr"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ROSE_GOLD_INGOT);
                        output.accept(ModItems.ROSE_GOLD_NUGGET);


                    }).build());

    public static void registerModCreativeModeTabs() {
        HMR.LOGGER.info("Registering Creative Mode Tabs For " + HMR.MOD_ID);
    }
}
