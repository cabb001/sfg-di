package com.cabb.spring5di;

import com.cabb.spring5di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring5DiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("______I18n Service");
        I18nController i18nController = (I18nController)ctx.getBean("i18nController");
        System.out.println(i18nController.sayHi());


        System.out.println("______Primary Bean");
        System.out.println(myController.sayHi());

        System.out.println("______Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("______Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("______Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }

}
