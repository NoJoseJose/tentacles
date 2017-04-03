package com.tentacles.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class TentaclesItemBlock extends ItemBlock
{
	protected TentaclesItemBlock(Block block) 
	{
		super(block);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setRegistryName("tentaclesBlock");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}
