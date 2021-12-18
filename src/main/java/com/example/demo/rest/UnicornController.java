package com.example.demo.rest;

import com.example.demo.unicorn.UnicornFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/unicorn")
public class UnicornController {
    private final UnicornFacade unicornService;

    @Autowired
    public UnicornController(UnicornFacade unicornService) {
        this.unicornService = unicornService;
    }

    @ResponseBody
    @DeleteMapping("/{unicornName}")
    public String deleteUnicorn(@PathVariable("unicornName") String unicornName) {
        return unicornService.decomposeUnicorn(unicornName);
    }
}
