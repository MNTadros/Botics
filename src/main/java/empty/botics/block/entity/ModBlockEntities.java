package empty.botics.block.entity;

import empty.botics.Botics;
import empty.botics.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<SocketApplicatorBlockEntity> SOCKET_APPLICATOR_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Botics.MOD_ID, "gem_polishing_be"),
                    FabricBlockEntityTypeBuilder.create(SocketApplicatorBlockEntity::new,
                            ModBlocks.SOCKET_APPLICATOR).build());

    public static void registerBlockEntities() {
        Botics.LOGGER.info("Registering Block Entities for " + Botics.MOD_ID);
    }
}