package org.principle.lkp.after;

import org.principle.lkp.after.Beef;
import org.principle.lkp.after.Bread;
import org.principle.lkp.after.Vegetable;

public class KFC {
    public Hamburger makeHamburger() {
        Vegetable vegetable = new Vegetable();
        Bread bread = new Bread();
        Beef beef = new Beef();
        Hamburger hamburger = new Hamburger(vegetable, bread, beef);
        return hamburger;
    }
}
