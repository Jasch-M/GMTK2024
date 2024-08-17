package org.example.gtmk2024.model;

import java.util.Random;

public class RandomInstance {

    public static final RandomInstance INSTANCE = new RandomInstance();

    public final long seed;

    public final Random rng;

    private RandomInstance() {
        Random random = new Random();
        rng = new Random();

        seed = random.nextLong();
        rng.setSeed(seed);
    }
}
