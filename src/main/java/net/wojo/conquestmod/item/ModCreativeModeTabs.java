package net.wojo.conquestmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wojo.conquestmod.ConquestMod;
import net.wojo.conquestmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ConquestMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CONQUEST_MOD_TAB = CREATIVE_MODE_TABS.register("conquest_mod_tab",
        () ->CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TIN_CLUMP.get()))
                .title(Component.translatable("creativetab.conquest_mod_tab"))
                .displayItems((Parameters, Output) -> {
                    Output.accept(ModItems.TIN_CLUMP.get());
                    Output.accept(ModItems.RAW_TIN.get());
                    Output.accept(ModItems.TIN_INGOT.get());
                    Output.accept(ModItems.TIN_NUGGET.get());



                    Output.accept(ModBlocks.TIN_BLOCK.get());
                    Output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
