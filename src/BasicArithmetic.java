import java.util.Scanner;

/**
 * Created by RyanHarper on 1/5/17.
 */
public class BasicArithmetic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to an input calculator!");

        String userWantsToContinue; // scope needed below

        do {

            String selectOperation = getOperation(scan);
            int x = getFirstInput(scan);
            int y = getSecondInput(scan);

            if (selectOperation.equalsIgnoreCase("add")) {
                System.out.println(x + " + " + y + " = " + calculateAddition(x, y));
            } else if (selectOperation.equalsIgnoreCase("subtract")) {
                System.out.println(x + " - " + y + " = " + calculateSubtraction(x, y));
            } else if (selectOperation.equalsIgnoreCase("multiply")) {
                System.out.println(x + " * " + y + " = " + calculateMultiplication(x, y));
            } else if (selectOperation.equalsIgnoreCase("divide")) {
                System.out.println(x + " / " + y + " = " + calculateDivision(x, y));
            } else if (selectOperation.equalsIgnoreCase("modulus")) {
                System.out.println(("The remainder of " + x + " divided by " + y + " is " + calculateModulus(x, y)));
            }

            System.out.println("Try another? Yes/No");
            userWantsToContinue = scan.next();

            scan.nextLine();

        } while (userWantsToContinue.equalsIgnoreCase("Yes")
                || userWantsToContinue.equalsIgnoreCase("y"));
        System.out.println("Catch ya later!");
    }

    public static String getOperation(Scanner scan) {
        System.out.println("Choose an operation: add | subtract | multiply | divide | modulus");
        return scan.nextLine();
    }

    public static int getFirstInput(Scanner scan) {
        System.out.println("Input first number");
        return scan.nextInt();
    }

    public static int getSecondInput(Scanner scan) {
        System.out.println("Input second number");
        return scan.nextInt();
    }
    //    Create four separate methods. Each will perform an arithmetic operation:
    //        Each function needs to take two parameters/arguments so that the operation can be performed.
    //        Addition
    public static int calculateAddition(int x, int y) { return x + y; }
    //        Subtraction
    public static int calculateSubtraction(int x, int y) { return x - y; }
    //        Multiplication
    public static int calculateMultiplication(int x, int y) { return x * y; }
    //        Division
    public static double calculateDivision(int x, int y) {
        if ( y  == 0 ) {
            System.out.println("You can't divide by zero, mate!");
            return 0;
        }
        return (double) x / y;
    }
    //        Add a modulus function that finds the modulus of two numbers.
    public static int calculateModulus(int x, int y) {
        return x - (x/y) * y; // or (x % y)
    }
}
//        Test your functions and verify the output.