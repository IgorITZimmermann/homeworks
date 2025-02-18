package de.ait.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputExample {
    public static void main(String[] args) {
        String filePath = "output.bin"; // Путь к файлу, который будет читаться / Path to the file to be read
        try {
            // Создаем BufferedInputStream, который оборачивает FileInputStream для более эффективного чтения
            // Create a BufferedInputStream that wraps FileInputStream for more efficient reading
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
            int bytesToRead; // Количество байт, прочитанных за один раз / Number of bytes read at a time
            byte[] buffer = new byte[1024]; // Буфер для хранения прочитанных данных / Buffer to store read data
            int totalBytes = 0; // Общее количество прочитанных байт / Total number of bytes read
            while ((bytesToRead = bufferedInputStream.read(buffer)) != -1){ // Чтение данных в буфер / Reading data into the buffer
                totalBytes = bytesToRead + totalBytes; // Увеличиваем общее количество прочитанных байт / Increase the total number of bytes read
                System.out.println("Total bytes read: " + totalBytes); // Вывод общего количества прочитанных байт / Output the total number of bytes read
            }
            bufferedInputStream.close(); // Закрываем поток / Close the stream
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