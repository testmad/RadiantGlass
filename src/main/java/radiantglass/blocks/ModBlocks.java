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

	public static Block blackSolidRadiantGlassStair;
	public static Block redSolidRadiantGlassStair;
	public static Block greenSolidRadiantGlassStair;
	public static Block brownSolidRadiantGlassStair;
	public static Block blueSolidRadiantGlassStair;
	public static Block purpleSolidRadiantGlassStair;
	public static Block cyanSolidRadiantGlassStair;
	public static Block silverSolidRadiantGlassStair;
	public static Block graySolidRadiantGlassStair;
	public static Block pinkSolidRadiantGlassStair;
	public static Block limeSolidRadiantGlassStair;
	public static Block yellowSolidRadiantGlassStair;
	public static Block lightBlueSolidRadiantGlassStair;
	public static Block magentaSolidRadiantGlassStair;
	public static Block orangeSolidRadiantGlassStair;
	public static Block whiteSolidRadiantGlassStair;
	
	public static Block blackTransRadiantGlassStair;
	public static Block redTransRadiantGlassStair;
	public static Block greenTransRadiantGlassStair;
	public static Block brownTransRadiantGlassStair;
	public static Block blueTransRadiantGlassStair;
	public static Block purpleTransRadiantGlassStair;
	public static Block cyanTransRadiantGlassStair;
	public static Block silverTransRadiantGlassStair;
	public static Block grayTransRadiantGlassStair;
	public static Block pinkTransRadiantGlassStair;
	public static Block limeTransRadiantGlassStair;
	public static Block yellowTransRadiantGlassStair;
	public static Block lightBlueTransRadiantGlassStair;
	public static Block magentaTransRadiantGlassStair;
	public static Block orangeTransRadiantGlassStair;
	public static Block whiteTransRadiantGlassStair;
	
	public static void init(){
		
		radiantGlassOre = new RadiantGlassOre().setBlockName(Strings.RadiantGlassOreName).setHardness(3.0F);
		Registrar.registerBlock(radiantGlassOre);
		
		solidRadiantGlassBlock = new SolidRadiantGlassBlock().setBlockName(Strings.SolidRadiantGlassBlockName);
		Registrar.registerMetaBlock(solidRadiantGlassBlock, ItemSolidRadiantGlassBlock.class);
		
		transRadiantGlassBlock = new TransRadiantGlassBlock().setBlockName(Strings.TransRadiantGlassBlockName);
		Registrar.registerMetaBlock(transRadiantGlassBlock, ItemTransRadiantGlassBlock.class);
		
		blackSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 0).setBlockName(Strings.BlackSolidRadiantGlassStairName);
		Registrar.registerBlock(blackSolidRadiantGlassStair);
		
		redSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 1).setBlockName(Strings.RedSolidRadiantGlassStairName);
		Registrar.registerBlock(redSolidRadiantGlassStair);
		
		greenSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 2).setBlockName(Strings.GreenSolidRadiantGlassStairName);
		Registrar.registerBlock(greenSolidRadiantGlassStair);
		
		brownSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 3).setBlockName(Strings.BrownSolidRadiantGlassStairName);
		Registrar.registerBlock(brownSolidRadiantGlassStair);
		
		blueSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 4).setBlockName(Strings.BlueSolidRadiantGlassStairName);
		Registrar.registerBlock(blueSolidRadiantGlassStair);
		
		purpleSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 5).setBlockName(Strings.PurpleSolidRadiantGlassStairName);
		Registrar.registerBlock(purpleSolidRadiantGlassStair);
		
		cyanSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 6).setBlockName(Strings.CyanSolidRadiantGlassStairName);
		Registrar.registerBlock(cyanSolidRadiantGlassStair);
		
		silverSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 7).setBlockName(Strings.SilverSolidRadiantGlassStairName);
		Registrar.registerBlock(silverSolidRadiantGlassStair);
		
		graySolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 8).setBlockName(Strings.GraySolidRadiantGlassStairName);
		Registrar.registerBlock(graySolidRadiantGlassStair);
		
		pinkSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 9).setBlockName(Strings.PinkSolidRadiantGlassStairName);
		Registrar.registerBlock(pinkSolidRadiantGlassStair);
		
		limeSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 10).setBlockName(Strings.LimeSolidRadiantGlassStairName);
		Registrar.registerBlock(limeSolidRadiantGlassStair);
		
		yellowSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 11).setBlockName(Strings.YellowSolidRadiantGlassStairName);
		Registrar.registerBlock(yellowSolidRadiantGlassStair);
		
		lightBlueSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 12).setBlockName(Strings.LightBlueSolidRadiantGlassStairName);
		Registrar.registerBlock(lightBlueSolidRadiantGlassStair);
		
		magentaSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 13).setBlockName(Strings.MagentaSolidRadiantGlassStairName);
		Registrar.registerBlock(magentaSolidRadiantGlassStair);
		
		orangeSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 14).setBlockName(Strings.OrangeSolidRadiantGlassStairName);
		Registrar.registerBlock(orangeSolidRadiantGlassStair);
		
		whiteSolidRadiantGlassStair = new SolidRadiantStair(ModBlocks.solidRadiantGlassBlock, 15).setBlockName(Strings.WhiteSolidRadiantGlassStairName);
		Registrar.registerBlock(whiteSolidRadiantGlassStair);
		
		
		blackTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 0).setBlockName(Strings.BlackTransRadiantGlassStairName);
		Registrar.registerBlock(blackTransRadiantGlassStair);
		
		redTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 1).setBlockName(Strings.RedTransRadiantGlassStairName);
		Registrar.registerBlock(redTransRadiantGlassStair);
		
		greenTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 2).setBlockName(Strings.GreenTransRadiantGlassStairName);
		Registrar.registerBlock(greenTransRadiantGlassStair);
		
		brownTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 3).setBlockName(Strings.BrownTransRadiantGlassStairName);
		Registrar.registerBlock(brownTransRadiantGlassStair);
		
		blueTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 4).setBlockName(Strings.BlueTransRadiantGlassStairName);
		Registrar.registerBlock(blueTransRadiantGlassStair);
		
		purpleTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 5).setBlockName(Strings.PurpleTransRadiantGlassStairName);
		Registrar.registerBlock(purpleTransRadiantGlassStair);
		
		cyanTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 6).setBlockName(Strings.CyanTransRadiantGlassStairName);
		Registrar.registerBlock(cyanTransRadiantGlassStair);
		
		silverTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 7).setBlockName(Strings.SilverTransRadiantGlassStairName);
		Registrar.registerBlock(silverTransRadiantGlassStair);
		
		grayTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 8).setBlockName(Strings.GrayTransRadiantGlassStairName);
		Registrar.registerBlock(grayTransRadiantGlassStair);
		
		pinkTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 9).setBlockName(Strings.PinkTransRadiantGlassStairName);
		Registrar.registerBlock(pinkTransRadiantGlassStair);
		
		limeTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 10).setBlockName(Strings.LimeTransRadiantGlassStairName);
		Registrar.registerBlock(limeTransRadiantGlassStair);
		
		yellowTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 11).setBlockName(Strings.YellowTransRadiantGlassStairName);
		Registrar.registerBlock(yellowTransRadiantGlassStair);
		
		lightBlueTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 12).setBlockName(Strings.LightBlueTransRadiantGlassStairName);
		Registrar.registerBlock(lightBlueTransRadiantGlassStair);
		
		magentaTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 13).setBlockName(Strings.MagentaTransRadiantGlassStairName);
		Registrar.registerBlock(magentaTransRadiantGlassStair);
		
		orangeTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 14).setBlockName(Strings.OrangeTransRadiantGlassStairName);
		Registrar.registerBlock(orangeTransRadiantGlassStair);
		
		whiteTransRadiantGlassStair = new TransRadiantStair(ModBlocks.transRadiantGlassBlock, 15).setBlockName(Strings.WhiteTransRadiantGlassStairName);
		Registrar.registerBlock(whiteTransRadiantGlassStair);
		
	}

}
