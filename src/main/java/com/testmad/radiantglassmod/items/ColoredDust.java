package com.testmad.radiantglassmod.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.testmad.radiantglassmod.RadiantGlassMod;
import com.testmad.radiantglassmod.util.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ColoredDust extends Item{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String[] subItems = new String[] {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
	
	public ColoredDust()
	{
		super();
		
		this.setCreativeTab(RadiantGlassMod.getcreativeTab());
		this.setHasSubtypes(true);
		
		this.setMaxDamage(0);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		texture = new IIcon[subItems.length];
		
		for(int i = 0; i < subItems.length; i++){
			texture[i] = iconRegister.registerIcon(References.MODIDLOCAL + ":" + subItems[i] + getUnlocalizedName().substring(5));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list){
		
		for(int i = 0; i < subItems.length; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int meta){
		return texture[meta];
	}

	public String getUnlocalizedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		
		if(i < 0 || i >= subItems.length){
			i = 0;
		}
		
		return super.getUnlocalizedName() + "." + subItems[i];
	}
	

	public int getMetadata(int meta){
		return meta;
	}

}
