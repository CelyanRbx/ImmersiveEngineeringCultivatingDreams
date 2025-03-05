package fr.celyanrbx.immersiveengineeringcultivatingdreams.item;

import fr.celyanrbx.immersiveengineeringcultivatingdreams.ImmersiveEngineeringCultivatingDreams;
import fr.celyanrbx.immersiveengineeringcultivatingdreams.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ImmersiveEngineeringCultivatingDreams.MODID);

    public static final Supplier<CreativeModeTab> COREFORGE_BLOCK_TAB = CREATIVE_MODE_TAB.register("immersive_engineering_cultivating_dreams_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ENDER_PEARL_BLOCK))
                    .title(Component.translatable("creativetab.immersiveengineeringcultivatingdreams.ie_cultivating_dreams"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ENDER_PEARL_BLOCK.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
