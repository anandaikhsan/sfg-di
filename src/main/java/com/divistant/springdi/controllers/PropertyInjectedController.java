package com.divistant.springdi.controllers;

import com.divistant.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Contoh class yang melakukan Dependency Injection
 * menggunakan property
 *
 * Anotasi @Controller memberitahu Spring bahwa class
 * ini merupakan Spring managed component
 */

@Controller
public class PropertyInjectedController {

    // Memberitahu Spring class yang harus di-inject
    @Qualifier("propertyInjectedGreetingService")
    // Memberitahu Spring untuk melakukan injeksi pada property
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
