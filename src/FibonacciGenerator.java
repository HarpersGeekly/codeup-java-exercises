import Validator.Validator;

import java.util.Scanner;

/**
 * Created by RyanHarper on 1/12/17.
 */
public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        System.out.println(" =========================================== \n Welcome to the Fibonacci Number Generator! \n ===========================================");
        validator.setTimeout(1000);
        String prompt = ("To what number would you like the Fibonacci sequence to go up to?: ");
        int max = validator.getInt(prompt);
        scan.nextLine();
        System.out.println("The Fibonacci Sequence up to " + max + ":");
        String userContinue;


        do {
            getFibonacciSequence(validator, max);
            System.out.println("Would you like to try again? Yes/No");
            userContinue = scan.nextLine();

        } while (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y"));
        System.out.println("Thanks, Goodbye");
    }

     public static void getFibonacciSequence(Validator validator, int max) {
        int x = 0;
        int y = 1;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            System.out.println(x);
            x = x + y;
            y = x - y;
            validator.setTimeout(100);
            if (x >= max) {
                System.out.println("It takes " + i + " Fibonacci sequence iterations to approach " + max + ".");
                return;
            }
        }
    }
}


// the generator will take the last two numbers before it and add them together