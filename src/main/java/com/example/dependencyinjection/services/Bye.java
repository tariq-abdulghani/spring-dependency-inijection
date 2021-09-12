package com.example.dependencyinjection.services;

import org.springframework.stereotype.Component;

@Component
public class Bye implements Greetings{
    @Override
    public String greet() {
        return "Bye....................!";
    }
}
