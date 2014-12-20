package com.testmad.radiantglassmod.items;

import net.minecraft.item.Item;

import com.testmad.radiantglassmod.util.Registrar;
import com.testmad.radiantglassmod.util.Strings;

public class ModItems {
	
	public static Item radiantDust;
	public static Item coloredDust;
	
	public static void init()
	{
		radiantDust = new RadiantDust();
		Registrar.registerItem(radiantDust);
		
		coloredDust = new ColoredDust().setUnlocalizedName(Strings.ColoredDustName);
		Registrar.registerItem(coloredDust);
		
	}

}
