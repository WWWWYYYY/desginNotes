package org.principle.dip.after;

public class Mother {
    public void read(Readings readings){
        System.out.println("mother begin read:");
        readings.readContent();
    }
}
