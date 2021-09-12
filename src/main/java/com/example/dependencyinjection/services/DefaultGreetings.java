package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class DefaultGreetings implements Greetings{
    @Override
    public String greet() {
        return "Hello from Default Greetings class ....!";
    }
}
