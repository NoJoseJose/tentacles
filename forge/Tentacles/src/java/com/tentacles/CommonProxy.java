package com.tentacles;

import com.tentacles.block.ModBlocks;
import com.tentacles.item.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent e)
	{		
		ModItems.init();
		ModBlocks.init();
	}
	public void init(FMLInitializationEvent e)
	{		
	}
	public void postInit(FMLPostInitializationEvent e)
	{
	}
}