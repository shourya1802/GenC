package com.genc.genc.coffee_machine;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
    final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Before("execution(void com.genc.genc.coffee_machine.CoffeeService.makeCoffee())")
    public void logBeforeCoffeeBrew() {
        logger.info("Coffee brewing...");
    }

    @After("execution(void com.genc.genc.coffee_machine.CoffeeService.makeCoffee())")
    public void logAfterCoffeeBrew() {
        logger.info("Coffee brewed...");
    }
}
