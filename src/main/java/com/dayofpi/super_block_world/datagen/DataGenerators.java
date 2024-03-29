package com.dayofpi.super_block_world.datagen;

import com.dayofpi.super_block_world.SuperBlockWorld;
import com.dayofpi.super_block_world.datagen.client.ModAdvancementsProvider;
import com.dayofpi.super_block_world.datagen.client.ModBlockStateProvider;
import com.dayofpi.super_block_world.datagen.client.ModItemModelProvider;
import com.dayofpi.super_block_world.datagen.server.ModEntriesProvider;
import com.dayofpi.super_block_world.datagen.server.ModLootTableProvider;
import com.dayofpi.super_block_world.datagen.server.ModRecipeProvider;
import com.dayofpi.super_block_world.datagen.server.tag.ModBiomeTagsProvider;
import com.dayofpi.super_block_world.datagen.server.tag.ModBlockTagsProvider;
import com.dayofpi.super_block_world.datagen.server.tag.ModEntityTagsProvider;
import com.dayofpi.super_block_world.datagen.server.tag.ModItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SuperBlockWorld.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ForgeAdvancementProvider(packOutput, lookupProvider, existingFileHelper, List.of(new ModAdvancementsProvider())));

        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));
        BlockTagsProvider blockTagsProvider = generator.addProvider(event.includeServer(), new ModBlockTagsProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new ModEntityTagsProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModBiomeTagsProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModEntriesProvider(packOutput, lookupProvider));
    }
}
