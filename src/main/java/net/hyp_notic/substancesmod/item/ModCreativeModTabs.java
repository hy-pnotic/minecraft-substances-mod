package net.hyp_notic.substancesmod.item;

import net.hyp_notic.substancesmod.SubstancesMod;
import net.hyp_notic.substancesmod.block.ModBlocks;
import net.minecraft.client.renderer.entity.DisplayRenderer;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Display;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SubstancesMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SUBSTANCES_TAB = CREATIVE_MODE_TABS.register("substances_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WEED_LEAF.get()))
                    .title(Component.translatable("creativetab.substances_tab"))
                    .displayItems((itemDisplayParameters, p0utput) -> {
                        p0utput.accept(ModItems.WEED_LEAF.get());
                        p0utput.accept(ModItems.WEED_BALL.get());
                        p0utput.accept(ModItems.DRIED_TOBACCO.get());
                        p0utput.accept(ModItems.BLUNT.get());
                        p0utput.accept(ModItems.CIGARETTE.get());
                        p0utput.accept(ModBlocks.METH_BLOCK.get());
                        p0utput.accept(ModBlocks.WEED_BLOCK.get());

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
