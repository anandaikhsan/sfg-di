package com.divistant.springdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Class termasuk komponen yang di manage oleh spring context
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hallo semua!";
    }
}
