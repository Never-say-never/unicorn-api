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

    String decompose(final String unicornName) {
        Optional<Unicorn> unicornOptional = unicornRepository.deleteByName(unicornName);

        return unicornOptional.map(unicorn -> "Decompose unicorn '" + unicorn.getName()
                        + "', you get " + unicorn.getMarshmallows() + " marshmallows")
                .orElseThrow(() -> new UnicornNotFoundException(unicornName));
    }

    Set<UnicornDto> fetchUnicornFromRainbow(Long rainbowId) {
        Set<Unicorn> unicornOptional = unicornRepository.findUnicornByRainbowId(rainbowId);

        return unicornOptional.stream()
                .map(UnicornDto::of)
                .collect(Collectors.toSet());
    }
}