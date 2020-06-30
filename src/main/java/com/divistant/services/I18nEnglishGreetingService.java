package com.divistant.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN") // Bean ini tersedia untuk profile 'EN'
@Service("i18nGreetingService") // Memberi nama(qualifier) pada Bean
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! (EN Profile)";
    }
}
