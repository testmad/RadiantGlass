package radiantglass.items;

import net.minecraft.item.Item;
import radiantglass.RadiantGlass;
import radiantglass.util.References;
import radiantglass.util.Strings;

public class RadiantDust extends Item {
	
	public RadiantDust(){
	
		super();
		this.setUnlocalizedName(Strings.RadiantDustName);
		this.setCreativeTab(RadiantGlass.getcreativeTab());
		this.setTextureName(References.MODID + ":" + getUnlocalizedName().substring(5));
		this.setMaxStackSize(64);
	}

}
