package com.cabb.spring5di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Property Service ";
    }
}
