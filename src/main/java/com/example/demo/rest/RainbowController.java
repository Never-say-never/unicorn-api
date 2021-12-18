package com.example.demo.rest;

import com.example.demo.rainbow.RainbowFacade;
import com.example.demo.unicorn.UnicornDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
@RequestMapping("/rainbow")
public class RainbowController {
    private final RainbowFacade rainbowFacade;

    @Autowired
    public RainbowController(RainbowFacade rainbowFacade) {
        this.rainbowFacade = rainbowFacade;
    }

    @ResponseBody
    @GetMapping("/{rainbowName}/unicorns")
    public Set<UnicornDto> getUnicorn(@PathVariable("rainbowName") String rainbowName) {
        return rainbowFacade.getRainbowMembers(rainbowName);
    }
}
