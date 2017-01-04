import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by RyanHarper on 1/4/17.
 */
public class ControlStatementsAndLoops {
    public static void main(String[] args) {

//  Loop Basics
//
//   ============================================     While:    ========================================================
//
//        Create a variable i that starts at 5.

        int i = 5;

        // Create a while loop that checks i <= 15 and increment i by 1 inside the loop.
        // Before incrementing i, output each iteration and display results.

        while (i <= 15) {
            System.out.println(i);
            i++;
        }

//  ==========================================      Do While:    =======================================================
        System.out.println("Do While");
        System.out.println("==========");
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

        int x = 0;

        do {
            System.out.println(x);
            x = x + 2;
        } while (x <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.
        System.out.println("==========");

        int y = 100;

        do {
            System.out.println(y);
            y = y - 5;
        } while (y >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number
//        is less than 1,000,000. Output should equal:
        System.out.println("==========");

        long z = 2;

        do {
            System.out.println(z);
            z = z * z;
        } while (z < 1000000);
// what happened here is originally I had "int" and not "long". 65,000 * 65,000 goes beyond Int's peak number of
// 2,147,483,647. So, it looped around, then looped through negative integers, up to 0 and stayed at the first positive number and
// kept printing 0 over and over. "Long" fixes this because it ALLOWS the calculation to resolve first. Once it realized that
// the number is too high, it looks at the while condition and reverts back to the last number that eclipses 1,000,000.

//  ==============================================      For:   =========================================================
//        refactor the previous two exercises to use a for loop instead
        System.out.println("==========");

        for (int a = 0; a <= 100; a++) {
            System.out.println(a);
        }

        System.out.println("==========");

        for (int b = 100; b >= -10; b -= 5) {
            System.out.println(b);
        }

        System.out.println("==========");

        for (long c = 2; c < 1000000; c = c*c) {
            System.out.println(c);
        }

    }
}
