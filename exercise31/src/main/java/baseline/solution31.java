/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;
import java.util.*;

public class solution31 {
    public static Scanner input = new Scanner(System.in);

    private static int getRP(){
        //ask user for resting heart rate
        System.out.print("Resting Pulse: ");
        //scan into variable RP
        int RP = input.nextInt();

        return RP;
        }

    private static int getAge() {
        //ask user for age until a valid number is entered
        System.out.print("Age: ");
        int age = input.nextInt();
        //if invalid, print invalid and ask again
        if (age<1){
            System.out.print("Invalid Input!");
            getAge();
        }

        return age;
    }

    private static void calcTargetHeartRate(int RP, int age){
        //take in RP and age
        //loop through each iteration of intensity increasing 5% each time
        for(int intensity = 50 ; intensity<=95 ; intensity+=5){
            int TargetHeartRate = (int) ((((220 - age) - RP) * (intensity/100.0)) + RP);
            System.out.printf("%d%%\t\t| %d bpm%n", intensity, TargetHeartRate);
        }
        //print ("%d%%\t\t| %f bpm", intensity, TargetHeartRate)

    }

    public static void main(String[] args) {
        //call getRP
        int RP = getRP();
        //call getAge
        int age = getAge();
        //build first part of table
        System.out.print("Intensity\t | Rate\n-------------|--------");

        //call calcTargetHeartRate
        calcTargetHeartRate(RP, age);
    }
}
