package com.example.demo.unicorn;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class UnicornFacade {

    private final UnicornService unicornService;

    public UnicornFacade(UnicornService unicornService) {
        this.unicornService = unicornService;
    }

    public String decomposeUnicorn(final String unicornName) {
        return unicornService.decompose(unicornName);
    }

    public Set<UnicornDto> getUnicorns(Long rainbowId) {
        return unicornService.fetchUnicornFromRainbow(rainbowId);
    }
}
