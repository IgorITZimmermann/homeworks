package de.ait.homework42;

import de.ait.javaio.Person;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TripApp {

    private static final String FILE_NAME = "travel_route.txt";

    public static void main(String[] args) {
        Path path = Path.of(FILE_NAME);
        try {


            List<String> lines = Files.readAllLines(path);
            if( lines.isEmpty()){
                System.out.println("No travel route found. Please add travel route to file: " + FILE_NAME);
            }
            else {
                System.out.println("Travel Route:");
                for (int i = 0; i < lines.size(); i++) {
                    System.out.println(i + 1 + ". " + lines.get(i));
                }
            }
        }
        catch (IOException exception){
            log.error("File not found: {}", exception.getMessage());
        }
    }
}
