package empty.botics.item;

import empty.botics.Botics;
import empty.botics.item.custom.MetalDetectorItem;
import empty.botics.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
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
    public static final Item FRIEND_BALL = registerItem("friend_ball", new Item(new FabricItemSettings().maxCount(1)));

    public static final Item URANIUM = registerItem("uranium", new Item(new FabricItemSettings()));
    public static final Item HOURGLASS = registerItem("hourglass", new Item(new FabricItemSettings()));

    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new PickaxeItem(ModToolMaterial.PLATINUM, 2, 2f, new FabricItemSettings()));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new AxeItem(ModToolMaterial.PLATINUM, 3, 1f, new FabricItemSettings()));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterial.PLATINUM, 0, 0f, new FabricItemSettings()));
    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterial.PLATINUM, 5, 3f, new FabricItemSettings()));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new HoeItem(ModToolMaterial.PLATINUM, 0, 0f, new FabricItemSettings()));

    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new ModArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

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
