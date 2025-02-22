package de.ait.javaio;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Slf4j
public class FileCopyExample {

    public static void main(String[] args) {
        String source = "source.txt";
        String destination = "destination.txt";

        try (FileInputStream inputStream = new FileInputStream(source);
             FileOutputStream fileOutputStream = new FileOutputStream(destination)) {

            int date;
            while ((date = inputStream.read()) != -1) {
                fileOutputStream.write(date);
            }
            System.out.println("File copied successfully");
        } catch (IOException exception) {
            log.error("File not found");
        }


    }
}
