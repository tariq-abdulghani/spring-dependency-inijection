package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.Greetings;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


//    when field injections are required
//    @Autowired
    private final Greetings greetingsService ;

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
