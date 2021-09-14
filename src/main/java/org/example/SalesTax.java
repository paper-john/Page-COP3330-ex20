package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class SalesTax
{
    public static void main( String[] args )
    {
        // declare variables
        int otherAmt;
        double tax = 0.0, total = 0.0;
        String state, county;

        Scanner input = new Scanner(System.in);

        //Get user input
        System.out.print("What is the order amount? ");
        otherAmt = input.nextInt();

        System.out.print("What state do you live in? ");
        state = input.next();

        //calculate tax based on state and county
        if (state.equals("Wisconsin"))
        {
            System.out.print("What county do you live in? ");
            county = input.next();

            switch (county)
            {
                case "Dane":
                    tax = (otherAmt * .05);
                    total = (otherAmt + tax);
                    break;
                case "Dunn":
                    tax = (otherAmt * .054);
                    total = (otherAmt + tax);
                    break;
                case "Eau Claire":
                    tax = (otherAmt * .055);
                    total = (otherAmt + tax);
                    break;
                default:
                    System.out.println("Error county not in system");
                    break;
            }
        }
        else if (state.equals("Illinois"))
        {
            tax = (otherAmt * .08);
            total = (otherAmt + tax);
        }
        else
        {
            tax = 0;
            total = otherAmt;
        }
        //Calculate tax
        tax = Math.round(tax*100.0) / 100.0;
        otherAmt = Math.round(otherAmt * 100) / 100;
        total = tax + otherAmt;

        // Display result
        System.out.println("The tax is $" +String.format("%.2f", tax)+ "\n" + "The total is $" +String.format("%.2f", total)+".");
    }
}
