package org.example.gtmk2024.presentation;

import org.example.gtmk2024.model.players.Player;
import org.example.gtmk2024.presentation.responses.NewPlayerResponse;
import org.example.gtmk2024.presentation.responses.PlayerConnectionResponse;
import org.example.gtmk2024.presentation.responses.PlayerDeletionResponse;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

@RestController
public final class PlayerEndpoints {

    @PutMapping("/api/player")
    public NewPlayerResponse newPlayer(@RequestParam(value = "username", defaultValue = "Gamocologists") String username) {
        if (!Objects.equals(username, "Gamocologists")) {
            Player player = new Player(username);

            return new NewPlayerResponse(player.getUsername(), player.getId());
        }

        String newGenericUsername = generateNewName();
        Player newPlayer = new Player(newGenericUsername);

        return new NewPlayerResponse(newPlayer.getUsername(), newPlayer.getId());
    }

    @PatchMapping("/api/player")
    public PlayerConnectionResponse connectPlayer(@RequestParam(value = "id") long id) {
        throw new RuntimeException("TODO");
    }

    @DeleteMapping("/api/player/{id}")
    public PlayerDeletionResponse deletePlayer(@PathVariable Long id) {
        throw new RuntimeException("TODO");
    }

    @GetMapping("/api/players")
    public PlayersRetreivalResponse getPlayers() {
        throw new RuntimeException("TODO");
    }

    @GetMapping("/api/player/{id}")
    public PlayerRetreivalResponse getPlayer(@PathVariable Long id) {
        throw new RuntimeException("TODO");
    }

    private String generateNewName() {

    }
}
