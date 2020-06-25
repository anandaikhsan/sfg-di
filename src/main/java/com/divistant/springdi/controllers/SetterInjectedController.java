package com.divistant.springdi.controllers;

import com.divistant.springdi.services.GreetingService;

/**
 * Contoh class yang melakukan Dependency Injection
 * melalui method setter.
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
