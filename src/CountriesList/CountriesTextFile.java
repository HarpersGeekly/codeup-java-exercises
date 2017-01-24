package CountriesList;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RyanHarper on 1/23/17.
 */
public class CountriesTextFile {
    private Path filePath;
    //Create a class named CountriesTextFile that contains a method that allows you to read a list of countries from a file
//and another method that allows you to write a list of countries to a file.

    public void listOfCountriesReader() throws IOException {
        // allows you to read a list of countries from a file
        createFile();
        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (null != line) {
            System.out.println(line);
            line = reader.readLine(); //read the next line
        }

        fileReader.close();
        reader.close();

    }

    List<String> countries = new ArrayList<>();

    public void listOfCountriesWriter(String newCountry) throws IOException {
        createFile();
        // allows you to write a list of countries to a file
        FileWriter fileWriter = new FileWriter(filePath.toFile() , true);//adding "true" writes the same content from memory!
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter writer = new PrintWriter(bufferedWriter);

        //for (String country : countries) {
            writer.println(newCountry);
        //}
        writer.close();
        bufferedWriter.close();
        fileWriter.close();

    }

//        Store the list of countries in a text file named countries.txt in the same directory as the CountriesTextFile class.
//        If the countries.txt file doesn’t exist, CountriesTextFile should create it.

    public void createFile() {
        String directory = "src";
        String file = "CountriesList/countries.txt";
        filePath = Paths.get(directory, file);
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
