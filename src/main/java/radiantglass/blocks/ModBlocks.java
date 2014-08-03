package radiantglass.blocks;

import net.minecraft.block.Block;
import radiantglass.util.Registrar;
import radiantglass.util.Strings;

public class ModBlocks {
	
	public static Block radiantGlassOre;
	
	public static void init(){
		
		radiantGlassOre = new RadiantGlassOre().setBlockName(Strings.RadiantGlassOreName).setHardness(3.0F);
		Registrar.registerBlock(radiantGlassOre);
		
	}

}
