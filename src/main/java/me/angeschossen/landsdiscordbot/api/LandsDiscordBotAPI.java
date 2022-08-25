package me.angeschossen.landsdiscordbot.api;

import me.angeschossen.landsdiscordbot.api.manager.Linkmanager;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class LandsDiscordBotAPI {

    @Deprecated
    public static CompletableFuture<Boolean> setLinkManagerAsync(@NotNull Linkmanager linkManager) {
        return CompletableFuture.supplyAsync(() -> {
            setLinkManager(linkManager);
            return true;
        });
    }

    public static @NotNull Linkmanager getLinkManager() {
        return null;
    }

    public static void setLinkManager(@NotNull Linkmanager linkManager) {
    }

    public static boolean isCustomLinkManagerSet() {
        return false;
    }

    @NotNull
    public static CompletableFuture<Void> syncPlayer(@NotNull UUID uuid) {
        return null;
    }
}
