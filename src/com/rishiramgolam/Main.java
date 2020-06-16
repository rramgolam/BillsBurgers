package com.rishiramgolam;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.25);
        System.out.println("Price " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.addHamburgerAddition1("Soya", 0.99);
        healthyBurger.addHamburgerAddition2("Beans", 1.99);
        healthyBurger.addHamburgerAddition3("Cabbage", 2.99);
        healthyBurger.addHamburgerAddition5("Quorn", 3.99);
        System.out.println(healthyBurger.itemizeHamburger());

        DeluxeHamburger deluxe = new DeluxeHamburger();
        System.out.println(deluxe.itemizeHamburger());
    }
}
