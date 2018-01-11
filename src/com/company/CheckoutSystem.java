package com.company;

import java.util.Random;

import java.util.Scanner;

public class CheckoutSystem {

    Scanner scanner = new Scanner(System.in);

    private int creditCardNumber;

    private int confirmationNumber;

    //returns confirmation number
    public double getConfNum() {
        return confirmationNumber;
    }

    //returns credit card number
    public double getCCnum() {
        return creditCardNumber;
    }

    Random rand = new Random();

    CheckoutSystem(OnlineStore os) {
        System.out.println("What is your credit card number? Please enter the last four digits");

        //takes the last four digits of the user's CC numbers
        creditCardNumber = scanner.nextInt();
        System.out.println(creditCardNumber);

        //generates a random 5 digit number between 10000 and 99999 for the confirmation number
        confirmationNumber = rand.nextInt(99999) + 10000;

    }
}
