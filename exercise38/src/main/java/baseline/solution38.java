/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;
import java.util.ArrayList;
import java.util.Scanner;

public class solution38 {
    public static Scanner input = new Scanner(System.in);

    private static Integer[] filterEvenNumbers(String spacedOutList[]) {
        //initialize an arrayList
        ArrayList<Integer> newList = new ArrayList<>();

        //loop through spacedoutlist checking each number if even (modulo 2)
        for(int i=0; i<spacedOutList.length; i++){

            int place = Integer.parseInt(spacedOutList[i]);
            //if even add to a new array
            if(place % 2 == 0){

                newList.add(place);
            }
        }

        Integer[] evenNumbers = new Integer[newList.size()];
        evenNumbers = newList.toArray(evenNumbers);
        //return this array
        return evenNumbers;




    }
    public static void main(String[] args) {
        //ask the user for the input numbers spaced out.
        System.out.print("Enter a list of numbers, separated by spaces: ");
        //store this into array spacedOutList
        String numbers = input.nextLine();

        String spacedOutList[] = numbers.split(" ");
        //call filterEvenNumbers
        Integer evenNumbers[] = filterEvenNumbers(spacedOutList);

        System.out.println("The even numbers are ");
        for(int i=0; i<evenNumbers.length; i++){
            if(i < evenNumbers.length-1){
                System.out.print(evenNumbers[i] + " ");
            }
            else
            {
                System.out.print(evenNumbers[i] + ".");
            }
        }





    }
}