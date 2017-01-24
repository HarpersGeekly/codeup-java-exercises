package MovieLister;

import java.util.*;
import Validator.Validator;
/**
 * Created by RyanHarper on 1/17/17.
 */
public class MovieListApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //create a new validator instance to use later:
        Validator validator = new Validator(scan);
        //create a new List called movieList to use later:
        ArrayList<Movie> movieList = new ArrayList<>();
        // call the file MovieLister.MovieIO, creating a new object and assigning the reference variable movieIO:
        MovieIO movieIO = new MovieIO();
        // Now that we have an instance of MovieLister.MovieIO, we loop through MovieLister.MovieIO and add all the objects to the new movieList.
        // (Assemble the arrayList of movieObjects)
        for (int i = 1; i <= 100; i++) {
            movieList.add(movieIO.getMovie(i));
        }
        //variables:
//        int usersGenreChoice;
        String userContinue;
        // intro and user input:
        System.out.println("Welcome to the MovieLister.Movie List App!");
        do {
            // asks user to input a genre. saves that input to the value of the variable usersGenreChoice:
            System.out.println("===========================");
            System.out.println("Choose a genre to display: ");
            System.out.println("===========================");
            System.out.println("[1] Animated");
            System.out.println("[2] Musical");
            System.out.println("[3] Comedy");
            System.out.println("[4] Drama");
            System.out.println("[5] Horror");
            System.out.println("[6] Sci-Fi");
            int usersGenreChoice = validator.getIntWithinRange("Type the number here: ", 1, 6);
            scan.nextLine();
            System.out.println("The following is a list of " + Movie.getGenreFromUser(usersGenreChoice) + " movies:");
            System.out.println("==========================================");
            Movie.sortGenre(usersGenreChoice, movieList);
            System.out.println("==========================================" + "\n");
            userContinue = validator.getString("Would you like to see a new list? Yes/No");
        } while (userContinue.equalsIgnoreCase("Yes") || userContinue.equalsIgnoreCase("y"));
        System.out.println("Thank you, goodbye!");
    }
}