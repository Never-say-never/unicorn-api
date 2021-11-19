package com.example.demo.rest;

import com.example.demo.unicorn.UnicornFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/unicorn")
public class UnicornController {
    private final UnicornFacade unicornService;

    @Autowired
    public UnicornController(UnicornFacade unicornService) {
        this.unicornService = unicornService;
    }

    @ResponseBody
    @GetMapping("/{unicornName}")
    public String showUnicorn(@PathVariable("unicornName") String unicornName) {
        return unicornService.summonUnicorn(unicornName);
    }
}
