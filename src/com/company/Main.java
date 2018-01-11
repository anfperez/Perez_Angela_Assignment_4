package com.company;

import java.lang.String;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        //creates a new shopping cart
        ShoppingCart angela = new ShoppingCart("Angela P", new ArrayList<Item>());

        //creates new Items
        Item catfood = new Item("catfood", 5.99);
        Item chickenbreast = new Item("chicken breast", 4.69);
        Item soymilk = new Item("soy milk", 3.99);

        //adds Items to the ShoppingCart's Item ArrayList
        angela.addItem(catfood);
        angela.addItem(chickenbreast);
        angela.addItem(soymilk);

        //prints out the items currently in the ShoppingCart
        for (int i = 0; i < angela.getItems().size(); i++) {
            System.out.println(angela.getItems().get(i));
        }

        //creates a new OnlineStore to calculate the prices of the Items in the ShoppingCart
        OnlineStore calculateShoppingCart = new OnlineStore(angela);

        //creates a new CheckoutSystem that will create a receipt for the purchased items
        CheckoutSystem checkOutOrder = new CheckoutSystem(calculateShoppingCart);

        //DecimalFormat will reformat the prices in the cart to two decimal places
        DecimalFormat df1 = new DecimalFormat("##.00");

        DecimalFormat df2 = new DecimalFormat("####");

        DecimalFormat df3 = new DecimalFormat("####");

        //prints out the final receipt
        System.out.println("Thank you. You have paid $" + df1.format(calculateShoppingCart.getTotalPrice()) + " with credit card ending in " + df3.format(checkOutOrder.getCCnum()) + ". Your confirmation number is " + df2.format(checkOutOrder.getConfNum()) + ".");

    }
}
