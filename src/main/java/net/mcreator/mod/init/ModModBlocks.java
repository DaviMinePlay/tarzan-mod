
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mod.block.KoronbekiOreBlock;
import net.mcreator.mod.block.KoronbekiBlockBlock;
import net.mcreator.mod.ModMod;

public class ModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ModMod.MODID);
	public static final RegistryObject<Block> KORONBEKI_BLOCK = REGISTRY.register("koronbeki_block", () -> new KoronbekiBlockBlock());
	public static final RegistryObject<Block> KORONBEKI_ORE = REGISTRY.register("koronbeki_ore", () -> new KoronbekiOreBlock());
}
