package org.principle.lkp.after;

public class Hamburger {
    private Vegetable vegetable;
    private Bread bread;
    private Beef beef;

    public Hamburger(Vegetable vegetable, Bread bread, Beef beef) {
        this.vegetable = vegetable;
        this.bread = bread;
        this.beef = beef;
        System.out.println("make a hamburger");
    }
}
