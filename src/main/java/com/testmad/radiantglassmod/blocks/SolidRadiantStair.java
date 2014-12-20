package com.testmad.radiantglassmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.testmad.radiantglassmod.RadiantGlassMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SolidRadiantStair extends BlockStairs{
	
	private int metadata;
	private Block block;
	
	public SolidRadiantStair(Block block, int meta)
	{
		super(block, 0);
		
		this.block = block;
		this.metadata = meta;
		
		this.setCreativeTab(RadiantGlassMod.getcreativeTab());
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeGlass);
		
		this.setLightLevel(1.0F);
		this.setLightOpacity(255);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return block.getIcon(side, metadata);
	}

}
