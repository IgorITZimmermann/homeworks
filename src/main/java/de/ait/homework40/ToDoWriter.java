package de.ait.homework40;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@Slf4j
public class ToDoWriter {
    public static void main(String[] args) {
        String file = "tasks.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task:");
        String taskStr = scanner.nextLine();
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))){
            bufferedWriter.write(taskStr);
            bufferedWriter.newLine();
            log.info("Task written to file: {}", taskStr);
        }
        catch (IOException exception){
            log.error("I/O error: {}", exception.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
