package com.testmad.radiantglassmod.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemSolidRadiantGlassBlock extends ItemBlock{

	final static String[] subBlocks = new String[] {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
	
	public ItemSolidRadiantGlassBlock(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		
		if(i < 0 || i >= subBlocks.length){
			i = 0;
		}
		
		return super.getUnlocalizedName() + "." + subBlocks[i];
	}
	
	public int getMetadata(int meta)
	{
		return meta;
	}

}
