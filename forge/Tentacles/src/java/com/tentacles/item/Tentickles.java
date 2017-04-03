package com.tentacles.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Tentickles extends Item
{
	public Tentickles()
	{
		super();
		this.setUnlocalizedName("Tentickles");
		this.setCreativeTab(CreativeTabs.MISC);
		this.setRegistryName("Tentickles");
	}
	
	/*
	@Override
	public EnumActionResult onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand)
	{
		player.addVelocity(0, 1, 0);
		return EnumActionResult.SUCCESS;
	}
	*/
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
	{
		playerIn.addVelocity(0, 1, 0);
		return ActionResult.newResult(EnumActionResult.SUCCESS, itemStackIn);
	}
	
	
}
