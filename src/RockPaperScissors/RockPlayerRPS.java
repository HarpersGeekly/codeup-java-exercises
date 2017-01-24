package RockPaperScissors;

/**
 * Created by RyanHarper on 1/18/17.
 */
public class RockPlayerRPS extends PlayerRPS {
    // only plays rock.

    public String getRockyChoice() {
        return generateRockPaperScissors(1, 1);
    }
}
