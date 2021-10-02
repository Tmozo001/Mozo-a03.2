/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;
import java.util.*;


public class solution30 {
    public static Scanner input = new Scanner(System.in);

    private static void buildTable(){
        //run a loop increasing i from 1 to 12
        for(int i=1 ; i<=12 ; i++){
            //nested loop increases j to 12
            for(int j=1 ; j<=12 ; j++){
                int product = i * j;
                System.out.printf("%d\t",product);
            }
            //creates the table effect by creating a new line after i reaches next iteration
            System.out.print("\n");
        }

        //perform multiplication
        //allign table
    }

    public static void main(String[] args) {
        buildTable();
    }

}
