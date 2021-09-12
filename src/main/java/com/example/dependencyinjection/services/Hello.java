package com.example.dependencyinjection.services;

import org.springframework.stereotype.Component;

@Component
public class Hello implements Greetings{
    @Override
    public String greet() {
        return "Hello......................!";
    }
}
