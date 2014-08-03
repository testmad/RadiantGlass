package radiantglass.creativetab;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import radiantglass.blocks.ModBlocks;
import radiantglass.items.ModItems;


public class RadiantGlassTab extends CreativeTabs{
	
	public RadiantGlassTab(int id, String modid)
    {
        super(id, modid);
    }
 
    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(ModBlocks.radiantGlassOre);

    }
}
