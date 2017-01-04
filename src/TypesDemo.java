/**
 * Created by RyanHarper on 1/3/17.
 */
public class TypesDemo {
    public static void main(String[] args) {
        //    create variables of every primitive type and print them to the console
        byte myAge = 31;
        System.out.println(myAge + " very short integers from -128 to 127");

        short shortVariable = 31000;
        System.out.println(shortVariable + " Short integers from -32,768 to 32,767");

        int intVariable = 3100000;
        System.out.println(intVariable + " Integers from -2,147,483,648 to 2,147,483,647");

        long longVariable = 399878888999L;
        System.out.println(longVariable + " Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");

        float floatVariable = 3.14F;
        System.out.println(floatVariable + " Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits");

        double doubleVariable = 3.149284352;
        System.out.println(doubleVariable + " Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits");

        char charVariable = 'R';
        System.out.println(charVariable + " a single Unicode character that’s stored in two bytes");

        boolean isTuesday = true;
        System.out.println(isTuesday + " a true or false value");

        //    try to assign a character type to a variable that has been declared as an int

        int favoriteNumber;
        favoriteNumber = 'c';
        int favoriteCapitalLetter = 'C';
        System.out.println("My favorite number is " + favoriteNumber);
        System.out.println("My favorite capital number is " + favoriteCapitalLetter);

        //    try to define a variable with the name class. this is what happens:

//        boolean class = true;
//
//        Error:(42, 9) java: not a statement
//        Error:(42, 16) java: ';' expected
//        Error:(42, 22) java: <identifier> expected
//        Error:(42, 25) java: illegal start of type
//        Error:(42, 29) java: <identifier> expected
//        Error:(42, 30) java: ';' expected
//        Error:(51, 2) java: reached end of file while parsing


        //    initialize a variable, but do not assign it a value, then try and print it to the console:

//        int myAgeNextYear;
//        System.out.println(myAgeNextYear);

//        Error:(47, 28) java: variable myAgeNextYear might not have been initialized
    }
}