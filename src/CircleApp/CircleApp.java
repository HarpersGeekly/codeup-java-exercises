package CircleApp;

import Validator.Validator;

import java.util.Scanner;

/**
 * Created by RyanHarper on 1/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        double radius;
        String userContinue;

        do {

            radius = validator.getDouble("Enter radius: ");
            scan.nextLine();
            Circle myCircle = new Circle(radius);

            System.out.println("The area of the circle is " + myCircle.getFormattedArea());
            System.out.println("The circumference of the circle is " + myCircle.getFormattedCircumference());
            System.out.println("Number of circles made: " + myCircle.numberOfCirclesTheUserBuilt);
            userContinue = validator.getString("Would you like to make a new circle? Yes/No");

        } while (userContinue.equalsIgnoreCase("Yes") || userContinue.equalsIgnoreCase("y"));
        System.out.println("Thank you, Goodbye.");
    }
}


//    Calculate a circle’s circumference and area.
//
//        Prompt the user to enter a radius.
//        Display an error if the user enters invalid data.
//        When the user enters valid data, calculate the area and circumference of the circle and rounds to the nearest 2 decimal places.
//        Ask if the user wants to continue.
//        When the user quits, display a “goodbye” message that also indicates the number of circles the user built.
//        Create a class named CircleApp.Circle to store the data about this circle. This class should contain these constructors and methods:
//
//public CircleApp.Circle(double radius)
//public double getCircumference()
//public String getFormattedCircumference()
//public double getArea()
//public String getFormattedArea()
//private String formatNumber(double x)
//public static int getObjectCount()
//        For the value of pi, use the PI constant of the java.lang.Math class.
//
//        Create a class named CircleApp.CircleApp that gets the user input, creates a CircleApp.Circle object, and displays the circumference and area.
//
//        Bonus
//
//        Create a class named Validator.Validator and use its static methods to validate the data in this application.