/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;
import java.util.*;

public class solution34 {
    public static Scanner input = new Scanner(System.in);

    private static ArrayList createArray(){
        //initialize a new arraylist
        ArrayList<String> employees = new ArrayList();
        //add each employee name
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        //get the length of this new array
        int length = employees.toArray().length;
        //print the length with the appropriate statement
        System.out.printf("There are %d employees: ", length);
        System.out.println("\n"+employees);

        //return arraylist
        return employees;

    }


    private static String getEvilEmployee() {
        //ask the user for who they want to remove
        System.out.print("Enter an employee name to remove: ");
        //assign that to a string
        String banished = input.nextLine();

        //return the string
        return banished;
    }


    private static void banishEmployee(ArrayList employees, String banished){
        //use remove function to remove banished from the array
        employees.remove(banished);
        //find the new length and print it
        int length = employees.toArray().length;
        //print the new array
        System.out.println(employees);


    }

    public static void main(String[] args) {
        //call the functions with appropraite parameters
        ArrayList employees = createArray();

        String banished = getEvilEmployee();

        banishEmployee(employees, banished);


    }

}
