package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by RyanHarper on 1/23/17.
 */
public class FilesApplication {
    public static void main(String[] args) throws IOException{
        String directory = "resources/book";
        Path directoryPath = Paths.get(directory);

        if(Files.notExists(directoryPath)) { // if it doesn't exist..
            Files.createDirectories(directoryPath); // create one
        }

        String file = "books.txt";
        Path filePath = Paths.get(directory, file /*, "2.txt", "3.txt"*/);
        if(Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        String[] books = {"The Art of War", "The Hobbit", "Design Patterns"};

        FileWriter fileWriter = new FileWriter(filePath.toFile() /*, true*/);//adding "true" writes the same content from memory!
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter writer = new PrintWriter(bufferedWriter);

        for (String book : books) {
            writer.println(book);
        }

        writer.close();
        bufferedWriter.close();
        fileWriter.close(); //if you don't close, nothing will get written. Close all these (Best Practice)

        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader reader = new BufferedReader(fileReader);

        String line = reader.readLine();
        while (null != line) {
            System.out.println(line);
            line = reader.readLine(); //read the next line
        }
    }
}
