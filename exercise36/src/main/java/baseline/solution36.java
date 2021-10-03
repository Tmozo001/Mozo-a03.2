/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;
import java.util.*;

public class solution36 {
    public static Scanner input = new Scanner(System.in);

    private static ArrayList createArray(){
        //initialize array responseTimes
        ArrayList<Integer> responseTimes = new ArrayList<Integer>();
        String responseTime = null;
        //do while to fill the array with the response times
        do {
            System.out.println("Enter a number: ");
            responseTime = input.next();
            //if the response time is not done add it to the array
            if(!responseTime.equals("done")) {
                try {
                    int num = Integer.parseInt(responseTime);
                    responseTimes.add(num);
                }catch(NumberFormatException nfe) {
                }
            }
            //do while the responsetime != done
        }while(!responseTime.equals("done"));
        //print the array with Numbers: ...
        System.out.println("Numbers: "+responseTimes);
        return responseTimes;


    }
    private static double average(ArrayList responseTimes){
        double total =0;
        //loop through the array adding each piece together and then divide by array size
        for(int i = 0; i < responseTimes.size() ; i++){
            total+= responseTimes.indexOf(i);
        }
        return total/responseTimes.size();

    }
    private static void minimumMaximum(ArrayList responseTimes){
       //loop through the array comparing which is the smallest
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < responseTimes.size() ; i++) {

            if(responseTimes.indexOf(i) > maximum){
                maximum = responseTimes.indexOf(i);
            }
            if(responseTimes.indexOf(i) < minimum){
                minimum = responseTimes.indexOf(i);
            }
        }
        System.out.println("The minimum is" + minimum + "\n");
        System.out.println("The maximum is" + maximum + "\n");
    }

    private static void standardDeviation(ArrayList responseTimes){
       //use standard deviation formula for the values in the loop
        double n = responseTimes.size();
        double sum = 0;
        double mean;
        for(int i = 0; i < responseTimes.size() ; i++){
            sum += responseTimes.indexOf(i);
        }
        mean = sum/(n-1);

        double SD = Math.sqrt(mean);

        System.out.printf("The standard deviation is %.2f", SD);

    }

    public static void main(String[] args) {
        //call create array
        ArrayList responseTimes = createArray();
        //call each math method
        double avg = average(responseTimes);
        System.out.printf("The average is %.2f\n", avg);
        minimumMaximum(responseTimes);
        standardDeviation(responseTimes);
    }

}
