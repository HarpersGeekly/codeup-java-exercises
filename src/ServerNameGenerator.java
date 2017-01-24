import java.util.Arrays;

/**
 * Created by RyanHarper on 1/11/17.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
//    Server Name Generator
//    We are going to build a server name generator. To do this, we will need to follow the specs below.
//    Create two arrays:
//        One with at least 10 adjectives:
//        Another with at least 10 nouns:

        String[] adjectivesArray = {"short", "tall", "old", "young", "important", "fast", "slow", "big", "dumb", "wise"};
        String[] nounsArray = {"Bus", "Airplane", "Train", "Tree", "Animal", "TestOOP.Person", "London", "Lightning", "Apple", "Banana"};

        System.out.println("Welcome to the Server Name Generator");
        System.out.println("Your random name is: " + adjectivesArray[generateRandomNumber()] + " " + nounsArray[generateRandomNumber()]);
    }

    public static int generateRandomNumber() {
        return (int)(Math.random()*10);
    }
}









