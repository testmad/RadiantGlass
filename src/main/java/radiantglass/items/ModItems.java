package radiantglass.items;

import net.minecraft.item.Item;
import radiantglass.blocks.SolidRadiantGlassBlock;
import radiantglass.util.Registrar;
import radiantglass.util.Strings;

public class ModItems {
	
	public static Item radiantDust;
	
	public static Item coloredDust;
	
	public static void init(){
		
		radiantDust = new RadiantDust();
        Registrar.registerItem(radiantDust);
        
        coloredDust = new ColoredDust().setUnlocalizedName(Strings.ColoredDustName);
		Registrar.registerItem(coloredDust);
        
        
		
	}

}
