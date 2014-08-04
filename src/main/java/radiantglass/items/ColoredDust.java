package radiantglass.items;

import radiantglass.RadiantGlass;
import radiantglass.util.References;
import radiantglass.util.Strings;
import net.minecraft.item.Item;

public class ColoredDust extends Item {
	
	public ColoredDust(){
		
		super();
		
		this.setCreativeTab(RadiantGlass.getcreativeTab());
		
		this.setMaxStackSize(64);
		
		this.setMaxDamage(0);
        this.setHasSubtypes(true);
	}

}
