package com.testmad.radiantglassmod.items;

import net.minecraft.item.Item;

import com.testmad.radiantglassmod.RadiantGlassMod;
import com.testmad.radiantglassmod.util.References;
import com.testmad.radiantglassmod.util.Strings;

public class RadiantDust extends Item {

	public RadiantDust()
	{
		super();
		this.setUnlocalizedName(Strings.RadiantDustName);
		this.setCreativeTab(RadiantGlassMod.getcreativeTab());
		this.setTextureName(References.MODIDLOCAL + ":" + getUnlocalizedName().substring(5));
		this.setMaxStackSize(64);
	}
}
