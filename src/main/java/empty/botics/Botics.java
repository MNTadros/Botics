package empty.botics;

import empty.botics.block.ModBlocks;
import empty.botics.item.ModItemGroups;
import empty.botics.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Botics implements ModInitializer {
	public static final String MOD_ID = "botics";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric World!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.FOSSIL_FUEL_CHUNK,500);
	}
}