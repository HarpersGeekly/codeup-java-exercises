import java.util.Scanner;

/**
 * Created by RyanHarper on 1/5/17.
 */
public class DiceRoll {
    public static void main(String[] args) {
        System.out.println("Welcome to the Die Rolling App!");

        playGame();

    }

    public static void playGame() {
        Scanner scan = new Scanner(System.in);

        String playAgain;

        do {

            int numberOfSidesPerDie = getNumberOfSidesFromUser(scan);

            System.out.println("Rolling the two " + numberOfSidesPerDie + "-sided dice...");
            //        “Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
            int dieOne = rollDie(numberOfSidesPerDie);
            int dieTwo = rollDie(numberOfSidesPerDie);

            System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ".");
            System.out.println("Together, your total is " + (dieOne + dieTwo));

            System.out.println("Want to roll the dice again?");
            playAgain = scan.next();
            scan.nextLine();

        } while (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y"));
        System.out.println("See ya later");
    }


    public static int rollDie(int numberOfSidesFromUser) {
//        Random number generator in Java
//        Experiment with different Random number generators –start with the random() method of the Math class but also explore Java’s Random class.
        return (int) Math.ceil(Math.random() * numberOfSidesFromUser); //(int) casting.
    }
//        Ask the user to enter the number of sides for a pair of dice.
    public static int getNumberOfSidesFromUser(Scanner scan) {
        System.out.println("Enter the number of sides on your two dice");
        return scan.nextInt();
    }
}


//        Use static methods to implement the method(s) that generate the random numbers.
