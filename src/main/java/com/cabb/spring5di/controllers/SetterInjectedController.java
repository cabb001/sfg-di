package com.cabb.spring5di.controllers;

import com.cabb.spring5di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService service;

    @Qualifier("setterGreetingServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.sayGreeting();
    }
}
