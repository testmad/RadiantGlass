package radiantglass.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import radiantglass.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class RadiantGlassWorldGen implements IWorldGenerator{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0 :
		//Generate our surface world
		generateSurface(world, random, chunkX*16, chunkZ*16);

		case -1 :
		//Generate our surface world
		generateNether(world, random, chunkX*16, chunkZ*16);

		case 1 :
		//Generate our surface world
		generateEnd(world, random, chunkX*16, chunkZ*16);
		}
	}

	
	private void generateSurface(World world, Random random, int i, int j) {
		addOreSpawn(ModBlocks.radiantGlassOre, world, random, i, j, 6, 12, 30, 10, 52);
		
	}
	
	
	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
	
	private void generateEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVainSize, int maxVainSize, int chancesToSpawn, int minY, int maxY ){
        for(int i = 0; i<chancesToSpawn; i++)
        {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)), Blocks.stone).generate(world, random, posX, posY, posZ);
        }
    }

}
