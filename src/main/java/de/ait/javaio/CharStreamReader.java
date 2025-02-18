package de.ait.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamReader {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Путь к файлу, который будет читаться / Path to the file to be read
        try {
            FileReader reader = new FileReader(filePath); // Создаем FileReader для чтения файла / Create FileReader to read the file
            int data; // Переменная для хранения прочитанного символа / Variable to store the read character
            while ((data = reader.read()) != -1){ // Чтение символа за символом / Reading character by character
                System.out.print( (char) data); // Вывод прочитанного символа / Output the read character
            }
            reader.close(); // Закрываем поток / Close the stream
        }
        catch (FileNotFoundException exception){ // Обработка исключения, если файл не найден / Handle exception if file is not found
            System.out.println("File not found");
            exception.printStackTrace();
        }
        catch (IOException exception){ // Обработка исключения при ошибке чтения / Handle exception if there is a reading error
            System.out.println("Error reading from file");
            exception.printStackTrace();
        }
    }
}