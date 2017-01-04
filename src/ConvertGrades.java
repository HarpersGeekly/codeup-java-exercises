import java.util.Scanner;

/**
 * Created by RyanHarper on 1/4/17.
 */
public class ConvertGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Convert given number grades into letter grades.

        String userWantsToContinue;
        int grade;
        String message;

        System.out.println("Welcome to the Student Grading Application!");

        do {
            System.out.println("What is the student's numerical grade?: ");
            grade = sc.nextInt();

//        Accept a numerical grade from 0 to 100.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 60 - 0

            if (grade >= 88) {
//        Display the corresponding letter grade.
                message = "Student made an A";
            } else if (grade >= 80) {
                message = "Student made a B";
            } else if (grade >= 67) {
                message = "Student made a C";
            } else if (grade >= 60) {
                message = "Student made a D";
            } else {
                message = "Student made an F. Try Again!";
            }
            System.out.println(message);

//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
            System.out.println("Do you want to grade another student?");

            userWantsToContinue = sc.next();

        } while (userWantsToContinue.equals("Yes")
                || userWantsToContinue.equals("Y")
                || userWantsToContinue.equals("yes")
                || userWantsToContinue.equals("y"));

        System.out.println("Good Luck out there, Teach!");
    }

}

//





//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).