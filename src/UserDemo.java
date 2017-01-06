
import java.util.Scanner;

/**
 * Created by RyanHarper on 1/6/17.
 */

public class UserDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        User user = new User(); // <— new User IS AN OBJECT

        System.out.println("What’s the username: ");
        user.username = scan.nextLine();

        System.out.println("Input your password: ");
        user.password = scan.nextLine();

        System.out.println("What’s your email address? ");
        user.email = scan.nextLine();

        System.out.println("Hello, " + user.username);
        System.out.println("We sent your sign-up instructions to " + user.email);
    }

}
