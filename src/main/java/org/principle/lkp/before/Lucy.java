package org.principle.lkp.before;

public class Lucy {
    public void eat(){
        Vegetable vegetable =new Vegetable();
        Bread bread =new Bread();
        Beef beef =new Beef();
        Hamburger hamburger =new Hamburger(vegetable,bread,beef);
        System.out.println("lucy eat hamburger");
    }
}
