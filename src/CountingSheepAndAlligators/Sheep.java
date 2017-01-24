package CountingSheepAndAlligators;

/**
 * Created by RyanHarper on 1/20/17.
 */
public class Sheep implements Countable, Cloneable {

    private int count = 0;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
    }
}