package com.company;

import java.util.ArrayList;

public class ShoppingCart {

    String name;

    //this ArrayList will contain the created Items
    ArrayList<Item> items = new ArrayList<Item>(1);

    //alows Item to be added to a ShoppingCart
    public void addItem(Item i) {
        items.add(i);
        }

    //setter method
    ShoppingCart(String name, ArrayList<Item> items) {
            this.name = name;
            this.items = items;
        }

    //returns name of the ShoppingCart's owner
    String getName() {
            return name;
        }

    //getter method
    public ArrayList<Item> getItems() {
            return items;
        }


        }


