package org.principle.lkp.after;

public class Lili {
    public void eat(KFC kfc){
        System.out.println("去汉堡店买汉堡！");
        Hamburger hamburger =kfc.makeHamburger();
        System.out.println("lili eat hamburger:"+hamburger);
    }
}
