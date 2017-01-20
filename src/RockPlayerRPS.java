/**
 * Created by RyanHarper on 1/18/17.
 */
public class RockPlayerRPS extends PlayerRPS {
    // only plays rock.


    public String getRockyChoice() {
        String rockyChoice = generateRockPaperScissors(1, 1);
        return rockyChoice;
    }
}
