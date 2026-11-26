package net.abobatrontron.hmr.item;

import net.abobatrontron.hmr.HMR;
import net.abobatrontron.hmr.creativemodetab.ModCreativeModeTabs;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item ROSE_GOLD_INGOT = registerItem( "rosegoldingot", Item::new);
    public static final Item ROSE_GOLD_NUGGET = registerItem( "rosegoldnugget", Item::new);



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(HMR.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(HMR.MOD_ID, name)))));
    }

    // Code above Registers an Item, or a helper

    public static void registerModItems() {
        HMR.LOGGER.info("Registering Mod Items for " + HMR.MOD_ID);
    }
}
