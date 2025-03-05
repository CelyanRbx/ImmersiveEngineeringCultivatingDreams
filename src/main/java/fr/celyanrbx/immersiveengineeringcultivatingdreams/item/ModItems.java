package fr.celyanrbx.immersiveengineeringcultivatingdreams.item;

import fr.celyanrbx.immersiveengineeringcultivatingdreams.ImmersiveEngineeringCultivatingDreams;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ImmersiveEngineeringCultivatingDreams.MODID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
