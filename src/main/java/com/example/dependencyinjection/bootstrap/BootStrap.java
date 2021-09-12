package com.example.dependencyinjection.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(BootStrap.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info(".....................spring boot started.................");
    }
}
