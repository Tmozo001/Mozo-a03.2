/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tyler Mozo
 */
package exercise25;
import java.io.*;
import java.util.*;


public class solution25 {
    public static Scanner input = new Scanner(System.in);

    private static String getPass(){
        //ask user for pass
        System.out.print("Enter your password: ");
        //scan in pass
        String pass = input.next();
        //return pass
        return pass;
    }
    private static void passwordValidator(String pass){

        // use a variable to access java built in function length
        int n = pass.length();

        //assign each case to false, in order to flag true when true
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean specialChar = false;

        //giving what falls into the specialCharacter category
        Set<Character> specialCharacter = new HashSet<Character>(Arrays.asList('!', '@', '#',
                '$', '%', '^', '&', '*', '(', ')', '.', '-', '+', ';', ':'));
//going character by character running each of these tests
        for (char i : pass.toCharArray()) {
            //check if the character is a lower case
            if (Character.isLowerCase(i))
                hasLower = true;
            //check if the character is a upper case
            if (Character.isUpperCase(i))
                hasUpper = true;
            //check if the character is a digit
            if (Character.isDigit(i))
                hasDigit = true;
            //check if the character is a special character
            if (specialCharacter.contains(i))
                specialChar = true;
        }
//if all criteria is met (special, digit, upper, lower)
        if (hasDigit && hasLower || hasUpper && specialChar
                && (n >= 8))
            System.out.printf("The password \'%s\' is a very strong password.", pass);
//if either upper or lower or special
        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            System.out.printf("The password \'%s\' is a strong password.", pass);
//if only has upper and lower
        else if(hasLower || hasUpper && (n < 8))
            System.out.printf("The password \'%s\' is a weak password.", pass);
//else if only digits
        else
            System.out.printf("The password \'%s\' is a very weak password.", pass);

        // check if pass has special characters
        //check if its a number
        //loop through each character of the pass and check what it is
        //assign each of these values to a number
        //if number is above a certain threshold (>=8 , ...)
        //sum together to get a total or if higher print if 1 && 2 print....

    }

    public static void main(String[] args) {
        //call getPass
        String pass = getPass();
        //call passwordValidation to do all the heavy lifting
        passwordValidator(pass);
    }
}











