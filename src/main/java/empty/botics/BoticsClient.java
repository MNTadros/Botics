package empty.botics;

import empty.botics.block.ModBlocks;
import empty.botics.screen.ModScreenHandlers;
import empty.botics.screen.SocketApplicatingScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class BoticsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TENDRIL_CROP, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.SOCKET_APPLICATING_SCREEN_HANDLER, SocketApplicatingScreen::new);
    }
}
