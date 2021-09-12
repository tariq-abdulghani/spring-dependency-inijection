package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("En")
@Service("i18nService")
public class I18nEnglishGreetings implements Greetings{
    @Override
    public String greet() {
        return "Hello in English";
    }
}
