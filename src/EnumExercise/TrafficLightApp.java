package EnumExercise;

import Validator.Validator;

import java.util.Scanner;

/**
 * Created by RyanHarper on 1/12/17.
 */
public class TrafficLightApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        String userContinue;

        do {
            getTrafficLightColor(validator);
            System.out.println("Would you like to try again? Yes/No");
            userContinue = scan.next();
            scan.nextLine();
        } while (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y"));
        System.out.println("Goodbye");
    }

    public static void getTrafficLightColor(Validator validator) {
        try {
            String prompt = "Traffic Lights: What do they mean? Type either Red, Yellow, or Green to be enlightened:";
            String userInput = validator.getString(prompt);
            TrafficLightColor color = TrafficLightColor.valueOf(userInput.toUpperCase());
            makeDrivingDecision(color);
        } catch (IllegalArgumentException e) {
            System.out.println("Please input a valid traffic light color.");
            getTrafficLightColor(validator);
        }
    }

    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case GREEN:
                System.out.println("GO!");
                break;
            case YELLOW:
                System.out.println("YIELD TO STOP");
                break;
            case RED:
                System.out.println("STOP!");
                break;
        }
    }
}
