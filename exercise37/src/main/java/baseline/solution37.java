/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;
import java.util.*;

public class solution37 {
    public static Scanner input = new Scanner(System.in);

    private static int getPassLength(){
        //ask the user for desired length of password
        System.out.print("What's the minimum length? \n");
        int length = input.nextInt();

        return length;

    }
    private static int getSpecialCharacterCount(){
        //ask the user for desired number of special characters for password
        System.out.print("How many special characters? \n");
        int special = input.nextInt();
        return special;
    }
    private static int getNumberCount(){
        //ask the user for desired number of numbers for password
        System.out.print("How many numbers? \n");
        int numbers = input.nextInt();
        return numbers;
    }

    private static String passwordFactory(int length, int special, int numbers) {
        //create a string of all the desired characters to be randomized
        String possibleLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        //create a string of all the desired special characters to be randomized
        String possibleSpecialCharacters = "!.&,;:[]?><@#${}%^*";
        //create a string of all the desired numbers to be randomized
        String possibleNumbers = "1234567890";

        //create a random object
        Random passCreation = new Random();
        ArrayList<Character> randPass = new ArrayList<>();

        //add randomly selected elements to an array
        String password = "";

        for(int i=0; i<special; i++) {
            randPass.add(possibleSpecialCharacters.charAt(passCreation.nextInt(possibleSpecialCharacters.length())));
        }
        for(int i=0; i<numbers; i++) {
            randPass.add(possibleNumbers.charAt(passCreation.nextInt(possibleNumbers.length())));
        }
        for(int i=randPass.size()-1; i<length; i++) {
            randPass.add(possibleLetters.charAt(passCreation.nextInt(possibleLetters.length())));
        }

        Collections.shuffle(randPass);

        for(Character x : randPass)
        {
            password += Character.toString(x);
        }

        return password;
    }

    public static void main(String[] args) {
        int length = getPassLength();
        int special = getSpecialCharacterCount();
        int numbers = getNumberCount();

        String password = passwordFactory(length, special, numbers);

        System.out.printf("Your password is %s",password);
    }
}
