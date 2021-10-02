package baseline;
import java.util.Scanner;

public class solution28 {
    public static Scanner input = new Scanner(System.in);

    private static int loop() {
        int total = 0;
//for loop asking user to enter a number 5 times
        for (int i = 0; i <=4 ; i++) {
            System.out.print("Enter a number: ");
            //add each new number onto total
            total += input.nextInt();
        }
        //return total
        return total;



    }
    public static void main(String[] args) {
        // call loop
        int total = loop();
        //print the total
        System.out.printf("The total is %d", total);
    }


}
