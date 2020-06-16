package com.rishiramgolam;

import java.sql.SQLOutput;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger(){
        super("Deluxe Hamburger","Prime Beef",9.99,"Brioche");
        super.addHamburgerAddition1("Fries",1.99);
        super.addHamburgerAddition2("Coke",0.99);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items allowed");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items allowed");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items allowed");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items allowed");
    }
}
