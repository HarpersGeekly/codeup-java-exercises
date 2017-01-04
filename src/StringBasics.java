import java.util.Scanner;

/**
 * Created by RyanHarper on 1/4/17.
 */
public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    For each of the following output examples, create a string variable named message that contains the desired output and print it out to the console.
//        Do this with only one string variable and one print statement. [Also, \n, tabs to another line]

        String message;

//        We don't need no education
//        We don't need no thought control

        message = "We don't need no education   \n";
        message += "We don't need no thought control   \n";

//        Check "this" out!, "s inside of "s!
        message += "Check \"this\" out!, \"s inside of \"s!   \n";

//        In windows, the main drive is usually C:\
        message += "In windows, the main drive is usually C:\\   \n";

//        I can do back slashes \, and double back slashes \\, and the amazing triple back-slash \\\!
        message += "I can do back slashes \\, and double back slashes \\\\, and the amazing triple back-slash \\\\\\!  \n";

        System.out.println(message);
    }
}
