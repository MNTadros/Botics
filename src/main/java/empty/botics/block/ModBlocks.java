package empty.botics.block;

import empty.botics.Botics;
import empty.botics.block.custom.WaterBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.DEEPSLATE_TILES)));

    public static final Block SILVER_CHUNK_ORE = registerBlock("silver_chunk_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3f), UniformIntProvider.create(4,5)));
    public static final Block DEEPSLATE_SILVER_CHUNK_ORE = registerBlock("deepslate_silver_chunk_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(4,5)));
    public static final Block NETHER_Silver_CHUNK_ORE = registerBlock("nether_silver_chunk_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.5f), UniformIntProvider.create(4,7)));
    public static final Block END_STONE_SILVER_CHUNK_ORE = registerBlock("end_stone_silver_chunk_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(2.5f), UniformIntProvider.create(4,7)));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3f), UniformIntProvider.create(4,5)));
    public static final Block URANIUM_ORE = registerBlock("uranium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3f), UniformIntProvider.create(4,5)));


    public static final Block WATER_BLOCK = registerBlock("water_block", new WaterBlock(FabricBlockSettings.copyOf(Blocks.SPONGE).strength(1f).sounds(BlockSoundGroup.SOUL_SAND)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(Botics.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(Botics.MOD_ID,name), new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Botics.LOGGER.info("Registering ModBlocks for " + Botics.MOD_ID);

    }
}
