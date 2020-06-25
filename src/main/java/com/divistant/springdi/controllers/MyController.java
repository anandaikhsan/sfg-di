package com.divistant.springdi.controllers;

import com.divistant.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Class termasuk komponen yang di manage oleh spring context
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
