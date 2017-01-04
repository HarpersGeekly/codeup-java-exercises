import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by RyanHarper on 1/3/17.
 */
public class UserInputDemo {
    public static void main(String[] args) {
//        String userInput; (use only one of these three)
//        double userInput;
//        int userInput;
//
//        Scanner sc = new Scanner(System.in);
//        //Scanner is the object, sc is the class
//
//        System.out.print("Please input your input: ");
//        userInput =  sc.nextLine(); (with the corresponding match here)
//        userInput = sc.nextDouble();
//        userInput = sc.nextInt();
//
//        userInput = userInput + 1;
//
//        System.out.println("You entered " + userInput);
//======================================================================================================================
//        String firstInput;
//        String secondInput;
//        int thirdInput;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Please input your first name:");
//        firstInput = sc.nextLine();
//
//        System.out.print("Please input your last name:");
//        secondInput = sc.nextLine();
//
//        System.out.print("Please input your age:");
//        thirdInput = sc.nextInt();
//
//        System.out.println("Your name is "+ firstInput + " " + secondInput + " and your age is " + thirdInput);
//======================================================================================================================

//      Prompt a user to enter an integer and store that value in an integer variable using the nextInt method.

        int userInteger;
        String userSentence;
        String firstWord;
        String secondWord;
        String thirdWord;
        double length;
        double width;
        String userWantsToContinue;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        userInteger = sc.nextInt();
        System.out.println("You entered " + userInteger);

//      What happens if you input something that is not an integer? You get an error message:
        //        Exception in thread "main" java.util.InputMismatchException
        //        at java.util.Scanner.throwFor(Scanner.java:864)
        //        at java.util.Scanner.next(Scanner.java:1485)
        //        at java.util.Scanner.nextInt(Scanner.java:2117)
        //        at java.util.Scanner.nextInt(Scanner.java:2076)
        //        at UserInputDemo.main(UserInputDemo.java:47)
        //        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        //        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        //        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        //        at java.lang.reflect.Method.invoke(Method.java:498)
        //        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

//      Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method,
//      then display that sentence back to the user.

        System.out.println("Please enter a sentence: ");
        sc.nextLine(); // this stops the code and allows you to enter. (Makes sure to not skip the next input)
        userSentence = sc.nextLine();
        System.out.println("You entered " + "'" + userSentence + "'");
        //        do you capture all of the words? No. "sc.next()" will only write out the first word: "Please".
        //        This is called a "de-limiter". I went back and changed it to nextLine() for code purposes.

//      Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.

        System.out.println("Type in three words. Any three words will do: ");
        firstWord = sc.next();
        secondWord = sc.next();
        thirdWord = sc.next();
        System.out.println("Your special words are: ");
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
//      What happens if you enter less than 3 words?
//          It won't complete. The code waits for three words.

//      Calculate the perimeter and area of various classrooms at Codeup based on user input.
//      Prompt the user to enter values of length and width of the classroom.

        do {
            System.out.println("Let's calculate the perimeter and area of a classroom");
            System.out.print("Type in the length of the room: ");
            length = sc.nextDouble();
            System.out.print("Type in the width of the room: ");
            width = sc.nextDouble();

//      Display the area and perimeter of that classroom.

            System.out.println("The perimeter of the room is " + ((2 * length) + (2 * width)) + " feet");
            System.out.println("The area of the room is " + (length * width) + " square feet");

//      Ask if the user wants to continue (keep measuring rooms!).

            sc.nextLine();

            System.out.print("Would you like to continue? Yes/No: ");
            userWantsToContinue = sc.nextLine();

        } while (userWantsToContinue.equals("Yes")
                || userWantsToContinue.equals("Y")
                || userWantsToContinue.equals("yes")
                || userWantsToContinue.equals("y"));

        System.out.println("Thanks for checking this out, see ya later!");
    }
}

//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//        Accept decimal entries (12.5, for instance).
//
//        Bonus
//
//        The application should continue only if the user agrees to.
//
//        Calculate the volume of the rooms.