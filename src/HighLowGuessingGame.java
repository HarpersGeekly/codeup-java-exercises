import java.util.Random;
import java.util.Scanner;

/**
 * Created by RyanHarper on 1/10/17.
 */
public class HighLowGuessingGame {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the High Low Guessing Game!\n" + "======================================");

        int min = 1;
        int max = 100;
        int counter = 0;
        int randomNumber = generateRandomNumber();
        String userWantsToContinue;
//          System.out.println(randomNumber);

        do {
            System.out.println("Enter a number between 1 and 100:");
            String prompt = "";
            compareUserGuess(validator, min, max, randomNumber, counter, prompt);
            System.out.println("Would you like to play again? Yes/No\n" + "=====================================");
            userWantsToContinue = scan.nextLine();
            randomNumber = generateRandomNumber();
        } while (userWantsToContinue.equalsIgnoreCase("yes") || userWantsToContinue.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing! Take care. ");
    }

    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    public static void compareUserGuess(Validator validator, int min, int max, int randomNumber, int counter, String prompt) {

        System.out.println("(You've guessed " + counter + " times so far...)");
        int userGuess = validator.getIntWithinRange(prompt, min, max);
        if (userGuess == randomNumber) {
            counter++;
            System.out.println("GOOD GUESS!\n" + "========================");
            System.out.println("It took you " + counter + " times to guess.");
            if (counter == 1) {
                System.out.println("YOU. ARE. ONE. LUCKY...bas-Good Game!" + "============================");
            } else if(counter <= 6) {
                System.out.println("Not too shabby...\n" + "============================");
                } else if(counter > 6) {
                System.out.println("Keep trying, champ...\n" + "============================");
            }
        } else if (userGuess > randomNumber) {
            System.out.println("LOWER...\n" + "=========");
            counter++;
            compareUserGuess(validator, min, max, randomNumber, counter, prompt);
        } else if (userGuess < randomNumber) {
            System.out.println("HIGHER...\n" + "========");
            counter++;
            compareUserGuess(validator, min, max, randomNumber, counter, prompt);
        }
    }
}
