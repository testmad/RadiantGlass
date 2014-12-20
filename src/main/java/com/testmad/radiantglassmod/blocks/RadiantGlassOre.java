package com.testmad.radiantglassmod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

import com.testmad.radiantglassmod.RadiantGlassMod;
import com.testmad.radiantglassmod.items.ModItems;
import com.testmad.radiantglassmod.util.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RadiantGlassOre extends Block{
	
	protected RadiantGlassOre()
	{
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setLightLevel(.6F);
		this.useNeighborBrightness = true;
		this.setCreativeTab(RadiantGlassMod.getcreativeTab());
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(References.MODIDLOCAL + ":" + getUnlocalizedName().substring(5));
	}
	
	/**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        return MathHelper.clamp_int(this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(p_149679_1_ + 1), 1, 4);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 2 + p_149745_1_.nextInt(3);
    }
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	return ModItems.radiantDust;
    }

}
