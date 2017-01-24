package RockPaperScissors;

/**
 * Created by RyanHarper on 1/18/17.
 */
public class CPUPlayerRPS extends PlayerRPS {
    // randomly selects rock paper or scissors.

    public String getComputerChoice() {
        return generateRockPaperScissors(1, 3);
    }
}
