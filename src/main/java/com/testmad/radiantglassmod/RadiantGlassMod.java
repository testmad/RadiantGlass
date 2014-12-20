package com.testmad.radiantglassmod;

import net.minecraft.creativetab.CreativeTabs;

import com.testmad.radiantglassmod.blocks.ModBlocks;
import com.testmad.radiantglassmod.creativetab.RadiantGlassTab;
import com.testmad.radiantglassmod.handlers.RecipeHandler;
import com.testmad.radiantglassmod.items.ModItems;
import com.testmad.radiantglassmod.proxy.CommonProxy;
import com.testmad.radiantglassmod.util.References;
import com.testmad.radiantglassmod.worldgen.RadiantGlassWorldGen;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)
public class RadiantGlassMod {
	
	public static CreativeTabs radiantGlassTab;
	
	RadiantGlassWorldGen eventWorldGen = new RadiantGlassWorldGen();
	
	@Mod.Instance(References.MODID)
	public static RadiantGlassMod instance;
	
	@SidedProxy(clientSide = References.CLIENTPROXYLOCATION, serverSide = References.COMMONPROXYLOCATION)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		radiantGlassTab = new RadiantGlassTab(CreativeTabs.getNextID(), References.MODID);
		
		ModBlocks.init();
		ModItems.init();
		
		RecipeHandler.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs getcreativeTab()
	{
		return radiantGlassTab;
	}

}
