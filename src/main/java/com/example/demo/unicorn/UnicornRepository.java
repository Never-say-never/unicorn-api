package com.example.demo.unicorn;

import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Random;
import java.util.Set;

@Repository
class UnicornRepository {
    Optional<Unicorn> findUnicornByName(final String name) {
        return Optional.of(new Unicorn(name, new Random().nextInt()));
    }

    public Set<Unicorn> findUnicornByRainbowId(Long rainbowId) {
        return Set.of(new Unicorn("Handsome", new Random().nextInt()),
                new Unicorn("Sweet Pie", new Random().nextInt()));
    }
}