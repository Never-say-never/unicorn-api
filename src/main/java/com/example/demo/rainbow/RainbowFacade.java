package com.example.demo.rainbow;

import com.example.demo.unicorn.UnicornDto;
import com.example.demo.unicorn.UnicornFacade;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class RainbowFacade {

    private final RainbowService rainbowService;
    private final UnicornFacade unicornFacade;

    public RainbowFacade(RainbowService rainbowService, UnicornFacade unicornFacade) {
        this.rainbowService = rainbowService;
        this.unicornFacade = unicornFacade;
    }

    public Set<UnicornDto> getRainbowMembers(final String rainbowName) {
        return rainbowService.getRainbowIdByName(rainbowName)
                .map(unicornFacade::getUnicorns)
                .orElseThrow(() -> new RuntimeException("Rainbow is empty"));
    }
}
