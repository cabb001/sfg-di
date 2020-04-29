package com.cabb.spring5di.controllers;

import com.cabb.spring5di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingService service;

    public I18nController(@Qualifier("i18Service") GreetingService service) {
        this.service = service;
    }

    public String sayHi(){
        return service.sayGreeting();
    }
}
