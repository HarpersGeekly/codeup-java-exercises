package CountingSheepAndAlligators;

/**
 * Created by RyanHarper on 1/20/17.
 */
public class CountUtil {
    public static void count(Countable c, int maxCount) {
        c.resetCount();
        for (int i = 0; i < maxCount; i++){
            c.incrementCount();
            System.out.println(c.getCount() + " " + c.getCountString());
        }

//        while (c.getCount() <= maxCount){
//            System.out.println(c.getCount() + " " + c.getCountString());
//            c.incrementCount();
//        }
        // if you did this while loop, what would happen? Anything with the counts?
        System.out.println();
    }
}

