package com.company;

public class Item {

    private double itemPrice;

    private String itemName;

    Item (String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    //getter method
    public String toString() {
        return itemName + " $" + itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

}
