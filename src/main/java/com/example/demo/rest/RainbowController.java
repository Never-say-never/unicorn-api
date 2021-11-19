package com.example.demo.rest;

import com.example.demo.rainbow.RainbowFacade;
import com.example.demo.unicorn.UnicornDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping("/rainbow")
public class RainbowController {
    private final RainbowFacade rainbowFacade;

    @Autowired
    public RainbowController(RainbowFacade rainbowFacade) {
        this.rainbowFacade = rainbowFacade;
    }

    @GetMapping("/{rainbowName}")
    public Set<UnicornDto> showUnicorn(@PathVariable("name") String rainbowName) {
        return rainbowFacade.getRainbowMembers(rainbowName);
    }
}
