package com.example.demo.unicorn;

import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
class UnicornRepository {

    Optional<Unicorn> deleteByName(final String name) {
        return Optional.of(new Unicorn(name));
    }

    public Set<Unicorn> findUnicornByRainbowId(Long rainbowId) {
        return Set.of(new Unicorn("Handsome"),
                new Unicorn("Sweet Pie"));
    }
}