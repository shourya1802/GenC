package com.genc.genc.coffee_machine;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

@Qualifier("latteMachine")
@Scope("prototype")
public class LatteMachine implements CoffeeMachine {
    List<String> ingredients = new ArrayList<>();

    @Override
    public void makeCoffee() {
        System.out.println("Brewing latte...");
    }
}
