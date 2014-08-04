package radiantglass.items;

import net.minecraft.item.Item;
import radiantglass.util.Registrar;

public class ModItems {
	
	public static Item radiantDust;
	
	//public static Item coloredDust;
	
	public static void init(){
		
		radiantDust = new RadiantDust();
        Registrar.registerItem(radiantDust);
        
        //coloredDust = new ColoredDust();
        //Registrar.registerItem(coloredDust);
        
        
		
	}

}
