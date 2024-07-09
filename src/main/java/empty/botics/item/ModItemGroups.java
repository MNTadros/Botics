package empty.botics.item;

import empty.botics.Botics;
import empty.botics.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RESOURCES_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Botics.MOD_ID,"resources"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.resources")).icon(() -> new ItemStack(ModItems.SILVER)).entries((displayContext, entries) -> {

        entries.add(ModItems.SILVER_CHUNK);
        entries.add(ModItems.SILVER);
        entries.add(ModBlocks.SILVER_BLOCK);
        entries.add(ModBlocks.PLATINUM_BLOCK);
        entries.add(ModBlocks.WATER_BLOCK);

        entries.add(ModBlocks.SILVER_CHUNK_ORE);
        entries.add(ModBlocks.DEEPSLATE_SILVER_CHUNK_ORE);
        entries.add(ModBlocks.END_STONE_SILVER_CHUNK_ORE);
        entries.add(ModBlocks.NETHER_Silver_CHUNK_ORE);

        entries.add(ModItems.METAL_DETECTOR);
        entries.add(ModItems.TENDRIL);
        entries.add(ModItems.FOSSIL_FUEL_CHUNK);
        entries.add(ModItems.PLATINUM);
        entries.add(ModItems.PLATINUM_SOCKET);
        entries.add(ModItems.GOLD_SCRAP);
        entries.add(ModItems.WRENCH);
        entries.add(ModItems.FRIEND_BALL);
        entries.add(ModItems.URANIUM);
        entries.add(ModItems.HOURGLASS);

    } ).build());

    public static void registerItemGroups(){
        Botics.LOGGER.info("Registering Item Groups for " + Botics.MOD_ID);

    }
}
