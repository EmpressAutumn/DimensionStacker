package com.atom596.dimstack;

import net.fabricmc.api.ModInitializer;

public class DimStackFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DimStack.initialize();

        DimStack.LOGGER.info("Initialized " + DimStack.MOD_NAME + " by EmpressAutumn");
    }
}
