package radiantglass.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import radiantglass.RadiantGlass;
import radiantglass.util.References;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class TransRadiantStair extends BlockStairs {

	private int metadata;
	private Block block;
	
	public TransRadiantStair(Block block, int meta) {
		super(block, 0);
		
		this.block = block;
		this.metadata = meta;
		
		this.setCreativeTab(RadiantGlass.getcreativeTab());
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeGlass);
		
		this.setLightLevel(1.0f);
		this.setLightOpacity(255);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return block.getIcon(side, metadata);
	}
}
