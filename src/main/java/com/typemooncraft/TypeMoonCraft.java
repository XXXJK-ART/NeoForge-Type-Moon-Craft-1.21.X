package com.typemooncraft;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/** Entry point for the Type-Moon-Craft mod. */
@Mod(TypeMoonCraft.MOD_ID)
public final class TypeMoonCraft {
    public static final String MOD_ID = "typemooncraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TypeMoonCraft(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Type-Moon-Craft initialized");
    }
}
