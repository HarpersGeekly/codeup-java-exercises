

/**
 * Created by RyanHarper on 1/18/17.
 */
public class CPUPlayerRPS extends PlayerRPS {
    // randomly selects rock paper or scissors.


    public String getComputerChoice() {
        String computerChoice = generateRockPaperScissors(1, 3);
        return computerChoice;
    }



}
