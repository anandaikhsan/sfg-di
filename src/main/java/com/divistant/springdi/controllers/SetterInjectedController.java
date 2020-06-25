package com.divistant.springdi.controllers;

import com.divistant.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Contoh class yang melakukan Dependency Injection
 * melalui method setter.
 */
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    // autowired pada method
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
