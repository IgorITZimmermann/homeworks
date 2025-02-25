package de.ait.javanio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class WantedListReader {
    public static void main(String[] args) {
        // Создаем объект Path для файла "wanted.txt"
        // Create a Path object for the file "wanted.txt"
        Path path = Path.of("wanted.txt");

        // Читаем список из файла и сохраняем его в список result
        // Read the list from the file and store it in the result list
        List<String> result = readWantedList(path);

        // Выводим каждую строку из списка в лог
        // Log each line from the list
        for (String line : result) {
            log.info(line);
        }
    }

    public static List<String> readWantedList(Path path) {
        // StringBuilder для накопления данных, прочитанных из файла
        // StringBuilder to accumulate data read from the file
        StringBuilder stringBuilder = new StringBuilder();

        // Список для хранения строк из файла
        // List to store lines from the file
        List<String> wantedList = new ArrayList<>();

        // Открываем FileChannel для чтения файла
        // Open a FileChannel to read the file
        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            // Создаем буфер размером 256 байт для чтения данных
            // Create a buffer with a size of 256 bytes for reading data
            ByteBuffer buffer = ByteBuffer.allocate(256);

            // Переменная для хранения количества прочитанных байт
            // Variable to store the number of bytes read
            int bytesRead;

            // Читаем данные из файла в буфер
            // Read data from the file into the buffer
            while ((bytesRead = fileChannel.read(buffer)) != -1) {
                // Переключаем буфер в режим чтения
                // Switch the buffer to read mode
                buffer.flip();

                // Читаем данные из буфера и добавляем их в StringBuilder
                // Read data from the buffer and append it to the StringBuilder
                while (buffer.hasRemaining()) {
                    stringBuilder.append((char) buffer.get());
                }

                // Очищаем буфер для следующего чтения
                // Clear the buffer for the next read
                buffer.clear();
            }
        } catch (IOException exception) {
            // Логируем ошибку, если что-то пошло не так при чтении файла
            // Log the error if something went wrong while reading the file
            log.error("Error creating file: {}", exception.getMessage());
        }

        // Разделяем содержимое StringBuilder на строки по символу новой строки
        // Split the contents of the StringBuilder into lines by the newline character
        String[] lines = stringBuilder.toString().split("\n");

        // Добавляем каждую строку в список wantedList
        // Add each line to the wantedList
        for (String line : lines) {
            wantedList.add(line);
        }

        // Возвращаем список строк
        // Return the list of lines
        return wantedList;
    }
}