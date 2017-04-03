package com.tentacles.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	public static Block tentaclesBlock;
	public static ItemBlock tentaclesItemBlock;
		
	public static final void init()
	{
		tentaclesBlock = new TentaclesBlock("tentaclesBlock", Material.GRASS);
		tentaclesItemBlock = new TentaclesItemBlock(tentaclesBlock);
		GameRegistry.register(tentaclesBlock);
		GameRegistry.register(tentaclesItemBlock);
	}
}
