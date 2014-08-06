package radiantglass.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import radiantglass.RadiantGlass;
import radiantglass.util.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SolidRadiantGlassBlock extends Block{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String[] subBlocks = new String[] {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
	
	public SolidRadiantGlassBlock() {
		super(Material.rock);
		this.setCreativeTab(RadiantGlass.getcreativeTab());
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeGlass);
		
		this.setLightLevel(1.0f);
		this.setLightOpacity(255);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++){
			texture[i] = iconRegister.registerIcon(References.MODID + ":" + subBlocks[i] + getUnlocalizedName().substring(5));
		}
		
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list){
		
		for(int i = 0; i < subBlocks.length; i++){
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return texture[meta];
	}
	
	public int damageDropped(int meta){
		return meta;
	}

}
