import java.util.Scanner;

/**
 * Created by RyanHarper on 1/5/17.
 */
public class MethodDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String yourName = getName(scan);
        String course = getCourse();
        int favoriteNumber = getFavoriteNumber(scan);

        System.out.println("Hi, " + yourName + ", welcome to " + course);

        if (yourName.equalsIgnoreCase("ryan")) {
            System.out.println("Hey...my name is Ryan too! I see you've been here before, " + yourName + ", welcome back!");
        } else if (yourName.equalsIgnoreCase(yourName)) {
            System.out.println("I see you've been here before, " + yourName + ", welcome back!");
        }

        String greeting = sayHello(favoriteNumber);
        System.out.println(greeting);

    }

    public static String getName(Scanner sc) { // you can have the argument named sc and not scan...it can be different
        System.out.println("What is your name?");
        return sc.nextLine();
    }

    public static String getCourse() {
        return "Codeup";
    }

    public static int getFavoriteNumber(Scanner scan) {
        System.out.println("What's your favorite number?");
        return scan.nextInt();
    }

    public static String sayHello(int number) {
        return "I heard your favorite number is " + number + ", that's awesome!";
    }
}
