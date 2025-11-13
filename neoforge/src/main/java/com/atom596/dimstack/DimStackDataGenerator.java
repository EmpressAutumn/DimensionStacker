package com.atom596.dimstack;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = DimStack.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DimStackDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

    }
}
