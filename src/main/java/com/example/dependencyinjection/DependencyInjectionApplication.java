package com.example.dependencyinjection;

import com.example.dependencyinjection.controllers.I18nController;
import com.example.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");
        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(myController.sayHello());
        System.out.println(i18nController.sayHello());
    }

}
