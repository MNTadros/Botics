package empty.botics;

import empty.botics.block.ModBlocks;
import empty.botics.block.entity.ModBlockEntities;
import empty.botics.item.ModItemGroups;
import empty.botics.item.ModItems;
import empty.botics.screen.ModScreenHandlers;
import empty.botics.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Botics implements ModInitializer {
	public static final String MOD_ID = "botics";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		FuelRegistry.INSTANCE.add(ModItems.FOSSIL_FUEL_CHUNK,500);
	}
}