package com.example.demo.unicorn;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
class UnicornService {

    private final UnicornRepository unicornRepository;

    UnicornService(UnicornRepository unicornRepository) {
        this.unicornRepository = unicornRepository;
    }

    String summonUnicorn(final String unicornName) {
        Optional<Unicorn> unicornOptional = unicornRepository.findUnicornByName(unicornName);

        return unicornOptional.map(unicorn -> "Summon a unicorn '" + unicorn.getName()
                        + "', creature of rainbow, fast as lightning: " + unicorn.getSpeed() + "km/ph")
                .orElseThrow(() -> new UnicornNotFoundException(unicornName));
    }

    Set<UnicornDto> unicornsOnRainbow(Long rainbowId) {
        Set<Unicorn> unicornOptional = unicornRepository.findUnicornByRainbowId(rainbowId);

        return unicornOptional.stream()
                .map(UnicornDto::of)
                .collect(Collectors.toSet());
    }
}