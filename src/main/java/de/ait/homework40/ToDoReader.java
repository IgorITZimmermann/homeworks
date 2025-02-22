package de.ait.homework40;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Slf4j
public class ToDoReader {
    public static void main(String[] args) {
        String file = "tasks.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String toDoLine;
            while ((toDoLine = bufferedReader.readLine()) != null) {
                System.out.println(toDoLine);
            }
        } catch (FileNotFoundException exception) {
            log.error("File not found: {}", exception.getMessage());
        } catch (IOException exception) {
            log.error("I/O error: {}", exception.getMessage());
        }
    }
}
