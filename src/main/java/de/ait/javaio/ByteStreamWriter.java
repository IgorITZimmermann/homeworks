package de.ait.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWriter {
    public static void main(String[] args) {
        String textToWrite = "Hello World, Java IO Stream functionalities !!!"; // Текст для записи в файл / Text to write to the file
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output.bin"); // Создаем FileOutputStream для записи в файл / Create FileOutputStream to write to the file
            byte[] bytes = textToWrite.getBytes(); // Преобразуем текст в массив байт / Convert text to a byte array
            fileOutputStream.write(bytes); // Записываем массив байт в файл / Write the byte array to the file
            System.out.println("File written successfully"); // Сообщение об успешной записи / Success message
            fileOutputStream.close(); // Закрываем поток / Close the stream
        }
        catch (FileNotFoundException exception){ // Обработка исключения, если файл не найден / Handle exception if file is not found
            System.out.println("File not found");
            exception.printStackTrace();
        }
        catch (IOException exception){ // Обработка исключения при ошибке записи / Handle exception if there is a writing error
            System.out.println("Error writing to file");
            exception.printStackTrace();
        }
    }
}