package com.cabb.spring5di.controllers;

import com.cabb.spring5di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService service;

    public MyController(GreetingService service) {
        this.service = service;
    }

    public String sayHi(){
        return service.sayGreeting();
    }
}
