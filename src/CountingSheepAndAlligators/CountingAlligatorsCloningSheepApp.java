package CountingSheepAndAlligators;

/**
 * Created by RyanHarper on 1/20/17.
 */
public class CountingAlligatorsCloningSheepApp {
    public static void main(String[] args) {
        Alligator alligator = new Alligator();
        Sheep sheep = new Sheep();

        System.out.println("Counting Alligators...");
        //        uses the CountingSheepAndAlligators.CountUtil class to count an CountingSheepAndAlligators.Alligator object 3 times
        CountUtil.count(alligator, 3);
        //        counts the first sheep 2 times
        System.out.println("Counting CountingSheepAndAlligators.Sheep...");
        sheep.setName("Blackie");
        CountUtil.count(sheep, 2);
        //        clones the first sheep, changes the name, and counts it 3 times
        sheep.setName("Dolly");
        CountUtil.count(sheep, 3);
        //        counts the first sheep again 1 time
        sheep.setName("Blackie");
        CountUtil.count(sheep, 1);
    }
}






