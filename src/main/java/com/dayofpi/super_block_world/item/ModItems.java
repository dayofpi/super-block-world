package com.dayofpi.super_block_world.item;

import com.dayofpi.super_block_world.SuperBlockWorld;
import com.dayofpi.super_block_world.block.ModBlocks;
import com.dayofpi.super_block_world.entity.ModEntityTypes;
import com.dayofpi.super_block_world.entity.custom.ModBoatEntity;
import com.dayofpi.super_block_world.item.custom.*;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperBlockWorld.MOD_ID);

    public static final RegistryObject<Item> POWER_STAR = ITEMS.register("power_star", () -> new PowerStarItem(ModBlocks.POWER_STAR.get(), new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> WHITE_BRONZE = registerBlockItem("white_bronze", ModBlocks.WHITE_BRONZE);
    public static final RegistryObject<Item> LIGHT_GRAY_BRONZE = registerBlockItem("light_gray_bronze", ModBlocks.LIGHT_GRAY_BRONZE);
    public static final RegistryObject<Item> GRAY_BRONZE = registerBlockItem("gray_bronze", ModBlocks.GRAY_BRONZE);
    public static final RegistryObject<Item> BLACK_BRONZE = registerBlockItem("black_bronze", ModBlocks.BLACK_BRONZE);
    public static final RegistryObject<Item> BROWN_BRONZE = registerBlockItem("brown_bronze", ModBlocks.BROWN_BRONZE);
    public static final RegistryObject<Item> RED_BRONZE = registerBlockItem("red_bronze", ModBlocks.RED_BRONZE);
    public static final RegistryObject<Item> ORANGE_BRONZE = registerBlockItem("orange_bronze", ModBlocks.ORANGE_BRONZE);
    public static final RegistryObject<Item> YELLOW_BRONZE = registerBlockItem("yellow_bronze", ModBlocks.YELLOW_BRONZE);
    public static final RegistryObject<Item> LIME_BRONZE = registerBlockItem("lime_bronze", ModBlocks.LIME_BRONZE);
    public static final RegistryObject<Item> GREEN_BRONZE = registerBlockItem("green_bronze", ModBlocks.GREEN_BRONZE);
    public static final RegistryObject<Item> CYAN_BRONZE = registerBlockItem("cyan_bronze", ModBlocks.CYAN_BRONZE);
    public static final RegistryObject<Item> LIGHT_BLUE_BRONZE = registerBlockItem("light_blue_bronze", ModBlocks.LIGHT_BLUE_BRONZE);
    public static final RegistryObject<Item> BLUE_BRONZE = registerBlockItem("blue_bronze", ModBlocks.BLUE_BRONZE);
    public static final RegistryObject<Item> PURPLE_BRONZE = registerBlockItem("purple_bronze", ModBlocks.PURPLE_BRONZE);
    public static final RegistryObject<Item> MAGENTA_BRONZE = registerBlockItem("magenta_bronze", ModBlocks.MAGENTA_BRONZE);
    public static final RegistryObject<Item> PINK_BRONZE = registerBlockItem("pink_bronze", ModBlocks.PINK_BRONZE);
    public static final RegistryObject<Item> FLAGPOLE = registerBlockItem("flagpole", ModBlocks.FLAGPOLE);
    public static final RegistryObject<Item> WHITE_FLAG = registerCustomRendererItem("white_flag", ModBlocks.WHITE_FLAG);
    public static final RegistryObject<Item> LIGHT_GRAY_FLAG = registerCustomRendererItem("light_gray_flag", ModBlocks.LIGHT_GRAY_FLAG);
    public static final RegistryObject<Item> GRAY_FLAG = registerCustomRendererItem("gray_flag", ModBlocks.GRAY_FLAG);
    public static final RegistryObject<Item> BLACK_FLAG = registerCustomRendererItem("black_flag", ModBlocks.BLACK_FLAG);
    public static final RegistryObject<Item> BROWN_FLAG = registerCustomRendererItem("brown_flag", ModBlocks.BROWN_FLAG);
    public static final RegistryObject<Item> RED_FLAG = registerCustomRendererItem("red_flag", ModBlocks.RED_FLAG);
    public static final RegistryObject<Item> ORANGE_FLAG = registerCustomRendererItem("orange_flag", ModBlocks.ORANGE_FLAG);
    public static final RegistryObject<Item> YELLOW_FLAG = registerCustomRendererItem("yellow_flag", ModBlocks.YELLOW_FLAG);
    public static final RegistryObject<Item> LIME_FLAG = registerCustomRendererItem("lime_flag", ModBlocks.LIME_FLAG);
    public static final RegistryObject<Item> GREEN_FLAG = registerCustomRendererItem("green_flag", ModBlocks.GREEN_FLAG);
    public static final RegistryObject<Item> CYAN_FLAG = registerCustomRendererItem("cyan_flag", ModBlocks.CYAN_FLAG);
    public static final RegistryObject<Item> LIGHT_BLUE_FLAG = registerCustomRendererItem("light_blue_flag", ModBlocks.LIGHT_BLUE_FLAG);
    public static final RegistryObject<Item> BLUE_FLAG = registerCustomRendererItem("blue_flag", ModBlocks.BLUE_FLAG);
    public static final RegistryObject<Item> PURPLE_FLAG = registerCustomRendererItem("purple_flag", ModBlocks.PURPLE_FLAG);
    public static final RegistryObject<Item> MAGENTA_FLAG = registerCustomRendererItem("magenta_flag", ModBlocks.MAGENTA_FLAG);
    public static final RegistryObject<Item> PINK_FLAG = registerCustomRendererItem("pink_flag", ModBlocks.PINK_FLAG);
    public static final RegistryObject<Item> RAINBOW_FLAG = ITEMS.register("rainbow_flag", () -> new CustomRendererItem(ModBlocks.RAINBOW_FLAG.get(), new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> WHITE_WARP_PIPE = registerBlockItem("white_warp_pipe", ModBlocks.WHITE_WARP_PIPE);
    public static final RegistryObject<Item> LIGHT_GRAY_WARP_PIPE = registerBlockItem("light_gray_warp_pipe", ModBlocks.LIGHT_GRAY_WARP_PIPE);
    public static final RegistryObject<Item> GRAY_WARP_PIPE = registerBlockItem("gray_warp_pipe", ModBlocks.GRAY_WARP_PIPE);
    public static final RegistryObject<Item> BLACK_WARP_PIPE = registerBlockItem("black_warp_pipe", ModBlocks.BLACK_WARP_PIPE);
    public static final RegistryObject<Item> BROWN_WARP_PIPE = registerBlockItem("brown_warp_pipe", ModBlocks.BROWN_WARP_PIPE);
    public static final RegistryObject<Item> RED_WARP_PIPE = registerBlockItem("red_warp_pipe", ModBlocks.RED_WARP_PIPE);
    public static final RegistryObject<Item> ORANGE_WARP_PIPE = registerBlockItem("orange_warp_pipe", ModBlocks.ORANGE_WARP_PIPE);
    public static final RegistryObject<Item> YELLOW_WARP_PIPE = registerBlockItem("yellow_warp_pipe", ModBlocks.YELLOW_WARP_PIPE);
    public static final RegistryObject<Item> LIME_WARP_PIPE = registerBlockItem("lime_warp_pipe", ModBlocks.LIME_WARP_PIPE);
    public static final RegistryObject<Item> GREEN_WARP_PIPE = registerBlockItem("green_warp_pipe", ModBlocks.GREEN_WARP_PIPE);
    public static final RegistryObject<Item> CYAN_WARP_PIPE = registerBlockItem("cyan_warp_pipe", ModBlocks.CYAN_WARP_PIPE);
    public static final RegistryObject<Item> LIGHT_BLUE_WARP_PIPE = registerBlockItem("light_blue_warp_pipe", ModBlocks.LIGHT_BLUE_WARP_PIPE);
    public static final RegistryObject<Item> BLUE_WARP_PIPE = registerBlockItem("blue_warp_pipe", ModBlocks.BLUE_WARP_PIPE);
    public static final RegistryObject<Item> PURPLE_WARP_PIPE = registerBlockItem("purple_warp_pipe", ModBlocks.PURPLE_WARP_PIPE);
    public static final RegistryObject<Item> MAGENTA_WARP_PIPE = registerBlockItem("magenta_warp_pipe", ModBlocks.MAGENTA_WARP_PIPE);
    public static final RegistryObject<Item> PINK_WARP_PIPE = registerBlockItem("pink_warp_pipe", ModBlocks.PINK_WARP_PIPE);
    public static final RegistryObject<Item> WHITE_PIPE_BODY = registerBlockItem("white_pipe_body", ModBlocks.WHITE_PIPE_BODY);
    public static final RegistryObject<Item> LIGHT_GRAY_PIPE_BODY = registerBlockItem("light_gray_pipe_body", ModBlocks.LIGHT_GRAY_PIPE_BODY);
    public static final RegistryObject<Item> GRAY_PIPE_BODY = registerBlockItem("gray_pipe_body", ModBlocks.GRAY_PIPE_BODY);
    public static final RegistryObject<Item> BLACK_PIPE_BODY = registerBlockItem("black_pipe_body", ModBlocks.BLACK_PIPE_BODY);
    public static final RegistryObject<Item> BROWN_PIPE_BODY = registerBlockItem("brown_pipe_body", ModBlocks.BROWN_PIPE_BODY);
    public static final RegistryObject<Item> RED_PIPE_BODY = registerBlockItem("red_pipe_body", ModBlocks.RED_PIPE_BODY);
    public static final RegistryObject<Item> ORANGE_PIPE_BODY = registerBlockItem("orange_pipe_body", ModBlocks.ORANGE_PIPE_BODY);
    public static final RegistryObject<Item> YELLOW_PIPE_BODY = registerBlockItem("yellow_pipe_body", ModBlocks.YELLOW_PIPE_BODY);
    public static final RegistryObject<Item> LIME_PIPE_BODY = registerBlockItem("lime_pipe_body", ModBlocks.LIME_PIPE_BODY);
    public static final RegistryObject<Item> GREEN_PIPE_BODY = registerBlockItem("green_pipe_body", ModBlocks.GREEN_PIPE_BODY);
    public static final RegistryObject<Item> CYAN_PIPE_BODY = registerBlockItem("cyan_pipe_body", ModBlocks.CYAN_PIPE_BODY);
    public static final RegistryObject<Item> LIGHT_BLUE_PIPE_BODY = registerBlockItem("light_blue_pipe_body", ModBlocks.LIGHT_BLUE_PIPE_BODY);
    public static final RegistryObject<Item> BLUE_PIPE_BODY = registerBlockItem("blue_pipe_body", ModBlocks.BLUE_PIPE_BODY);
    public static final RegistryObject<Item> PURPLE_PIPE_BODY = registerBlockItem("purple_pipe_body", ModBlocks.PURPLE_PIPE_BODY);
    public static final RegistryObject<Item> MAGENTA_PIPE_BODY = registerBlockItem("magenta_pipe_body", ModBlocks.MAGENTA_PIPE_BODY);
    public static final RegistryObject<Item> PINK_PIPE_BODY = registerBlockItem("pink_pipe_body", ModBlocks.PINK_PIPE_BODY);
    public static final RegistryObject<Item> TOADSTOOL_GRASS = registerBlockItem("toadstool_grass", ModBlocks.TOADSTOOL_GRASS);
    public static final RegistryObject<Item> TOADSTOOL_SOIL = registerBlockItem("toadstool_soil", ModBlocks.TOADSTOOL_SOIL);
    public static final RegistryObject<Item> COARSE_TOADSTOOL_SOIL = registerBlockItem("coarse_toadstool_soil", ModBlocks.COARSE_TOADSTOOL_SOIL);
    public static final RegistryObject<Item> TOADSTOOL_PATH = registerBlockItem("toadstool_path", ModBlocks.TOADSTOOL_PATH);
    public static final RegistryObject<Item> BRONZE_ORE = registerBlockItem("bronze_ore", ModBlocks.BRONZE_ORE);
    public static final RegistryObject<Item> RAW_BRONZE_BLOCK = registerBlockItem("raw_bronze_block", ModBlocks.RAW_BRONZE_BLOCK);
    public static final RegistryObject<Item> BRONZE_BLOCK = registerBlockItem("bronze_block", ModBlocks.BRONZE_BLOCK);
    public static final RegistryObject<Item> BRONZE_STAIRS = registerBlockItem("bronze_stairs", ModBlocks.BRONZE_STAIRS);
    public static final RegistryObject<Item> BRONZE_SLAB = registerBlockItem("bronze_slab", ModBlocks.BRONZE_SLAB);
    public static final RegistryObject<Item> VANILLATE = registerBlockItem("vanillate", ModBlocks.VANILLATE);
    public static final RegistryObject<Item> VANILLATE_STAIRS = registerBlockItem("vanillate_stairs", ModBlocks.VANILLATE_STAIRS);
    public static final RegistryObject<Item> VANILLATE_SLAB = registerBlockItem("vanillate_slab", ModBlocks.VANILLATE_SLAB);
    public static final RegistryObject<Item> VANILLATE_WALL = registerBlockItem("vanillate_wall", ModBlocks.VANILLATE_WALL);
    public static final RegistryObject<Item> TOPPED_VANILLATE = registerBlockItem("topped_vanillate", ModBlocks.TOPPED_VANILLATE);
    public static final RegistryObject<Item> VANILLATE_CRUMBLE = registerBlockItem("vanillate_crumble", ModBlocks.VANILLATE_CRUMBLE);
    public static final RegistryObject<Item> VANILLATE_BRICKS = registerBlockItem("vanillate_bricks", ModBlocks.VANILLATE_BRICKS);
    public static final RegistryObject<Item> VANILLATE_BRICK_STAIRS = registerBlockItem("vanillate_brick_stairs", ModBlocks.VANILLATE_BRICK_STAIRS);
    public static final RegistryObject<Item> VANILLATE_BRICK_SLAB = registerBlockItem("vanillate_brick_slab", ModBlocks.VANILLATE_BRICK_SLAB);
    public static final RegistryObject<Item> VANILLATE_BRICK_WALL = registerBlockItem("vanillate_brick_wall", ModBlocks.VANILLATE_BRICK_WALL);
    public static final RegistryObject<Item> VANILLATE_TILES = registerBlockItem("vanillate_tiles", ModBlocks.VANILLATE_TILES);
    public static final RegistryObject<Item> VANILLATE_TILE_STAIRS = registerBlockItem("vanillate_tile_stairs", ModBlocks.VANILLATE_TILE_STAIRS);
    public static final RegistryObject<Item> VANILLATE_TILE_SLAB = registerBlockItem("vanillate_tile_slab", ModBlocks.VANILLATE_TILE_SLAB);
    public static final RegistryObject<Item> VANILLATE_TILE_WALL = registerBlockItem("vanillate_tile_wall", ModBlocks.VANILLATE_TILE_WALL);
    public static final RegistryObject<Item> TOADSTONE = registerBlockItem("toadstone", ModBlocks.TOADSTONE);
    public static final RegistryObject<Item> TOADSTONE_STAIRS = registerBlockItem("toadstone_stairs", ModBlocks.TOADSTONE_STAIRS);
    public static final RegistryObject<Item> TOADSTONE_SLAB = registerBlockItem("toadstone_slab", ModBlocks.TOADSTONE_SLAB);
    public static final RegistryObject<Item> TOADSTONE_WALL = registerBlockItem("toadstone_wall", ModBlocks.TOADSTONE_WALL);
    public static final RegistryObject<Item> TOADSTONE_BRICKS = registerBlockItem("toadstone_bricks", ModBlocks.TOADSTONE_BRICKS);
    public static final RegistryObject<Item> TOADSTONE_BRICK_STAIRS = registerBlockItem("toadstone_brick_stairs", ModBlocks.TOADSTONE_BRICK_STAIRS);
    public static final RegistryObject<Item> TOADSTONE_BRICK_SLAB = registerBlockItem("toadstone_brick_slab", ModBlocks.TOADSTONE_BRICK_SLAB);
    public static final RegistryObject<Item> TOADSTONE_BRICK_WALL = registerBlockItem("toadstone_brick_wall", ModBlocks.TOADSTONE_BRICK_WALL);
    public static final RegistryObject<Item> SMOOTH_TOADSTONE = registerBlockItem("smooth_toadstone", ModBlocks.SMOOTH_TOADSTONE);
    public static final RegistryObject<Item> SMOOTH_TOADSTONE_STAIRS = registerBlockItem("smooth_toadstone_stairs", ModBlocks.SMOOTH_TOADSTONE_STAIRS);
    public static final RegistryObject<Item> SMOOTH_TOADSTONE_SLAB = registerBlockItem("smooth_toadstone_slab", ModBlocks.SMOOTH_TOADSTONE_SLAB);
    public static final RegistryObject<Item> HARDSTONE = registerBlockItem("hardstone", ModBlocks.HARDSTONE);
    public static final RegistryObject<Item> HARDSTONE_STAIRS = registerBlockItem("hardstone_stairs", ModBlocks.HARDSTONE_STAIRS);
    public static final RegistryObject<Item> HARDSTONE_SLAB = registerBlockItem("hardstone_slab", ModBlocks.HARDSTONE_SLAB);
    public static final RegistryObject<Item> HARDSTONE_WALL = registerBlockItem("hardstone_wall", ModBlocks.HARDSTONE_WALL);
    public static final RegistryObject<Item> CHISELED_HARDSTONE = registerBlockItem("chiseled_hardstone", ModBlocks.CHISELED_HARDSTONE);
    public static final RegistryObject<Item> HARDSTONE_BRICKS = registerBlockItem("hardstone_bricks", ModBlocks.HARDSTONE_BRICKS);
    public static final RegistryObject<Item> CRACKED_HARDSTONE_BRICKS = registerBlockItem("cracked_hardstone_bricks", ModBlocks.CRACKED_HARDSTONE_BRICKS);
    public static final RegistryObject<Item> HARDSTONE_BRICK_STAIRS = registerBlockItem("hardstone_brick_stairs", ModBlocks.HARDSTONE_BRICK_STAIRS);
    public static final RegistryObject<Item> HARDSTONE_BRICK_SLAB = registerBlockItem("hardstone_brick_slab", ModBlocks.HARDSTONE_BRICK_SLAB);
    public static final RegistryObject<Item> HARDSTONE_BRICK_WALL = registerBlockItem("hardstone_brick_wall", ModBlocks.HARDSTONE_BRICK_WALL);
    public static final RegistryObject<Item> SMOOTH_HARDSTONE = registerBlockItem("smooth_hardstone", ModBlocks.SMOOTH_HARDSTONE);
    public static final RegistryObject<Item> SMOOTH_HARDSTONE_STAIRS = registerBlockItem("smooth_hardstone_stairs", ModBlocks.SMOOTH_HARDSTONE_STAIRS);
    public static final RegistryObject<Item> SMOOTH_HARDSTONE_SLAB = registerBlockItem("smooth_hardstone_slab", ModBlocks.SMOOTH_HARDSTONE_SLAB);
    public static final RegistryObject<Item> PACKED_CLOUD = registerBlockItem("packed_cloud", ModBlocks.PACKED_CLOUD);
    public static final RegistryObject<Item> CLOUD_STAIRS = registerBlockItem("cloud_stairs", ModBlocks.CLOUD_STAIRS);
    public static final RegistryObject<Item> CLOUD_SLAB = registerBlockItem("cloud_slab", ModBlocks.CLOUD_SLAB);
    public static final RegistryObject<Item> MOON_ROCK = registerBlockItem("moon_rock", ModBlocks.MOON_ROCK);
    public static final RegistryObject<Item> RAINBOW_TILES = registerBlockItem("rainbow_tiles", ModBlocks.RAINBOW_TILES);
    public static final RegistryObject<Item> RAINBOW_TILE_STAIRS = registerBlockItem("rainbow_tile_stairs", ModBlocks.RAINBOW_TILE_STAIRS);
    public static final RegistryObject<Item> RAINBOW_TILE_SLAB = registerBlockItem("rainbow_tile_slab", ModBlocks.RAINBOW_TILE_SLAB);
    public static final RegistryObject<Item> RAINBOW_TILE_WALL = registerBlockItem("rainbow_tile_wall", ModBlocks.RAINBOW_TILE_WALL);
    public static final RegistryObject<Item> STAR_CLUSTER = registerBlockItem("star_cluster", ModBlocks.STAR_CLUSTER);
    public static final RegistryObject<Item> AMANITA_LOG = registerBlockItem("amanita_log", ModBlocks.AMANITA_LOG);
    public static final RegistryObject<Item> AMANITA_WOOD = registerBlockItem("amanita_wood", ModBlocks.AMANITA_WOOD);
    public static final RegistryObject<Item> STRIPPED_AMANITA_LOG = registerBlockItem("stripped_amanita_log", ModBlocks.STRIPPED_AMANITA_LOG);
    public static final RegistryObject<Item> STRIPPED_AMANITA_WOOD = registerBlockItem("stripped_amanita_wood", ModBlocks.STRIPPED_AMANITA_WOOD);
    public static final RegistryObject<Item> AMANITA_PLANKS = registerBlockItem("amanita_planks", ModBlocks.AMANITA_PLANKS);
    public static final RegistryObject<Item> AMANITA_STAIRS = registerBlockItem("amanita_stairs", ModBlocks.AMANITA_STAIRS);
    public static final RegistryObject<Item> AMANITA_SLAB = registerBlockItem("amanita_slab", ModBlocks.AMANITA_SLAB);
    public static final RegistryObject<Item> AMANITA_FENCE = registerBlockItem("amanita_fence", ModBlocks.AMANITA_FENCE);
    public static final RegistryObject<Item> AMANITA_FENCE_GATE = registerBlockItem("amanita_fence_gate", ModBlocks.AMANITA_FENCE_GATE);
    public static final RegistryObject<Item> AMANITA_DOOR = registerBlockItem("amanita_door", ModBlocks.AMANITA_DOOR);
    public static final RegistryObject<Item> AMANITA_TRAPDOOR = registerBlockItem("amanita_trapdoor", ModBlocks.AMANITA_TRAPDOOR);
    public static final RegistryObject<Item> AMANITA_PRESSURE_PLATE = registerBlockItem("amanita_pressure_plate", ModBlocks.AMANITA_PRESSURE_PLATE);
    public static final RegistryObject<Item> AMANITA_BUTTON = registerBlockItem("amanita_button", ModBlocks.AMANITA_BUTTON);
    public static final RegistryObject<Item> AMANITA_SIGN = ITEMS.register("amanita_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.AMANITA_SIGN.get(), ModBlocks.AMANITA_WALL_SIGN.get()));
    public static final RegistryObject<Item> AMANITA_HANGING_SIGN = ITEMS.register("amanita_hanging_sign", () -> new HangingSignItem(ModBlocks.AMANITA_HANGING_SIGN.get(), ModBlocks.AMANITA_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> AMANITA_LEAVES = registerBlockItem("amanita_leaves", ModBlocks.AMANITA_LEAVES);
    public static final RegistryObject<Item> FRUITING_AMANITA_LEAVES = registerBlockItem("fruiting_amanita_leaves", ModBlocks.FRUITING_AMANITA_LEAVES);
    public static final RegistryObject<Item> AMANITA_SAPLING = registerBlockItem("amanita_sapling", ModBlocks.AMANITA_SAPLING);
    public static final RegistryObject<Item> WHITE_FLOWERBED = registerBlockItem("white_flowerbed", ModBlocks.WHITE_FLOWERBED);
    public static final RegistryObject<Item> YELLOW_FLOWERBED = registerBlockItem("yellow_flowerbed", ModBlocks.YELLOW_FLOWERBED);
    public static final RegistryObject<Item> WARP_PAINTING = ITEMS.register("warp_painting", () -> new WarpPaintingItem(new Item.Properties()));
    public static final RegistryObject<Item> WARP_LINK = ITEMS.register("warp_link", () -> new WarpLinkItem(new Item.Properties()));
    public static final RegistryObject<Item> AMANITA_BOAT = ITEMS.register("amanita_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.AMANITA, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMANITA_CHEST_BOAT = ITEMS.register("amanita_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.AMANITA, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHY_GUY_MASK = ITEMS.register("shy_guy_mask", () -> new ShyGuyMaskItem(new Item.Properties()));
    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer", () -> new HammerItem(new Item.Properties().durability(131)));
    public static final RegistryObject<Item> SUPER_PICKAXE = ITEMS.register("super_pickaxe", () -> new SuperPickaxeItem(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> YOSHI_FRUIT = ITEMS.register("yoshi_fruit", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> YOSHI_COOKIE = ITEMS.register("yoshi_cookie", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F).build())));
    public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWER_SHARD = ITEMS.register("power_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_STAR_BIT = ITEMS.register("red_star_bit", () -> new StarBitItem(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_STAR_BIT = ITEMS.register("yellow_star_bit", () -> new StarBitItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_STAR_BIT = ITEMS.register("blue_star_bit", () -> new StarBitItem(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_STAR_BIT = ITEMS.register("purple_star_bit", () -> new StarBitItem(new Item.Properties()));
    public static final RegistryObject<Item> SUBCON_THREAD = ITEMS.register("subcon_thread", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHY_GUY_SPAWN_EGG = ITEMS.register("shy_guy_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.SHY_GUY, 0xed4125, 0x3785db, new Item.Properties()));
    public static final RegistryObject<Item> BOOM_BOOM_SPAWN_EGG = ITEMS.register("boom_boom_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.BOOM_BOOM, 0xcc7402, 0xffd22c, new Item.Properties()));

    private static RegistryObject<Item> registerBlockItem(String name, Supplier<Block> blockSupplier) {
        return ITEMS.register(name, () -> new BlockItem(blockSupplier.get(), new Item.Properties()));
    }

    private static RegistryObject<Item> registerCustomRendererItem(String name, Supplier<Block> blockSupplier) {
        return ITEMS.register(name, () -> new CustomRendererItem(blockSupplier.get(), new Item.Properties()));
    }
}
