import java.util.Scanner;

/**
 * Created by RyanHarper on 1/5/17.
 */
public class DiceRoll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNumberOfSides = getNumberOfSides(scan);
    }

    public static int getNumberOfSides(Scanner scan) {
        System.out.println("Enter the number of sides on your dice");
        return scan.nextInt();
    }

}

//    Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        “Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Experiment with different Random number generators –start with the random() method of the Math class but also explore Java’s Random class.