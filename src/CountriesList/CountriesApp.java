package CountriesList;

import Validator.Validator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by RyanHarper on 1/23/17.
 */
public class CountriesApp {
    public static void main(String[] args) throws IOException {
//        Maintain a list of countries.
//        What will the application do?
//        Begin by showing a menu with three options.
//        If the user chooses option 1, display a list of countries that have been saved in a file.
//        If the user chooses option 2, prompt the user to enter a country and then write the country to the file of countries.
//        If the user chooses option 3, display a goodbye message and exit.
        String userContinues;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Countries Lister");

        do {
            System.out.println("Choose one of the following:");
            System.out.println("[1] Display a list of countries");
            System.out.println("[2] Add a country");
            System.out.println("[3] Exit");

            Validator validator = new Validator(scan);
            int userChoice = validator.getIntWithinRange("", 0, 2);
            scan.nextLine();
            CountriesTextFile countriesTextFile = new CountriesTextFile();
                if (userChoice == 1) {
                    countriesTextFile.listOfCountriesReader();
                }
                if (userChoice == 2) {
                    countriesTextFile.listOfCountriesWriter(validator.getString("Enter a country:"));
                }
                if (userChoice == 3) {
                    System.out.println("Thanks, Goodbye!");

                }
                userContinues = validator.getString("Add a country? Yes/No");
            } while (userContinues.equalsIgnoreCase("Yes") || userContinues.equalsIgnoreCase("y"));

//            userContinues = validator.getString("Back To Menu? Yes/No");
//        } while (userContinues.equalsIgnoreCase("Yes") || userContinues.equalsIgnoreCase("y"));
        System.out.println("Thanks, Goodbye!");
    }
}









//        The class should use buffered I/O streams and should close all I/O streams when they are not needed.