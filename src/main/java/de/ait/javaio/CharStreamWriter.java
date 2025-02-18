package de.ait.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWriter {
    public static void main(String[] args) {
        String textToWrite = "Hello World!"; // Текст для записи в файл / Text to write to the file
        try {
            FileWriter writer = new FileWriter("output.txt"); // Создаем FileWriter для записи в файл / Create FileWriter to write to the file
            writer.write(textToWrite); // Записываем текст в файл / Write the text to the file
            writer.close(); // Закрываем поток / Close the stream
            System.out.println("File written successfully"); // Сообщение об успешной записи / Success message
        } catch (IOException exception) { // Обработка исключения при ошибке записи / Handle exception if there is a writing error
            System.out.println("Error writing to file");
            exception.printStackTrace();
        }

    }
}