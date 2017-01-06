import java.util.Scanner;

//        A factorial is a number multiplied by each of the numbers before it.
//        Factorials are denoted by the exclamation point (n!). Ex:
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24
//        Use a for loop to calculate the factorial.
//       Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Continue only if the user agrees to.
//        Prompt the user to enter an integer from 1 to 10.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
/**
 * Created by RyanHarper on 1/5/17.
 */
public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's do some factorial-uh-ling...");

        String userWantsToContinue;

        do {
        int userInteger = getNumber(scan);
        long factorialNumber = 1;

        for (int i = 1; i <= userInteger; i++){
            factorialNumber *= i;
        }

        System.out.println("The factorial of "+ userInteger + " is: " + factorialNumber + ".");
        System.out.println("Try another? Yes/No");
        userWantsToContinue = scan.next();
        scan.nextLine();

    } while (userWantsToContinue.equalsIgnoreCase("Yes")
            || userWantsToContinue.equalsIgnoreCase("y"));
        System.out.println("Catch ya later!");
    }
    public static int getNumber(Scanner scan) {
        System.out.println("Input a number between 1 and 10: ");
        return scan.nextInt();
    }
}
//        Bonus
//        Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number “from 1 to {the highest integer that returns accurate factorial calculation}”. Don’t forget to change your verification too!
// (66!)
//        Use Recursion to implement the factorial.
