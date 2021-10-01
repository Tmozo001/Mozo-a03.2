/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */

package baseline;
import java.util.Scanner;

public class solution26 {

    public static Scanner input = new Scanner(System.in);

    private static double getBalance(){
        //ask user for balance
        System.out.print("What is your balance? ");
        //scan into b
        double b = input.nextDouble();
        return b;
    }

    private static double getAPR(){
        //ask user for APR
        System.out.print("What is the APR on the card (as a percentage)? ");
        //scan into APR
        double APR = input.nextDouble();
        //divide APR by 365
        double f = APR/100;
        double i = f/365;
        //scan into i
        return i;
    }

    private static double getMonthlyPayment(){
        //ask user for monthly payment
        System.out.print("What is the monthly payment you can make? ");
        //scan into p
        double p = input.nextDouble();
        return p;
    }

    private static int calcMonths(double b, double i, double p){
        //do proper calculations with given formula.
        int months = (int) (Math.ceil((-1 / 30.0) * Math.log(1 + b / p *
                (1 - Math.pow(1 + i, 30))) / Math.log(1 + i)));
        //scan this value into months
        return months;
    }

    public static void main(String[] args) {
        double b = getBalance();
        double i = getAPR();
        double p = getMonthlyPayment();

        int months = calcMonths(b, i, p);

//print months to pay off
        System.out.printf("It will take you %d months to pay off this card.", months);


    }


}
