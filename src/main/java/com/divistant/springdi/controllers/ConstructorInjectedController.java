package com.divistant.springdi.controllers;

import com.divistant.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Contoh class yang melakukan Dependency Injection
 * melalui constructor.
 */

@Controller
public class ConstructorInjectedController {
    //property yang akan di-inject dideklarasikan sebagai final
    private final GreetingService greetingService;

    /**
     * Constructor based Injection tidak memerlukan (Opsional)
     * anotasi @AutoWired.
     *
     * Anotasi @Qualifier memberitahu Spring class mana
     * yang harus di-inject
     */
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
