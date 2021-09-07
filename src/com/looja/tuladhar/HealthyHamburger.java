package com.looja.tuladhar;

public class HealthyHamburger extends Hamburger {

    private int item1 = 0;
    private int item1Cost;

    private int item2 = 0;
    private int item2Cost;

    public HealthyHamburger() {
        super("on a brown rye bread roll", "beef", 10);
    }

    //add item1
    public void addItem1(int quantity){
        item1+= quantity;
        item1Cost = item1 * item1Cost;
    }

    //add item2
    public void addItem2(int quantity){
        item2+= quantity;
        item2Cost = item2 * item2Cost;
    }

    @Override
    public int getTotalCost() {
        return super.getTotalCost() + item1Cost + item2Cost;
    }
}
