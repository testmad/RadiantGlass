package radiantglass.handlers;

import radiantglass.blocks.ModBlocks;
import radiantglass.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void init()
    {
        registerRecipes();
    }
 
    public static void registerRecipes()
    {
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 0), new Object[]{
    		new ItemStack(Items.dye, 1,0), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 1), new Object[]{
    		new ItemStack(Items.dye, 1,1), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 2), new Object[]{
    		new ItemStack(Items.dye, 1,2), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 3), new Object[]{
    		new ItemStack(Items.dye, 1,3), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 4), new Object[]{
    		new ItemStack(Items.dye, 1,4), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 5), new Object[]{
    		new ItemStack(Items.dye, 1,5), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 6), new Object[]{
    		new ItemStack(Items.dye, 1,6), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 7), new Object[]{
    		new ItemStack(Items.dye, 1,7), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 8), new Object[]{
    		new ItemStack(Items.dye, 1,8), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 9), new Object[]{
    		new ItemStack(Items.dye, 1,9), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 10), new Object[]{
    		new ItemStack(Items.dye, 1,10), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 11), new Object[]{
    		new ItemStack(Items.dye, 1,11), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 12), new Object[]{
    		new ItemStack(Items.dye, 1,12), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 13), new Object[]{
    		new ItemStack(Items.dye, 1,13), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 14), new Object[]{
    		new ItemStack(Items.dye, 1,14), ModItems.radiantDust
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coloredDust, 2, 15), new Object[]{
    		new ItemStack(Items.dye, 1,15), ModItems.radiantDust
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 0), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 0)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 1), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 1)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 2), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 2)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 3), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 3)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 4), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 4)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 5), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 5)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 6), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 6)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 7), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 7)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 8), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 8)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 9), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 9)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 10), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 10)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 11), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 11)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 12), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 12)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 13), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 13)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 14), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 14)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.solidRadiantGlassBlock, 8, 15), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass, 'd', new ItemStack(ModItems.coloredDust, 1, 15)
    	});
    	
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 0), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 0)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 1), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 1)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 2), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 2)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 3), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 3)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 4), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 4)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 5), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 5)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 6), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 6)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 7), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 7)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 8), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 8)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 9), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 9)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 10), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 10)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 11), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 11)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 12), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 12)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 13), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 13)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 14), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 14)
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.transRadiantGlassBlock, 4, 15), new Object[]{
            "ggg", "gdg", "ggg", 'g', Blocks.glass_pane, 'd', new ItemStack(ModItems.coloredDust, 1, 15)
    	});
    	
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.blackSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 0)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.redSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 1)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.greenSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 2)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.brownSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 3)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.blueSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 4)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.purpleSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 5)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.cyanSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 6)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.silverSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 7)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.graySolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 8)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.pinkSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 9)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.limeSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 10)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.yellowSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 11)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lightBlueSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 12)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.magentaSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 13)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.orangeSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 14)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.whiteSolidRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.solidRadiantGlassBlock, 1, 15)
    	});
    	
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.blackTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 0)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.redTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 1)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.greenTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 2)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.brownTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 3)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.blueTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 4)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.purpleTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 5)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.cyanTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 6)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.silverTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 7)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.grayTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 8)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.pinkTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 9)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.limeTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 10)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.yellowTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 11)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lightBlueTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 12)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.magentaTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 13)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.orangeTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 14)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.whiteTransRadiantGlassStair, 4), new Object[]{
            "g  ", "gg ", "ggg", 'g', new ItemStack(ModBlocks.transRadiantGlassBlock, 1, 15)
    	});
    	
    	
    	
    	
    }

}
