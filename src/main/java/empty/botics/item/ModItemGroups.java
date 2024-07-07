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

    public static final ItemGroup RESOURCES_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Botics.MOD_ID,"resources"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.resources")).icon(() -> new ItemStack(ModItems.STEEL)).entries((displayContext, entries) -> {

        entries.add(ModItems.STEEL_CHUNK);
        entries.add(ModItems.STEEL);
        entries.add(ModBlocks.STEEL_BLOCK);
    } ).build());

    public static void registerItemGroups(){
        Botics.LOGGER.info("Registering Item Groups for " + Botics.MOD_ID);

    }
}
