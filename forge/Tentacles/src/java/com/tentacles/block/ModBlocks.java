package com.tentacles.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	public static Block tentaclesBlock;
		
	public static final void init()
	{
		GameRegistry.register(tentaclesBlock = new TentaclesBlock("tentaclesBlock", Material.GRASS));
	}
}
