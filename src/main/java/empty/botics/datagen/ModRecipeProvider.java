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


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER, RecipeCategory.DECORATIONS,
                ModBlocks.SILVER_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER, 1)
                .pattern("CCC")
                .pattern("CSC")
                .pattern("CCC")
                .input('C', Items.COBBLESTONE)
                .input('S', ModItems.SILVER_CHUNK)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.SILVER_CHUNK), conditionsFromItem(ModItems.SILVER_CHUNK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SILVER)));
    }
}

