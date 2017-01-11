import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RyanHarper on 1/10/17.
 */
public class Validator {
    Scanner scan = new Scanner(System.in);

//    String stringInput;
//    int intInput;
//    double doubleInput;

//    public Validator(String stringInput, int intInput, double doubleInput) {
//        this.stringInput = stringInput;
//        this.intInput = intInput;
//        this.doubleInput = doubleInput;
//    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int intInput;

        try {
            intInput = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR -- Input must be an integer");
            scan.next();
            return getInt(prompt);
        }
        return intInput;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int intInput = getInt(prompt);

        try {
//            System.out.println(prompt);
            if (intInput < min || intInput > max) {
                throw new IllegalArgumentException("ERROR -- Integer is out of range between " + min + " and " + max);
            }
//        } catch (InputMismatchException e) {
//            System.out.println("ERROR -- Input must be an integer.");
//            scan.nextLine();
//            getIntWithinRange(prompt, min, max);
        } catch (IllegalStateException | IllegalArgumentException e) { //listening for either of these exceptions.
//            if (intInput < min) {
//                System.out.println("ERROR -- Number must be greater than " + min);
//            } else if (intInput > max) {
//                System.out.println("ERROR -- Number must be less than " + max);
//            }
            System.out.println(e.getMessage());
            return getIntWithinRange(prompt, min, max);
        }
        return intInput;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double doubleInput;

        try {
            doubleInput = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERROR -- Input must be an integer");
            scan.next();
            return getDouble(prompt);
        }
        return doubleInput;
    }

    public double getDoubleWithinRange(String prompt, double min, double max) {
        double doubleInput = getDouble(prompt);

        try {
            System.out.println(prompt);
            doubleInput = scan.nextDouble();
            if (doubleInput < min || doubleInput > max) {
                throw new IllegalArgumentException("ERROR -- Integer is out of range between " + min + " and " + max);
            }
            return doubleInput;
        } catch (InputMismatchException e) {
            System.out.println("ERROR -- Input must be an integer.");
            scan.nextLine();
            getDoubleWithinRange(prompt, min, max);
        } catch (IllegalStateException | IllegalArgumentException e) { //listening for either of these exceptions.
            System.out.println(e.getMessage());
//            if (intInput < min) {
//                System.out.println("ERROR -- Number must be greater than " + min);
//            } else if (intInput > max) {
//                System.out.println("ERROR -- Number must be less than " + max);
//            }
            return getDoubleWithinRange(prompt, min, max);
        }
        return doubleInput;
    }


//    public String getRequiredString(String prompt) {
//        System.out.println(prompt);
//        stringInput = scan.nextLine();
//        return stringInput;
//    }
}