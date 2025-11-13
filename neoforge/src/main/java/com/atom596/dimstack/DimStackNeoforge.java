package com.atom596.dimstack;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(DimStack.MOD_ID)
public class DimStackNeoforge {
    public DimStackNeoforge(IEventBus eventBus) {
        DimStack.initialize();
        DimStack.LOGGER.info("Initialized " + DimStack.MOD_NAME + " by EmpressAutumn");
    }
}
