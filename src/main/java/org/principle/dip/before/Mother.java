package org.principle.dip.before;

public class Mother {
    public void read(Book book){
        System.out.println("mother begin read:");
        book.readContent();
    }
}
