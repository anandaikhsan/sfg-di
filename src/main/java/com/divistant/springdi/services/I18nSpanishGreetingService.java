package com.divistant.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Bean ini tersedia untuk profile 'ES'.
 * Profile 'default' menandakan jika tidak
 * ada konfigurasi profile yang aktif, maka
 * Bean ini yang akan dipilih.
  */
@Profile({"ES", "default"})
@Service("i18nGreetingService") // Memberi nama(qualifier) pada Bean
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo! (ES Profile)";
    }
}
