package BattingAverageApp;

import Validator.Validator;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by RyanHarper on 1/11/17.
 */
public class BattingAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".###");
        Validator validator = new Validator(scan);
        String userContinue;

        System.out.println("Play ball!");
        Batter batter = new Batter();

        do {
            // get the number of times ths particular player is at bat:
            batter.timesAtBat = validator.getInt("How many times does this batter go at bat?");

            // create array with as many elements as number of times the player is at bat:
            batter.arrayOfAtBats = new int[batter.timesAtBat];

            //get results for each time that player is at bat:
            for (int i = 0; i < batter.arrayOfAtBats.length; i++) {

                batter.arrayOfAtBats[i] = validator.getIntWithinRange("How many bases earned for the #" + (i+1) + " time at bat?" , 0, 4);

                //count number of times atBat with at least one base:
                if(batter.arrayOfAtBats[i] > 0) {
                    batter.numberOfAtBatsWithAtLeastOneBase++;
                }

                //add all atBat results to a totalBases count
                batter.totalBases += batter.arrayOfAtBats[i];
            }

            System.out.println("The batter's batting average is " + df.format(batter.getBattingAverage()));
            System.out.println("The batter's slugging percentage for the game is " + df.format(batter.getSluggingPercentage()) + "%");
            System.out.println("Would you like to try again? Yes/No");
            userContinue = scan.next();
        } while (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y"));
        System.out.println("Thanks, goodbye!");

    }
}

