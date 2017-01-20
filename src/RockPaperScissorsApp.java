/**
 * Created by RyanHarper on 1/18/17.
 */
public class RockPaperScissorsApp {
    public static void main(String[] args) {
        Validator validator = new Validator();
        System.out.println("██████╗  ██████╗  ██████╗██╗  ██╗       ██████╗  █████╗ ██████╗ ███████╗██████╗        ███████╗ ██████╗██╗███████╗███████╗ ██████╗ ██████╗ ███████╗\n" +
                "██╔══██╗██╔═══██╗██╔════╝██║ ██╔╝       ██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗       ██╔════╝██╔════╝██║██╔════╝██╔════╝██╔═══██╗██╔══██╗██╔════╝\n" +
                "██████╔╝██║   ██║██║     █████╔╝        ██████╔╝███████║██████╔╝█████╗  ██████╔╝       ███████╗██║     ██║███████╗███████╗██║   ██║██████╔╝███████╗\n" +
                "██╔══██╗██║   ██║██║     ██╔═██╗        ██╔═══╝ ██╔══██║██╔═══╝ ██╔══╝  ██╔══██╗       ╚════██║██║     ██║╚════██║╚════██║██║   ██║██╔══██╗╚════██║\n" +
                "██║  ██║╚██████╔╝╚██████╗██║  ██╗▄█╗    ██║     ██║  ██║██║     ███████╗██║  ██║▄█╗    ███████║╚██████╗██║███████║███████║╚██████╔╝██║  ██║███████║\n" +
                "╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝╚═╝    ╚═╝     ╚═╝  ╚═╝╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝    ╚══════╝ ╚═════╝╚═╝╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝\n" +
                "                                                                                                                                                   ");
        System.out.println("Welcome to the Rock, Paper, Scissors App");
        // Prompt the player to enter a name and select an opponent.
        String userName = validator.getString("Enter your name: ");
        System.out.println("Hello, " + userName + "!");
        String userContinues;
        CPUPlayerRPS cpuPlayerRPS = new CPUPlayerRPS();
        RockPlayerRPS rockPlayerRPS = new RockPlayerRPS();

        do {
            System.out.println("Who would you like to play against?");
            System.out.println("[1] CPU Player");
            System.out.println("[2] Rocky Player");
            int chosenOpponent = validator.getIntWithinRange("Choose here: ", 0, 2);

            do {
            if (chosenOpponent == 1) {
                System.out.println("You chose to play against the CPU Player");

                // run the game with the getComputerChoice method on a new CPUPlayer object
                // Prompt the player to select rock, paper, or scissors. Then display the player’s choice, the opponent’s choice, and the result of the match.

                String userChoice = validateString(validator);
                String computerChoice = cpuPlayerRPS.getComputerChoice();
                cpuPlayerRPS.compareMoves(userChoice, computerChoice);
            }

            if (chosenOpponent == 2) {
                System.out.println("You chose to play against the Rocky Player");

                // run the game using the getRockyChoice method on a new RockPlayer Object
                // Prompt the player to select rock, paper, or scissors. Then display the player’s choice, the opponent’s choice, and the result of the match

                String userChoice = validator.getString("Select: Rock, Paper, Scissors");
                String computerChoice = rockPlayerRPS.getRockyChoice();
                rockPlayerRPS.compareMoves(userChoice, computerChoice);
            }

            userContinues = validator.getString("Try again? Y/N");
        } while (userContinues.equalsIgnoreCase("Yes") || userContinues.equalsIgnoreCase("y"));

            userContinues = validator.getString("Try against another player? Y/N");
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
//
//        Keep track of wins and losses, and display them at the end of each session.