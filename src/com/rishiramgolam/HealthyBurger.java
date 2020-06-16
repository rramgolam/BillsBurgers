package com.rishiramgolam;

public class HealthyBurger extends Hamburger {

    private String additional5Name;
    private double additional5Price;

    private String additional6Name;
    private double additional6Price;

    public HealthyBurger() {
        super("Health Burger", "Vegetarian", 4.99, "Brown Rye Bread");
    }

    public void addHamburgerAddition5(String name, double price) {
        this.additional5Name = name;
        this.additional5Price = price;
        System.out.println("Added " + this.additional5Name
                + " for an extra " + this.additional5Price);
    }

    public void addHamburgerAddition6(String name, double price) {
        this.additional6Name = name;
        this.additional6Price = price;
        System.out.println("Added " + this.additional6Name
                + " for an extra " + this.additional6Price);
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        System.out.println("hamburger " + this.getName() + " on a " +
               this.getBreakRollType()  + " roll , price is " + this.getPrice());

        if (this.additional5Name != null) {
            hamburgerPrice += this.additional5Price;
            System.out.println("Added " + this.additional5Name
                    + " for an extra " + this.additional5Price);
        }

        if (this.additional6Name != null) {
            hamburgerPrice += this.additional6Price;
            System.out.println("Added " + this.additional6Name
                    + " for an extra " + this.additional6Price);
        }

        return hamburgerPrice;
    }
}