package me.angeschossen.landsdiscordbot.api;

import me.angeschossen.landsdiscordbot.api.manager.Linkmanager;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class LandsDiscordBotAPI {
    public static CompletableFuture<Boolean> setLinkManagerAsync(Linkmanager linkManager) {
        return null;
    }

    @Deprecated
    public static boolean setLinkManager(Linkmanager linkManager) {
        return true;
    }

    public static boolean isCustomLinkManagerSet() {
        return false;
    }

    public static Linkmanager getCurrentLinkManager() {
        return null;
    }

    public static CompletableFuture<Void> syncPlayer(UUID uuid) {
        return null;
    }
}
