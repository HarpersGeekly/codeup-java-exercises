import Validator.Validator;

import java.util.Scanner;

/**
 * Created by RyanHarper on 1/19/17.
 */
public class CodingChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        //problem #1:

        String input = validator.getString("Enter a word with a number at the end:");
        input.replaceAll("\\D", "");
        System.out.println(input);

        int output = Integer.parseInt(input);
        System.out.println(output);

//        if (input = output) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
        //problem #2:





        //problem #3:




        //problem #4:




        //problem #5:




    }
}
