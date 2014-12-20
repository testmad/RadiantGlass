package com.testmad.radiantglassmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.testmad.radiantglassmod.items.ModItems;

public class RadiantGlassTab extends CreativeTabs{
	
	public RadiantGlassTab(int id, String modid)
	{
		super(id, modid);
	}
	
	@Override
	public Item getTabIconItem()
	{
		return ModItems.radiantDust;
	}

}
