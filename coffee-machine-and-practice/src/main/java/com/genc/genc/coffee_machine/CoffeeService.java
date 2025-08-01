package com.genc.genc.coffee_machine;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {
    CoffeeMachine coffeeMachine;

    //    @Autowired
    public CoffeeService(CoffeeMachine expressoMachine) {
        this.coffeeMachine = expressoMachine;
    }

    @PostConstruct
    public void init() {

        System.out.println("Creating CoffeeService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying CoffeeService");
    }

    public void makeCoffee() {
        coffeeMachine.makeCoffee();
    }
}
