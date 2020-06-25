package com.divistant.springdi.controllers;

import com.divistant.springdi.services.GreetingService;

/**
 * Contoh class yang melakukan Dependency Injection
 * menggunakan property
 */
public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
