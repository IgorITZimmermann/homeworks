package de.ait.javaio;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Slf4j
public class PersonalDairy {
    private static final String FILE_NAME = "diary.txt";
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        boolean flag = true;
        while (flag) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    readDiary();
                    break;
                case 2:
                    addEntry();
                    break;
                case 3:
                    System.out.println("Выход из программы.");
                    flag = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }

        scanner.close();

    }

    public static void showMenu(){
        System.out.println("\n--- Личный дневник ---");
        System.out.println("1. Прочитать все записи");
        System.out.println("2. Добавить новую запись");
        System.out.println("3. Выйти");
        System.out.print("Выберите действие: ");
    }

    public static void addEntry(){
        System.out.print("Текст заметки: ");
        String text = scanner.nextLine();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String textToSaveWithTime = localDateTime.format(formatter) + " " + text;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))){
            writer.write(textToSaveWithTime);
            writer.newLine();
            log.info("Entry added to file");
        }
        catch (IOException exception){
            log.error("Error writing to file");
        }
    }

    // Функция для чтения всех записей
    private static void readDiary() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла: " + e.getMessage());
            }
        } else {
            System.out.println("Дневник пуст или не существует.");
        }
    }
}
