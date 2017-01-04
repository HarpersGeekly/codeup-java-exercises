import java.util.Scanner;

/**
 * Created by RyanHarper on 1/4/17.
 */
public class TableOfPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInteger;
        long userSquare;
        long userCubed;
        String userWantsToContinue;

//        Prompt the user to enter an integer.
        do {
            System.out.print("Enter an integer: ");
            userInteger = sc.nextInt();

            for (int i = 1; i <= userInteger; i++) {
                userSquare = i * i;
                userCubed = i * i * i;
//        Display a table of squares and cubes from 1 to the value entered.
                System.out.println(i + "|" + userSquare + "|" + userCubed);
            }
//        Ask if the user wants to continue.
        sc.nextLine();
        System.out.println("Would you like to continue? Yes/No: ");
        userWantsToContinue = sc.nextLine();

        } while (userWantsToContinue.equals("Yes")
            || userWantsToContinue.equals("Y")
            || userWantsToContinue.equals("yes")
            || userWantsToContinue.equals("y"));

        System.out.println("Thanks for checking this out, see ya later!");
    }
}