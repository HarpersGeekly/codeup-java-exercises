
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by RyanHarper on 1/9/17.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        number = getNumber(scan);
        System.out.println("Good Job! Goodbye");

    }

    public static int getNumber(Scanner scan) {

        int number = 0;
        System.out.println("Please input a number between 0 and 100");

        try {
            number = scan.nextInt();
            if (number < 0 || number > 100) {
                throw new IllegalArgumentException("Integer must be between 0 and 100");
            }
        } catch (InputMismatchException | IllegalStateException | IllegalArgumentException e) { //listening for either of these exceptions.
            System.out.println(e.getMessage());
            return getNumber(scan);
        }

        return number;

    }
}
