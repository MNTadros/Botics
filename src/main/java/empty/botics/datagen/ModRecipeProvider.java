package empty.botics.datagen;

import empty.botics.block.ModBlocks;
import empty.botics.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> SILVER_ORE_SMELTABLES = List.of(ModItems.SILVER_CHUNK,
            ModBlocks.SILVER_CHUNK_ORE, ModBlocks.DEEPSLATE_SILVER_CHUNK_ORE, ModBlocks.NETHER_Silver_CHUNK_ORE, ModBlocks.END_STONE_SILVER_CHUNK_ORE);

    private static final List<ItemConvertible> SILVER_SMELTABLES = List.of(ModItems.SILVER,
            ModItems.SILVER_CHUNK);

    private static final List<ItemConvertible> PLATINUM_SMELTABLES = List.of(ModItems.PLATINUM,
            ModItems.RAW_PLATINUM);

    private static final List<ItemConvertible> URANIUM_SMELTABLES = List.of(ModItems.URANIUM,
            ModItems.RAW_URANIUM);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, SILVER_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_CHUNK,
                0.7f, 200, "silver");
        offerBlasting(exporter, SILVER_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_CHUNK,
                0.7f, 100, "silver");

        offerSmelting(exporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER,
                0.7f, 200, "silver");
        offerBlasting(exporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER,
                0.7f, 100, "silver");

        offerSmelting(exporter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM,
                0.7f, 200, "platinum");
        offerBlasting(exporter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM,
                0.7f, 100, "platinum");

        offerSmelting(exporter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM,
                0.7f, 200, "uranium");
        offerBlasting(exporter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM,
                0.7f, 100, "uranium");


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER, RecipeCategory.DECORATIONS,
                ModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PLATINUM, RecipeCategory.DECORATIONS,
                ModBlocks.PLATINUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLD_SCRAP, 1)
                .pattern("INI")
                .pattern("NNN")
                .pattern(" I ")
                .input('I', Items.GOLD_INGOT)
                .input('N', Items.GOLD_NUGGET)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_SCRAP)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_SOCKET, 1)
                .pattern(" T ")
                .pattern("TBT")
                .pattern(" T ")
                .input('B', ModBlocks.PLATINUM_BLOCK)
                .input('T', Items.TERRACOTTA)
                .criterion(hasItem(ModBlocks.PLATINUM_BLOCK), conditionsFromItem(ModBlocks.PLATINUM_BLOCK))
                .criterion(hasItem(Items.TERRACOTTA), conditionsFromItem(Items.TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_SOCKET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_PICKAXE, 1)
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .input('P', ModItems.PLATINUM)
                .input('S', ModItems.SILVER)
                .criterion(hasItem(ModItems.PLATINUM), conditionsFromItem(ModItems.PLATINUM))
                .criterion(hasItem(ModItems.SILVER), conditionsFromItem(ModItems.SILVER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_AXE, 1)
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .input('P', ModItems.PLATINUM)
                .input('S', ModItems.SILVER)
                .criterion(hasItem(ModItems.PLATINUM), conditionsFromItem(ModItems.PLATINUM))
                .criterion(hasItem(ModItems.SILVER), conditionsFromItem(ModItems.SILVER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_SHOVEL, 1)
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .input('P', ModItems.PLATINUM)
                .input('S', ModItems.SILVER)
                .criterion(hasItem(ModItems.PLATINUM), conditionsFromItem(ModItems.PLATINUM))
                .criterion(hasItem(ModItems.SILVER), conditionsFromItem(ModItems.SILVER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_SWORD, 1)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .input('P', ModItems.PLATINUM)
                .input('S', ModItems.SILVER)
                .criterion(hasItem(ModItems.PLATINUM), conditionsFromItem(ModItems.PLATINUM))
                .criterion(hasItem(ModItems.SILVER), conditionsFromItem(ModItems.SILVER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_HOE, 1)
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .input('P', ModItems.PLATINUM)
                .input('S', ModItems.SILVER)
                .criterion(hasItem(ModItems.PLATINUM), conditionsFromItem(ModItems.PLATINUM))
                .criterion(hasItem(ModItems.SILVER), conditionsFromItem(ModItems.SILVER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_HELMET, 1)
                .pattern("PPP")
                .pattern("P P")
                .pattern("   ")
                .input('P', ModItems.PLATINUM)
                .criterion(hasItem(ModItems.PLATINUM), conditionsFromItem(ModItems.PLATINUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_CHESTPLATE, 1)
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModItems.PLATINUM)
                .criterion(hasItem(ModItems.PLATINUM), conditionsFromItem(ModItems.PLATINUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_LEGGINGS, 1)
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.PLATINUM)
                .criterion(hasItem(ModItems.PLATINUM), conditionsFromItem(ModItems.PLATINUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_BOOTS, 1)
                .pattern("   ")
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.PLATINUM)
                .criterion(hasItem(ModItems.PLATINUM), conditionsFromItem(ModItems.PLATINUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_BOOTS)));
    }
}

