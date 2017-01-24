package CountingSheepAndAlligators;

/**
 * Created by RyanHarper on 1/20/17.
 */
public class Alligator implements Countable {

    private int count = 0;
    private String name = "CountingSheepAndAlligators.Alligator";

    @Override
    public void resetCount() {
        count = 0;
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return name;
        // return count + " alligator"; will also work...
    }
}


