package com.herobane.berylliumstuff.generation;

import java.util.Random;

import com.herobane.berylliumstuff.Main;
import com.herobane.berylliumstuff.blocks.BlockBerylliumOre;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BerylliumOreGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId) {
		
			case 0:
				this.generateOverworld(random, chunkX * 16, chunkZ * 16, world);
				break;
			case 1:
				this.generateEnder(random, chunkX * 16, chunkZ * 16, world);
				break;
			case -1:
				this.generateNether(random, chunkX * 16, chunkZ * 16, world);
				break;
		
		}
		
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		
		for(int i = 0; i < 2; i++) {
			(new WorldGenMinable(Main.berylliumOre, 0, 8, Blocks.stone))
				.generate(world, random, chunkX + random.nextInt(16), random.nextInt(30), chunkZ + random.nextInt(16));
		}
		
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		
		for(int i = 0; i < 2; i++) {
			(new WorldGenMinable(Main.berylliumOre, 1, 8, Blocks.netherrack))
				.generate(world, random, chunkX + random.nextInt(16), random.nextInt(80), chunkZ + random.nextInt(16));
		}
		
	}
	
	private void generateEnder(Random random, int chunkX, int chunkZ, World world) {
		
		for(int i = 0; i < 2; i++) {
			(new WorldGenMinable(Main.berylliumOre, 2, 8, Blocks.end_stone))
				.generate(world, random, chunkX + random.nextInt(16), random.nextInt(80), chunkZ + random.nextInt(16));
		}
		
	}

}
