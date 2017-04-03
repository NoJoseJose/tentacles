package com.tentacles.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems 
{
	public static Item tenticklesItem;
	
	public static final void init()
	{
		tenticklesItem = new Tentickles();
		GameRegistry.register(tenticklesItem);
	}
}
