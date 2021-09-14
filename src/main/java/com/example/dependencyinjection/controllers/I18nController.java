package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.Greetings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
public class I18nController implements BeanFactoryAware, ApplicationContextAware {
	@Autowired
    private Logger LOGGER;// = LoggerFactory.getLogger(I18nController.class);
    private final Greetings greetingsService;

    public I18nController(@Qualifier("i18nService") Greetings greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.greet();
    }

    @PostConstruct
    void afterInit(){
        LOGGER.warn("......................post construct is called......................");
    }

    @PreDestroy
    void beforeDestruction(){
        LOGGER.warn("....................pre Destroy is called..........................");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        LOGGER.warn(".................... been Factory aware..........................");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOGGER.warn(".................... Application context aware ..........................");
    }
}
