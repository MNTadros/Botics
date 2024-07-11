package empty.botics.datagen;

import empty.botics.block.ModBlocks;
import empty.botics.block.custom.TendrilCropBlock;
import empty.botics.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SILVER_BLOCK);
        addDrop(ModBlocks.PLATINUM_BLOCK);
        addDrop(ModBlocks.URANIUM_BLOCK);
        addDrop(ModBlocks.WATER_BLOCK);

        addDrop(ModBlocks.SILVER_CHUNK_ORE, copperLikeOreDrops(ModBlocks.SILVER_CHUNK_ORE, ModItems.SILVER_CHUNK));
        addDrop(ModBlocks.DEEPSLATE_SILVER_CHUNK_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_SILVER_CHUNK_ORE, ModItems.SILVER_CHUNK));
        addDrop(ModBlocks.NETHER_Silver_CHUNK_ORE, copperLikeOreDrops(ModBlocks.NETHER_Silver_CHUNK_ORE, ModItems.SILVER_CHUNK));
        addDrop(ModBlocks.END_STONE_SILVER_CHUNK_ORE, copperLikeOreDrops(ModBlocks.END_STONE_SILVER_CHUNK_ORE, ModItems.SILVER_CHUNK));

        addDrop(ModBlocks.PLATINUM_ORE, copperLikeOreDrops(ModBlocks.PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.URANIUM_ORE, copperLikeOreDrops(ModBlocks.URANIUM_ORE, ModItems.RAW_URANIUM));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.TENDRIL_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TendrilCropBlock.AGE, 5));
        addDrop(ModBlocks.TENDRIL_CROP, cropDrops(ModBlocks.TENDRIL_CROP, ModItems.TENDRIL, ModItems.TENDRIL_SEEDS, builder));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}