package org.example.gtmk2024.model.players;

import org.jetbrains.annotations.NotNull;

public class UnknownPlayerException extends Throwable {
    public UnknownPlayerException(@NotNull Long id) {
        super("The player with the id " + id + " could not be found.");
    }
}
