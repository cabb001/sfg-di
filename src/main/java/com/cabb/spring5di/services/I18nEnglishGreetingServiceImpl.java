package com.cabb.spring5di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("i18Service")
public class I18nEnglishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - EN";
    }
}
