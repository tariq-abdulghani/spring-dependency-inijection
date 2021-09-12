package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.Greetings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final Greetings greetingsService;

    public I18nController(@Qualifier("i18nService") Greetings greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.greet();
    }
}
