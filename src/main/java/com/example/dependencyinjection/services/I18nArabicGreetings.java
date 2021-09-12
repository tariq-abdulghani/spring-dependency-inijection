package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Ar")
@Service("i18nService")
public class I18nArabicGreetings implements Greetings{
    @Override
    public String greet() {
        return "Hello in Arabic";
    }
}
