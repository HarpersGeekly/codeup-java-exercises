import java.util.Arrays;

/**
 * Created by JustinReich on 1/11/17.
 */
public class ArrayExamples {
    public static void main(String[] args) {

        // ============================ Creating an array / printing an array ==========================================

        int[] testArray;
        testArray = new int[10];

        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + "|");
        }


        System.out.println("\n" + "====================");
        // ============================== Alternative way to loop and print out array ==================================

        for (int test : testArray) {
            System.out.print(test + "|");
        }


        System.out.println("\n" + "====================");
        // ===================================== Assigning values ======================================================

        testArray[1] = 7;

        for (int test : testArray) {
            System.out.print(test + " ");
        }


        System.out.println("\n" + "====================");



        // =============================================== METHODS =====================================================

        //===================================== Arrays.toString(arrayName) =============================================


        String[] animals = {"dog", "cat", "pig", "cow"};
        System.out.println(Arrays.toString(animals));


        System.out.println("\n" + "====================");
        //=================================== Arrays.fill(arrayName, value) method =====================================

        char[] grades = new char[5];
        Arrays.fill(grades, 'A');
        System.out.println(Arrays.toString(grades));


        System.out.println("\n" + "====================");

        String[] runningPlan = new String[15];
        Arrays.fill(runningPlan, 0, 5, "1 mile"); // to fill a portion from index 0 to index 5
        Arrays.fill(runningPlan, 5, 10, "1.5 miles"); // to fill a portion from index 5 to index 10
        Arrays.fill(runningPlan, 10, 15, "2 miles"); // to fill a portion from index 10 to index 15
        System.out.println(Arrays.toString(runningPlan));


        System.out.println("\n" + "====================");
        //=================================== Arrays.equals(array1, array2) method =====================================
        // Comparing the arrays:

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 4, 3};
        System.out.println(Arrays.equals(array1, array2));


        System.out.println("\n" + "====================");
        //=================================== Arrays.copyOf(array, length) method ======================================

        String[] foodJustinLikes = {"hamburgers", "pie", "mashed potatoes", "kale", "peanut butter"};
        String[] foodPamLikes = Arrays.copyOf(foodJustinLikes, 3);
        System.out.println(Arrays.toString(foodPamLikes));

        // Arrays.copyOfRange(array, startIndex, toIndex) method

        String[] foodJustinStillLikes = {"hamburgers", "pie", "mashed potatoes", "kale", "peanut butter"};
        String[] bellyAche = Arrays.copyOfRange(foodJustinStillLikes, 3, 5);
        System.out.println(Arrays.toString(bellyAche));


        // Arrays.sort(array, startIndex, toIndex) method

        String[] students = {"Ron", "John", "Kevin", "Jeff", "Mittsy", "Dan"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        String[] studentTopFavoriteColors = {"2", "8", "1", "Justin", "Liz", "Ben"};
        Arrays.sort(studentTopFavoriteColors, 3, 6);
        System.out.println(Arrays.toString(studentTopFavoriteColors));


        // Arrays.binarySearch(array, value)

        String[] hayStack = new String[100];

        Arrays.fill(hayStack, 0, 50, "hay");
        Arrays.fill(hayStack, 50, 100, "wheat");

        hayStack[87] = "needle";

        System.out.println(Arrays.toString(hayStack));

        int index = Arrays.binarySearch(hayStack, "needle");
        System.out.println(index);

        Arrays.sort(hayStack);

        index = Arrays.binarySearch(hayStack, "needle");
        System.out.println(index);

        // Array referencing and initializing multiple arrays from a variable name

        String[] topBondFilms = new String[10];
        topBondFilms[8] = "Quantum of Solace";
        topBondFilms = new String[3]; // new array referenced to same variable

        System.out.println(Arrays.toString(topBondFilms));

        topBondFilms[0] = "Goldfinger";
        topBondFilms[1] = "Skyfall";
        topBondFilms[2] = "Goldeneye";

        String[] myFavFilms = topBondFilms;

        System.out.println(Arrays.toString(myFavFilms));

        // Two-dimensional arrays

        int[][] spreadSheet = new int[5][5];

        for (int i = 0; i < spreadSheet.length; i++) { // iterate through rows
            System.out.println("");
            for (int j = 0; j < spreadSheet[i].length; j++) { // iterate through columns
                System.out.print(spreadSheet[i][j] + " ");
            }
        }

        // Rectangle and Jagged arrays

        int[][] jaggedArray = new int[5][];

        int[] row1 = new int[3];
        int[] row2 = new int[10];
        int[] row3 = new int[5];
        int[] row4 = new int[7];
        int[] row5 = new int[2];

        jaggedArray[0] = row1;
        jaggedArray[1] = row2;
        jaggedArray[2] = row3;
        jaggedArray[3] = row4;
        jaggedArray[4] = row5;

        System.out.println("\n");
        for (int[] singleArray : jaggedArray) {
            System.out.println(Arrays.toString(singleArray));
        }
    }
}