package org.example.gtmk2024.presentation;

import org.example.gtmk2024.presentation.responses.SeedRetreivalResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalEndpoints {

    @GetMapping("/api/seed")
    public SeedRetreivalResponse getSeed() {
        throw new RuntimeException("TODO");
    }
}
