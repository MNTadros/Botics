package empty.botics.datagen;

import empty.botics.block.ModBlocks;
import empty.botics.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.SILVER_CHUNK_ORE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.COAL_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.SILVER_CHUNK_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_CHUNK_ORE)
                .add(ModBlocks.NETHER_Silver_CHUNK_ORE)
                .add(ModBlocks.END_STONE_SILVER_CHUNK_ORE)
                .add(ModBlocks.WATER_BLOCK)
                .add(ModBlocks.PLATINUM_BLOCK)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.URANIUM_BLOCK)
                .add(ModBlocks.URANIUM_ORE);


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PLATINUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_CHUNK_ORE)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.URANIUM_ORE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.URANIUM_BLOCK)
                .add(ModBlocks.NETHER_Silver_CHUNK_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.END_STONE_SILVER_CHUNK_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_CHUNK_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.WATER_BLOCK);


    }
}