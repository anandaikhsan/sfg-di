package com.divistant.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Anotasi @Primary memberitahu Spring
 * bahwa class tersebut merupakan class
 * yang akan dipilih jika Anotasi @Qualifier
 * tidak ada.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Halo Dunia! (Primary Bean)";
    }
}
