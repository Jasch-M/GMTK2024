package org.example.gtmk2024.model.players;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Dictionary;
import java.util.Hashtable;

public final class Players {

    private static final Dictionary<@NotNull Long,Player> players = new Hashtable<>();

    public static boolean containsPlayer(long id) {
        return players.get(id) != null;
    }

    public static @Nullable Player getPlayer(long id) {
        return players.get(id);
    }

    public static @Nullable Player setPlayer(@NotNull Long id, @NotNull Player player) {
        Player existingPlayer = getPlayer(id);
        players.put(id, player);

        return existingPlayer;
    }
}
