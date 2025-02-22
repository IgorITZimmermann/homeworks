package de.ait.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamReader {
    public static void main(String[] args) {
        String filePath = "output.bin"; // Путь к файлу, который будет читаться / Path to the file to be read

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath); // Создаем FileInputStream для чтения файла / Create FileInputStream to read the file
            int data; // Переменная для хранения прочитанного байта / Variable to store the read byte
            while ((data = fileInputStream.read()) != -1){ // Чтение байта за байтом / Reading byte by byte
                System.out.print( (char) data); // Вывод прочитанного байта как символа / Output the read byte as a character
            }
            fileInputStream.close(); // Закрываем поток / Close the stream
        }
        catch (FileNotFoundException exception){ // Обработка исключения, если файл не найден / Handle exception if file is not found
            System.out.println("File not found");
            exception.printStackTrace();
        }
        catch (IOException ioException){ // Обработка исключения при ошибке чтения / Handle exception if there is a reading error
            System.out.println("Error reading from file");
            ioException.printStackTrace();
        }
    }
}