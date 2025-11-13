package com.atom596.dimstack;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.LoggerFactory;

public class DimStack {
	public static final String MOD_ID = "dimstack";
	public static final String MOD_NAME = "Dimension Stacker";
	public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static void initialize() {}

	public static ResourceLocation resourceLocation(String id) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
	}
}
