package com.divistant.springdi.services;

import org.springframework.stereotype.Service;

/**
 * Class merupakan spring managed component
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Halo Dunia!";
    }
}
