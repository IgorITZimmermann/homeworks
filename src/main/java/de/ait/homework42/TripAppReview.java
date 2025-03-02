package de.ait.homework42;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

@Slf4j
public class TripAppReview {

    private static Scanner scanner = new Scanner(System.in);

    private static final String FILE_NAME = "travel_review.txt";

    public static void main(String[] args) {
        Path path = Path.of(FILE_NAME);

        System.out.println("Please enter your review:");
        String review = scanner.nextLine().trim();
        if (review == null || review.isEmpty()) {
            System.out.println("Review can not be empty!");
        }
        else if (review.length() > 100) {
            System.out.println("Review can not be longer than 100 characters!");
        }
        else {
            try {
                Files.writeString(path, review + System.lineSeparator(),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println("Your review has been saved!");
                log.info("Review saved to file: {}", FILE_NAME);
            } catch (IOException exception) {
                log.error("File not found: {}", exception.getMessage());
            }
        }
    }
}
