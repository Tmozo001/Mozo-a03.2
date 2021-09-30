/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tyler Mozo
 */

package exercise24;
import java.util.Scanner;


public class solution24 {
    private static Scanner input = new Scanner(System.in);

    private static String getString1(){
        //ask user for a string
        System.out.print("Enter the first string: ");
        //assign it to a string varaible
        String string1 = input.next();
        return string1;

    }
    private static String getString2(){
        //ask user for a string
        System.out.print("Enter the second string: ");
        //assign it to a string varaible
        String string2 = input.next();
        return string2;
    }
    private static int length(String s, char ch) {
        int n = 0;
        //set up a loop to go through each string
        //check the length of s1 & s2
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ch) {
                n++;
            }
        }
        //return n, counter to determine how many loops went through giving the length
        return n;

    }
    private static boolean isAnagram(String string1, String string2) {
        //take in the strings
        char ch;
        //use built in java language functions
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        for (int i = 0; i < string1.length(); ++i) {
            ch = string1.charAt(i);
            if (ch != ' ' && length(string1, ch) != length(string2, ch)) {
                return false;
            }
        }

        for (int i = 0; i < string2.length(); ++i) {
            ch = string2.charAt(i);
            if (ch != ' ' && length(string1, ch) != length(string2, ch)){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        String string1 = getString1();
        String string2 = getString2();

        if (isAnagram(string1, string2)) {
            System.out.printf("\"%s\" and \"%s\" are anagrams", string1, string2);
        }
        else {
            System.out.printf("\"%s\" and \"%s\" are NOT anagrams", string1, string2);
        }
    }
}






