/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;
import java.util.*;

public class solution32 {
    public static Scanner input = new Scanner(System.in);

    private static int getDifficulty() {
        //ask user for difficulty
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int difficulty = input.nextInt();

        return difficulty;
    }

    private static int getRandomNum(int difficulty) {

        //based on what difficulty
        //use built-in java function to generate randNum in that range.

        if (difficulty == 1) { //if difficulty is 1 randNum is between 0-10
            int randomNum = (int) (Math.random() * 10 + 1);
            return randomNum;
        } else if (difficulty == 2) { //if difficulty is 2 randNum is between 0-100
            int randomNum = (int) (Math.random() * 100 + 1);
            return randomNum;
        } else {   //if difficulty is 3 randNum is between 0-1000
            int randomNum = (int) (Math.random() * 1000 + 1);
            return randomNum;
        }


    }

    private static void letTheGameBegin(int randomNum) {
        //prompt the user to enter a number
        int guess;
        int total = 0;
        System.out.print("I have my number. What's your guess? \n");
        do{
            guess = input.nextInt();
            total++;
            if (guess == randomNum){//if correct prompt correct and how many guesses it took
                System.out.printf("You got it in %d guesses!",total);
            }
            else if (guess < randomNum) {//if their guess is below prompt too low
                System.out.println("Too low. Guess again: ");
            }
            else if (guess > randomNum) {//if their guess is above prompt too high
                System.out.println("Too high. Guess again: ");
            }
        }while (guess != randomNum);

    }

    private static void GuessTheNumber() {
        System.out.print("Let's play Guess the Number!\n\n");
        // call get difficulty
        int difficulty = getDifficulty();
        //call get randomNum
        int randomNum = getRandomNum(difficulty);
        //call letTheGameBegin
        letTheGameBegin(randomNum);

        System.out.print("Do you wish to play again?");
        char repeat = input.next().charAt(0);
        if (repeat == 'Y' || repeat == 'y') {
            GuessTheNumber();
        }
        else
            return;

    }

        public static void main (String[]args){
            GuessTheNumber();
        }
    }

