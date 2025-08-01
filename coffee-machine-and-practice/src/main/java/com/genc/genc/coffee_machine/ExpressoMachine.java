package com.genc.genc.coffee_machine;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("expressoMachine")
@Scope("singleton")
public class ExpressoMachine implements CoffeeMachine {

    @Override
    public void makeCoffee() {
        System.out.println("Brewing expresso...");
    }
}
