package radiantglass;

import net.minecraft.creativetab.CreativeTabs;
import radiantglass.blocks.ModBlocks;
import radiantglass.creativetab.RadiantGlassTab;
import radiantglass.handlers.RecipeHandler;
import radiantglass.items.ModItems;
import radiantglass.proxy.CommonProxy;
import radiantglass.util.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)
public class RadiantGlass {

	public static CreativeTabs radiantGlassTab;
	
	@Mod.Instance(References.MODID)
	public static RadiantGlass instance;
	
	@SidedProxy(clientSide = References.CLIENTPROXYLOCATION, serverSide = References.COMMONPROXYLOCATION)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		radiantGlassTab = new RadiantGlassTab(CreativeTabs.getNextID(), References.MODID);
		
		ModBlocks.init();
		ModItems.init();
		
		RecipeHandler.init();
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	public static CreativeTabs getcreativeTab() {
		return radiantGlassTab;
	}
}