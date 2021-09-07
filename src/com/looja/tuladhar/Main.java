package com.looja.tuladhar;

public class Main {

    public static void main(String[] args) {
        HealthyHamburger healthyBurger = new HealthyHamburger();
        System.out.println("Healthy burger cost: $" + healthyBurger.getTotalCost());

        //Add some cheese
        healthyBurger.addCheese(2);
        System.out.println("Healthy burger cost: $" + healthyBurger.getTotalCost());

        //Add some lettuce
        healthyBurger.addLettuce(1);
        System.out.println("Healthy burger cost: $" + healthyBurger.getTotalCost());

    }
}
