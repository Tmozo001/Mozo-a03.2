/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;
import java.util.*;

public class solution33 {
    public static Scanner input = new Scanner(System.in);

    public static void magicBall(){
        //create string array of randomResponses
        String[] randomResponse = {"Yes.", "No.", "Maybe.", "Ask again later.", "I don't know, figure it out yourself.", "Bye!"};
        Random response = new Random();

        //create an int that takes a random number up to the length of the array
        //doing so selects one of the spots of the array
        int randomIndex = response.nextInt(randomResponse.length);

        //write a string that takes the random reply gotten
        String reply = randomResponse[randomIndex];

        //print the reply
        System.out.printf("%s",reply);
    }

    public static void main(String[] args) {
        //ask user for their question
        System.out.print("What's your question?\n");
        String doesNotMatter = input.nextLine();

        //call magic ball method
        magicBall();


    }

}
