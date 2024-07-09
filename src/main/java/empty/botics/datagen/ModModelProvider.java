package empty.botics.datagen;

import empty.botics.block.ModBlocks;
import empty.botics.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_CHUNK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_CHUNK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_Silver_CHUNK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_SILVER_CHUNK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WATER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_SOCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.TENDRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOSSIL_FUEL_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOURGLASS, Models.GENERATED);
    }
}