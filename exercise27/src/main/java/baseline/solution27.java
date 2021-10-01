/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */

package baseline;
import java.util.Scanner;
import java.util.regex.Pattern;

public class solution27 {
    public static Scanner input = new Scanner(System.in);

    static String data = "";

    private static String getFirstName(){
        //get first name and scna into firstName
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        return firstName;
    }
    private static String getLastName(){
        //get last name and scan into lastName
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        return lastName;

    }
    private static String getZIP(){
        //get zip and scan into ZIP
        System.out.print("Enter the ZIP code: ");
        String ZIP = input.nextLine();
        return ZIP;
    }
    private static String getUID() {
        //get uid form user and scan into UID
        System.out.print("Enter the employee ID: ");
        String UID = input.nextLine();
        return UID;

    }

    private static void validateInputs(String firstName, String lastName, String ZIP, String UID){
        //takes in the validation of each case and verifies.
        boolean first = validateFirstName(firstName);
        boolean last = validateLastName(lastName);
        boolean ZIPFlag = validateZIP(ZIP);
        boolean UIDFlag = validateUID(UID);


        if (first && last && ZIPFlag && UIDFlag) {
           data = "There were no errors found.";
        }

        System.out.printf("%s",data);
    }


    private static boolean validateFirstName(String firstName){

        boolean validity = true;
        //makes sure firstname is longer than 2 characters
        if (firstName.length() < 2) {
            data = data + "The first name must be at least 2 characters long.\n";
            validity = false;
        }
        if (firstName.length() == 0) {
            data = data + "The first name must be filled in.\n";
            validity = false;
        }
        return validity;
    }


    private static boolean validateLastName(String lastName){

        boolean validity = true;
        //makes sure lastname is longer than 2 characters
        if (lastName.length() < 2) {
            data = data + "The last name must be at least 2 characters long.\n";
            validity = false;
        }
        if (lastName.length() == 0) {
            System.out.println("The last name must be filled in.");
            validity = false;
        }
        return validity;
    }


    private static boolean validateZIP(String ZIP){

        boolean validity = true;
        //makes sure zip is 5 digits
        try {
            int number = Integer.parseInt(ZIP);
            if (ZIP.length() != 5) {
                data = data + "The zipcode must be a 5 digit number.\n";
                validity = false;
            }
        } catch (Exception e) {
            data = data + "The zipcode must be a 5 digit number.\n";
            validity = false;
        }
        return validity;
    }

    private static boolean validateUID(String UID){
        //sets what the correct format is
        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        //makes sure id is in correct format
        if (!Pattern.matches(pattern, UID)) {
            data = data + "The employee ID must be in the format of AA-1234.\n";
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String firstName = getFirstName();
        String lastName = getLastName();
        String ZIP = getZIP();
        String UID = getUID();
        // call validateInputs to do all the work
        validateInputs(firstName, lastName, ZIP, UID);
    }



}
