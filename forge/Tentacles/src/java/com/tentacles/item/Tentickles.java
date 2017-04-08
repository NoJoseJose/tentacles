package com.tentacles.item;

import javax.swing.text.html.parser.Entity;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
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
		net.minecraft.entity.Entity ent = EntityList.createEntityByName("Squid", worldIn);
		if (ent != null)
		{
			EntityLiving entityliving = (EntityLiving) ent;
			ent.setLocationAndAngles(playerIn.posX + 2, playerIn.posY, playerIn.posZ, worldIn.rand.nextFloat() * 360.0F, 0.0F);
			worldIn.spawnEntityInWorld(ent);
		}
		//playerIn.addVelocity(0, 1, 0);
		return ActionResult.newResult(EnumActionResult.SUCCESS, itemStackIn);
	}
	
	
}
