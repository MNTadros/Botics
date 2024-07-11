package empty.botics.screen;

import empty.botics.Botics;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<SocketApplicatingScreenHandler> SOCKET_APPLICATING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Botics.MOD_ID, "socket_applicating"),
                    new ExtendedScreenHandlerType<>(SocketApplicatingScreenHandler::new));

    public static void registerScreenHandlers() {
        Botics.LOGGER.info("Registering Screen Handlers for " + Botics.MOD_ID);
    }
}