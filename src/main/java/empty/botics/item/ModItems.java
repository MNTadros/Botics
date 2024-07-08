package empty.botics.item;

import empty.botics.Botics;
import empty.botics.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SILVER = registerItem("silver", new Item(new FabricItemSettings()));
    public static final Item SILVER_CHUNK = registerItem("silver_chunk", new Item(new FabricItemSettings()));
    public static final Item PLATINUM = registerItem("platinum", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_SOCKET = registerItem("platinum_socket", new Item(new FabricItemSettings()));
    public static final Item GOLD_SCRAP = registerItem("gold_scrap", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item TENDRIL = registerItem("tendril", new Item(new FabricItemSettings().food(ModFoodComponents.TENDRIL)));
    public static final Item FOSSIL_FUEL_CHUNK = registerItem("fossil_fuel_chunk", new Item(new FabricItemSettings()));

    public static final Item WRENCH = registerItem("wrench", new Item(new FabricItemSettings().maxCount(1)));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(SILVER);
        entries.add(SILVER_CHUNK);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Botics.MOD_ID,name), item);
    }

    public static void registerModItems(){
        Botics.LOGGER.info("Registering Mod Items for " + Botics.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }

}
