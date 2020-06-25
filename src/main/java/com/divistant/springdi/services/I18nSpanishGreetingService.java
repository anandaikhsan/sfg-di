package com.divistant.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES") // Bean ini tersedia untuk profile 'EN'
@Service("i18nGreetingService") // Memberi nama(qualifier) pada Bean
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo! (ES Profile)";
    }
}
