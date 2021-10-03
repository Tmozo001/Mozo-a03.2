/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;
import java.util.*;

public class solution35 {
    public static Scanner input = new Scanner(System.in);

    private static ArrayList createArray(){
        //create a new array nameLottery
        ArrayList<String> nameLottery = new ArrayList<String>();
        String name = null;

        do {
            System.out.println("Enter a name: ");
            name= input.nextLine();
            //fill this array while user inputs a name, add it.
            if(!name.isBlank() && !name.isEmpty())
                nameLottery.add(name);
        } //when user enters " " stop
        while(!name.isBlank() && !name.isEmpty());

        return nameLottery;
    }

    private static int randIndex(ArrayList nameLottery){
        // create random index and pick from the size of the array
        Random name = new Random();

        int winner = name.nextInt(nameLottery.size());
        //return winner
        return winner;
    }

    public static void main(String[] args) {
        ArrayList nameLottery = createArray();
        int winner = randIndex(nameLottery);
        //print required output with winner
        System.out.println("The winner is... "+nameLottery.get(winner));
    }
}