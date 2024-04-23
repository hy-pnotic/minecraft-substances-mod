package net.hyp_notic.substancesmod.item;

import net.hyp_notic.substancesmod.SubstancesMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SubstancesMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SUBSTANCES_TAB = CREATIVE_MODE_TABS.register("substances_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WEED_LEAF.get()))
                    .title(Component.translatable("creativetab.substances_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WEED_LEAF.get());
                        output.accept(ModItems.BLUNT.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
