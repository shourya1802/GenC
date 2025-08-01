package com.genc.genc.coffee_machine;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoffeeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CoffeeService coffeeService = applicationContext.getBean(CoffeeService.class);

        coffeeService.makeCoffee();

        applicationContext.close();
    }
}
