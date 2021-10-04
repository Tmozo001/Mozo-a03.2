package baseline;
import java.util.*;

public class solution29 {
    public static Scanner input = new Scanner(System.in);

    public static void inputValidity() {
        boolean flag=false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? ");
                int rate = Integer.parseInt(input.next());

                System.out.println("It will take "+(72/rate)+" years to double your initial investment.");
                flag=true;
            }
            catch(NumberFormatException e) //check if input is in the correct number format
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e) //check if divided by 0
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag) //if exception not raised
            {
                break;
            }

        }
    }

    public static void main(String[] args) {
        //call input validity
        inputValidity();
    }
}





