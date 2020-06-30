package com.divistant.services;

import org.springframework.stereotype.Service;

/**
 * Class merupakan spring managed component
 */
@Service
public class ConstructorInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Halo Dunia!(Constructor)";
    }
}
