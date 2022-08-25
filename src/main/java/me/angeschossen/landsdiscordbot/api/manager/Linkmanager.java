package me.angeschossen.landsdiscordbot.api.manager;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface Linkmanager {

    /**
     * Get Discord id of a minecraft player.
     *
     * @param uuid UID of minecraft player
     * @return Discord ID. Null if not linked.
     */
    @Nullable
    String getDiscordId(@NotNull UUID uuid);

    /**
     * Get uid of a minecraft player by his discord id
     *
     * @param discordId Discord id
     * @return Minecraft uid. Null if not linked.
     */
    @Nullable
    UUID getUID(long discordId);

    /**
     * Get status of link manager. This is useful if you use asynchronous database access on startup.
     *
     * @return Linkmanager status
     */
    boolean isReady();

    /**
     * Get name of link manager.
     * @return Name of link manager.
     */
    @Deprecated
    @NotNull
    String getName();

    /**
     * Get link usage
     * Example: /Discord link
     */
    @NotNull
    String getUsage();

    /**
     * @return The plugin that provides this link manager.
     */
    @NotNull Plugin getPlugin();
}
