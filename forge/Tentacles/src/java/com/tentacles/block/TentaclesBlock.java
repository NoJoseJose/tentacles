package com.tentacles.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TentaclesBlock extends Block
{
	protected TentaclesBlock(String unlocalizedName, Material materialIn) 
	{
		super(materialIn);
		this.setHarvestLevel("pickaxe", 1);
		this.setUnlocalizedName("tentacles");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setRegistryName("tentaclesBlock");
	}
	
}
