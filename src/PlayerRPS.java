import java.util.Random;

/**
 * Created by RyanHarper on 1/18/17.
 */
public class PlayerRPS {
    //Parent class.
    int playerNumberOfWins = 0;
    int computerNumberOfWins = 0;


    public static String generateRockPaperScissors(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max) + min;
        String computerChoice;
        switch (randomNumber) {
            case (1):
                computerChoice = "rock";
                break;
            case (2):
                computerChoice = "paper";
                break;
            case (3):
                computerChoice = "scissors";
                break;
            default:
                computerChoice = "";
        }
        return computerChoice;
    }

    public void compareMoves(String userChoice, String computerChoice) {
        System.out.println("You chose " + userChoice + " and the computer chose " + computerChoice + ". ");
        if (userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) {
            playerNumberOfWins++;
            System.out.println(userChoice + " beats " + computerChoice);
            System.out.println("You Win!");
        } else if (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) {
            playerNumberOfWins++;
            System.out.println(userChoice + " beats " + computerChoice);
            System.out.println("You Win!");
        } else if (userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) {
            playerNumberOfWins++;
            System.out.println(userChoice + " beats " + computerChoice);
            System.out.println("You Win!");
        } else if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("You Tied!");
        } else {
            computerNumberOfWins++;
            System.out.println(computerChoice + " beats " + userChoice);
            System.out.println("You lost!");
        }
        System.out.println("=================\nPlayer Wins: " + playerNumberOfWins + " \nComputer Wins: " + computerNumberOfWins + "\n=================");
    }
}
