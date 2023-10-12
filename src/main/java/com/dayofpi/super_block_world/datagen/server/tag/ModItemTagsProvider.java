package com.dayofpi.super_block_world.datagen.server.tag;

import com.dayofpi.super_block_world.SuperBlockWorld;
import com.dayofpi.super_block_world.item.ModItems;
import com.dayofpi.super_block_world.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture, CompletableFuture<TagsProvider.TagLookup<Block>> tagLookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, providerCompletableFuture, tagLookupCompletableFuture, SuperBlockWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Forge Tags
        tag(Tags.Items.ORES).add(ModItems.BRONZE_ORE.get());
        tag(Tags.Items.RAW_MATERIALS).add(ModItems.RAW_BRONZE.get());
        tag(Tags.Items.INGOTS).add(ModItems.BRONZE_INGOT.get());

        // Mod Tags
        copy(ModTags.Blocks.AMANITA_LOGS, ModTags.Items.AMANITA_LOGS);
        copy(ModTags.Blocks.MAYOI_LOGS, ModTags.Items.MAYOI_LOGS);

        tag(ModTags.Items.STAR_BITS).add(ModItems.YELLOW_STAR_BIT.get(), ModItems.RED_STAR_BIT.get(), ModItems.BLUE_STAR_BIT.get(), ModItems.PURPLE_STAR_BIT.get(), ModItems.RAINBOW_STAR_BIT.get());
        tag(ModTags.Items.MUSHROOM_CAPS).add(Items.BROWN_MUSHROOM_BLOCK, Items.RED_MUSHROOM_BLOCK);
        tag(ModTags.Items.FORGE_INGOTS_BRONZE).add(ModItems.BRONZE_INGOT.get());
        tag(ModTags.Items.FORGE_BLOCKS_BRONZE).add(ModItems.BRONZE_BLOCK.get());
        tag(ModTags.Items.FORGE_ORES_BRONZE).add(ModItems.BRONZE_ORE.get());

        // Vanilla Tags
        tag(ItemTags.LOGS_THAT_BURN).addTag(ModTags.Items.AMANITA_LOGS).addTag(ModTags.Items.MAYOI_LOGS);
        tag(ItemTags.PLANKS).add(ModItems.AMANITA_PLANKS.get(), ModItems.MAYOI_PLANKS.get());
        tag(ItemTags.WOODEN_STAIRS).add(ModItems.AMANITA_STAIRS.get(), ModItems.MAYOI_STAIRS.get());
        tag(ItemTags.WOODEN_SLABS).add(ModItems.AMANITA_SLAB.get(), ModItems.MAYOI_SLAB.get());
        tag(ItemTags.WOODEN_FENCES).add(ModItems.AMANITA_FENCE.get(), ModItems.MAYOI_FENCE.get());
        tag(ItemTags.FENCE_GATES).add(ModItems.AMANITA_FENCE_GATE.get(), ModItems.MAYOI_FENCE_GATE.get());
        tag(ItemTags.WOODEN_DOORS).add(ModItems.AMANITA_DOOR.get(), ModItems.MAYOI_DOOR.get());
        tag(ItemTags.WOODEN_TRAPDOORS).add(ModItems.AMANITA_TRAPDOOR.get(), ModItems.MAYOI_TRAPDOOR.get());
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(ModItems.AMANITA_PRESSURE_PLATE.get(), ModItems.MAYOI_PRESSURE_PLATE.get());
        tag(ItemTags.WOODEN_BUTTONS).add(ModItems.AMANITA_BUTTON.get(), ModItems.MAYOI_BUTTON.get());
        tag(ItemTags.SIGNS).add(ModItems.AMANITA_SIGN.get(), ModItems.MAYOI_SIGN.get());
        tag(ItemTags.HANGING_SIGNS).add(ModItems.AMANITA_HANGING_SIGN.get(), ModItems.MAYOI_HANGING_SIGN.get());
        tag(ItemTags.BOATS).add(ModItems.AMANITA_BOAT.get(), ModItems.MAYOI_BOAT.get());
        tag(ItemTags.CHEST_BOATS).add(ModItems.AMANITA_CHEST_BOAT.get(), ModItems.MAYOI_CHEST_BOAT.get());
        tag(ItemTags.LEAVES).add(ModItems.AMANITA_LEAVES.get(), ModItems.FRUITING_AMANITA_LEAVES.get(), ModItems.MAYOI_LEAVES.get(), ModItems.FRUITING_MAYOI_LEAVES.get());
        tag(ItemTags.STONE_TOOL_MATERIALS).add(ModItems.VANILLATE_CRUMBLE.get());
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(ModItems.VANILLATE_CRUMBLE.get());
        tag(ItemTags.TOOLS).add(ModItems.HAMMER.get());
        tag(ItemTags.PICKAXES).add(ModItems.SUPER_PICKAXE.get());
        tag(ItemTags.FLOWERS).add(ModItems.WHITE_FLOWERBED.get(), ModItems.YELLOW_FLOWERBED.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
