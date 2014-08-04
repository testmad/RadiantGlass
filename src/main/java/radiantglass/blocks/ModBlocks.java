package radiantglass.blocks;

import net.minecraft.block.Block;
import radiantglass.items.ItemSolidRadiantGlassBlock;
import radiantglass.items.ItemTransRadiantGlassBlock;
import radiantglass.util.Registrar;
import radiantglass.util.Strings;

public class ModBlocks {
	
	public static Block radiantGlassOre;
	
	public static Block solidRadiantGlassBlock;
	
	public static Block transRadiantGlassBlock;
	
	public static void init(){
		
		radiantGlassOre = new RadiantGlassOre().setBlockName(Strings.RadiantGlassOreName).setHardness(3.0F);
		Registrar.registerBlock(radiantGlassOre);
		
		solidRadiantGlassBlock = new SolidRadiantGlassBlock().setBlockName(Strings.SolidRadiantGlassBlockName);
		Registrar.registerMetaBlock(solidRadiantGlassBlock, ItemSolidRadiantGlassBlock.class);
		
		transRadiantGlassBlock = new TransRadiantGlassBlock().setBlockName(Strings.TransRadiantGlassBlockName);
		Registrar.registerMetaBlock(transRadiantGlassBlock, ItemTransRadiantGlassBlock.class);
		
	}

}
