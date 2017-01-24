package RockPaperScissors;
import Validator.Validator;

import java.util.Scanner;

/**
 * Created by RyanHarper on 1/18/17.
 */
public class RockPaperScissorsApp {
    public static void main(String[] args) {
        System.out.println("______           _       ______                       _____      _                        \n" +
                "| ___ \\         | |      | ___ \\                     /  ___|    (_)                       \n" +
                "| |_/ /___   ___| | __   | |_/ /_ _ _ __   ___ _ __  \\ `--.  ___ _ ___ ___  ___  _ __ ___ \n" +
                "|    // _ \\ / __| |/ /   |  __/ _` | '_ \\ / _ \\ '__|  `--. \\/ __| / __/ __|/ _ \\| '__/ __|\n" +
                "| |\\ \\ (_) | (__|   < _  | | | (_| | |_) |  __/ |_   /\\__/ / (__| \\__ \\__ \\ (_) | |  \\__ \\\n" +
                "\\_| \\_\\___/ \\___|_|\\_( ) \\_|  \\__,_| .__/ \\___|_( )  \\____/ \\___|_|___/___/\\___/|_|  |___/\n" +
                "                     |/            | |          |/                                        \n" +
                "                                   |_|                                                    ");
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        CPUPlayerRPS cpuPlayer = new CPUPlayerRPS();
        RockPlayerRPS rockPlayer = new RockPlayerRPS();

        System.out.println("Welcome to the Rock, Paper, Scissors App");
        // Prompt the player to enter a name and select an opponent.
        String userName = validator.getString("Enter your name: ");
        System.out.println("Hello, " + userName + "!");
        String userContinues;

        do {
            System.out.println("Who would you like to play against?");
            System.out.println("[1] CPU Player");
            System.out.println("[2] Rocky Player");
            int chosenOpponent = validator.getIntWithinRange("Choose here: ", 0, 2);
            scan.nextLine();
            do {

            if (chosenOpponent == 1) {
                System.out.println("You chose to play against the CPU Player");
                // run the game with the getComputerChoice method on a new CPUPlayer object
                // Prompt the player to select rock, paper, or scissors. Then display the player’s choice, the opponent’s choice, and the result of the match.
                String userChoice = validateString(validator); // this checks to make sure a user types rock, paper, scissors, and nothing else!
                String computerChoice = cpuPlayer.getComputerChoice(); //this calls the method on the new cpuPlayer and saves that result to computerChoice
                cpuPlayer.compareMoves(userChoice, computerChoice); // once you get both moves, run the method compareMoves on the object cpuPlayer
            }

            if (chosenOpponent == 2) {
                System.out.println("You chose to play against the Rocky Player");

                // run the game using the getRockyChoice method on a new RockPlayer Object
                // Prompt the player to select rock, paper, or scissors. Then display the player’s choice, the opponent’s choice, and the result of the match
                String userChoice = validator.getString("Select: Rock, Paper, Scissors");
                String computerChoice = rockPlayer.getRockyChoice();
                rockPlayer.compareMoves(userChoice, computerChoice);
            }

            userContinues = validator.getString("Try again? Y/N");
        } while (userContinues.equalsIgnoreCase("Yes") || userContinues.equalsIgnoreCase("y"));

            userContinues = validator.getString("Try against another player? Yes/No");
        } while (userContinues.equalsIgnoreCase("Yes") || userContinues.equalsIgnoreCase("y"));
        System.out.println("Thanks, see ya!");
    }

    public static String validateString(Validator validator) {
        boolean validInput = false;
        String[] moves = new String[3];
        moves[0] = "rock";
        moves[1] = "paper";
        moves[2] = "scissors";
        String userInput = validator.getString("Select: Rock, Paper, Scissors");
        do {
            for (int i = 0; i < moves.length; i++) {
                if (moves[i].equalsIgnoreCase(userInput)) {
                    validInput = true;
                    return userInput;
                }
            }
            String prompt = "Enter valid input: (rock, paper, scissors)";
            userInput = validator.getString(prompt);
        } while (!validInput);
        return userInput;
    }
}
//        Bonus
//        Keep track of wins and losses, and display them at the end of each session.