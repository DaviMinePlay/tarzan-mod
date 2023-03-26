
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mod.item.MaconhaArmorItem;
import net.mcreator.mod.item.KoronbekiSwordItem;
import net.mcreator.mod.item.KoronbekiShovelItem;
import net.mcreator.mod.item.KoronbekiPickaxeItem;
import net.mcreator.mod.item.KoronbekiIngotItem;
import net.mcreator.mod.item.KoronbekiHoeItem;
import net.mcreator.mod.item.KoronbekiAxeItem;
import net.mcreator.mod.ModMod;

public class ModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModMod.MODID);
	public static final RegistryObject<Item> KORONBEKI_BLOCK = block(ModModBlocks.KORONBEKI_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> KORONBEKI_ORE = block(ModModBlocks.KORONBEKI_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> KORONBEKI_INGOT = REGISTRY.register("koronbeki_ingot", () -> new KoronbekiIngotItem());
	public static final RegistryObject<Item> KORONBEKI_AXE = REGISTRY.register("koronbeki_axe", () -> new KoronbekiAxeItem());
	public static final RegistryObject<Item> KORONBEKI_PICKAXE = REGISTRY.register("koronbeki_pickaxe", () -> new KoronbekiPickaxeItem());
	public static final RegistryObject<Item> KORONBEKI_SWORD = REGISTRY.register("koronbeki_sword", () -> new KoronbekiSwordItem());
	public static final RegistryObject<Item> KORONBEKI_SHOVEL = REGISTRY.register("koronbeki_shovel", () -> new KoronbekiShovelItem());
	public static final RegistryObject<Item> KORONBEKI_HOE = REGISTRY.register("koronbeki_hoe", () -> new KoronbekiHoeItem());
	public static final RegistryObject<Item> MACONHA_ARMOR_HELMET = REGISTRY.register("maconha_armor_helmet", () -> new MaconhaArmorItem.Helmet());
	public static final RegistryObject<Item> MACONHA_ARMOR_CHESTPLATE = REGISTRY.register("maconha_armor_chestplate", () -> new MaconhaArmorItem.Chestplate());
	public static final RegistryObject<Item> MACONHA_ARMOR_LEGGINGS = REGISTRY.register("maconha_armor_leggings", () -> new MaconhaArmorItem.Leggings());
	public static final RegistryObject<Item> MACONHA_ARMOR_BOOTS = REGISTRY.register("maconha_armor_boots", () -> new MaconhaArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
