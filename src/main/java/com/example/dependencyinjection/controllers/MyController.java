package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.scope.PrototypeScopedBeen;
import com.example.dependencyinjection.scope.SingletonScopedBeen;
import com.example.dependencyinjection.services.Greetings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


//    when field injections are required
//    @Autowired
    private final Greetings greetingsService ;
    
    @Autowired
    private  SingletonScopedBeen singletonScopedBeen;
    
    @Autowired
    private PrototypeScopedBeen prototypeScopedBeen;

    public MyController(/*@Qualifier("hello")*/ Greetings greetingsService) {
        /*
        qualifiers are used to decide what
        implementation is required
        */
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.greet();
    }
}
