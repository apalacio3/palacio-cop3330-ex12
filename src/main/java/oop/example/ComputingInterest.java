/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputingInterest
{
    public static void main( String[] args )
    {
        System.out.print( "Enter the principal: " );
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        double principal = Double.parseDouble(a);

        System.out.print( "Enter the rate of interest: " );
        String b = input.nextLine();
        double rate  = Double.parseDouble(b);

        System.out.print( "Enter the number of years: " );
        String c = input.nextLine();
        double time  = Double.parseDouble(c);

        double interest = principal * (1 + (rate/100) * time);

        DecimalFormat d = new DecimalFormat("#.##");

        String output = "After " + time + " years at " + rate
                + "%, the investment will be worth $" + d.format(interest) + ".";

        System.out.println(output);
    }
}
