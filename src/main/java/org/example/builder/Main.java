package org.example.builder;

public class Main {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee
                .CoffeeBuilder()
                .setCoffeeType("Latte")
                .setMilk(true)
                .setSugar(true)
                .setSize(CoffeeSize.LARGE)
                .build();
        System.out.println(coffee1);
    }
}
