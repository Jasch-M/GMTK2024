package org.example.gtmk2024.model.players;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.gtmk2024.model.RandomInstance;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

@Getter
@Setter
@EqualsAndHashCode
public final class Player {
    private @NotNull String username;

    private @NotNull Long id;

    public Player(@NotNull String username) {
        this.username = username;

        Random rng = RandomInstance.INSTANCE.rng;

        long newId;
        do {
            newId = rng.nextLong();
        } while (Players.containsPlayer(newId));

        this.id = newId;
        Players.setPlayer(newId, this);
    }

    public Player(@NotNull Long id) throws UnknownPlayerException {
        Player player = Players.getPlayer(id);
        if (player == null) {
            throw new UnknownPlayerException(id);
        }

        this.id = player.id;
        this.username = player.username;
    }
}
