package net.hyp_notic.substancesmod.item;

import net.hyp_notic.substancesmod.SubstancesMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SubstancesMod.MOD_ID);

    public static final RegistryObject<Item> BLUNT = ITEMS.register("blunt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEED_LEAF = ITEMS.register("weed_leaf",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIGARETTE = ITEMS.register("cigarette",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
