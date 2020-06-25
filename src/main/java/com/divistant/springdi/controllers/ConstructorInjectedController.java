package com.divistant.springdi.controllers;

import com.divistant.springdi.services.GreetingService;

/**
 * Contoh class yang melakukan Dependency Injection
 * melalui constructor.
 */
public class ConstructorInjectedController {
    //property yang akan di-inject dideklarasikan sebagai final
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
