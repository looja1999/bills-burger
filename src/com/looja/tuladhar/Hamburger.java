package com.looja.tuladhar;

public class Hamburger {

    //fields
    private String burgerName;
    private String breadType;
    private String meatType;
    private int basePrice;


    //additions
    private int lettuce = 0;
    private int tomato = 0;
    private int carrot = 0;
    private int cheese = 0;

    //additions with cost
    private int lettuceCost = 0;
    private int tomatoCost = 0;
    private int carrotCost = 0;
    private int cheeseCost = 0;

    //total
    private int totalCost;

    //constructor
    public Hamburger(String breadType, String meatType, int basePrice){
        this.breadType = breadType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }

    //set burger Name
    public void setBurgerName(String burgerName){
        this.burgerName = burgerName;
    }

    //add lettuce
    public void addLettuce(int quantity){
        lettuce+= quantity;
        lettuceCost = lettuce * 2; //Per lettuce cost = 2
    }

    //add tomato
    public void addTomato(int quantity){
        tomato+= quantity;
        tomatoCost = tomato * 2; //Per tomato cost = 2
    }

    //add carrot
    public void addCarrot(int quantity){
        carrot+= quantity;
        carrotCost = carrot * 3; //Per carrot cost = 3
    }

    //add cheese
    public void addCheese(int quantity){
        cheese+= quantity;
        cheeseCost = cheese * 4; //Per cheese cost = 4
    }

    //calculates total cost
    public int getTotalCost() {
        totalCost = basePrice + lettuceCost + tomatoCost + carrotCost + cheeseCost;
        return totalCost;
    }
}
