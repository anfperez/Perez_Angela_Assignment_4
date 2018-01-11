package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;

public class OnlineStore {

    private String owner;

    private double shippingPrice = 5.99;

    private double tax = 0.08;

    //will contain the price of the items plus tax and shipping
    private double totalPrice;

    //getter method
    public double getTotalPrice() {
        return totalPrice;
    }

    DecimalFormat df = new DecimalFormat("##.00");

    OnlineStore(ShoppingCart sc) {
        this.owner = sc.getName();
        double totalItemPrice = 0;
        for (int i = 0; i < sc.getItems().size(); i++) {

            //calculates total price of the items
            totalItemPrice = totalItemPrice + sc.getItems().get(i).getItemPrice();

            //takes total prices and adds tax and shipping price
            totalPrice = totalItemPrice + (totalItemPrice * tax) + shippingPrice;

        }

        System.out.println("The total price of " + owner + "'s shopping cart is $" + df.format(totalPrice));

    }
}
