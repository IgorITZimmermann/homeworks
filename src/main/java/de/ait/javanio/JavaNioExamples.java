package de.ait.javanio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

@Slf4j
public class JavaNioExamples {
    public static void main(String[] args) {
        // Создаем объект Path для файла "products.dat"
        // Create a Path object for the file "products.dat"
        Path path = Path.of("products.dat");

        // Выводим абсолютный путь к файлу
        // Print the absolute path of the file
        System.out.println(path.toAbsolutePath());

        // Выводим родительскую директорию файла
        // Print the parent directory of the file
        System.out.println(path.toAbsolutePath().getParent().toString());

        // Выводим количество элементов в пути (например, папок и файлов)
        // Print the number of elements in the path (e.g., folders and files)
        System.out.println(path.getNameCount());

        // Проверяем, является ли путь абсолютным
        // Check if the path is absolute
        System.out.println(path.isAbsolute());

        try {
            // Создаем объект Path для директории "products"
            // Create a Path object for the directory "products"
            Path dir = Path.of("products");

            // Проверяем, существует ли директория, и если нет, создаем её
            // Check if the directory exists, and if not, create it
            if (!Files.exists(dir)) {
                Files.createDirectory(dir);
            }

            // Создаем объект Path для файла "test.txt" внутри директории "products"
            // Create a Path object for the file "test.txt" inside the "products" directory
            Path file = Path.of("products/test.txt");

            // Записываем строку "Java NIO" в файл, создавая его, если он не существует
            // Write the string "Java NIO" to the file, creating it if it doesn't exist
            Files.writeString(file, "Java NIO", StandardOpenOption.CREATE);

            // Читаем все строки из файла и выводим их в лог
            // Read all lines from the file and log them
            List<String> allLines = Files.readAllLines(file);
            for (String line : allLines) {
                log.info(line);
            }

            // Создаем объект Path для целевого файла "test_copie.txt"
            // Create a Path object for the target file "test_copie.txt"
            Path targetPath = Path.of("products/test_copie.txt");

            // Копируем файл "test.txt" в "test_copie.txt", заменяя его, если он уже существует
            // Copy the file "test.txt" to "test_copie.txt", replacing it if it already exists
            Files.copy(file, targetPath, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException exception) {
            // Логируем ошибку, если что-то пошло не так при создании директории или файла
            // Log the error if something went wrong while creating the directory or file
            log.error("Error creating directory: {}", exception.getMessage());
        }

        try (// Открываем FileChannel для файла "test_copie.txt" с возможностью чтения и записи
             // Open a FileChannel for the file "test_copie.txt" with read and write options
             FileChannel fileChannel = FileChannel.open(Path.of("products/test_copie.txt"), StandardOpenOption.READ, StandardOpenOption.WRITE)) {

            // Создаем буфер размером 1024 байта
            // Create a buffer with a size of 1024 bytes
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Читаем данные из файла в буфер
            // Read data from the file into the buffer
            fileChannel.read(buffer);

            // Переключаем буфер в режим чтения
            // Switch the buffer to read mode
            buffer.flip();

            // Выводим содержимое буфера в консоль посимвольно
            // Print the contents of the buffer to the console character by character
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
        } catch (IOException exception) {
            // Логируем ошибку, если что-то пошло не так при работе с файлом
            // Log the error if something went wrong while working with the file
            log.error("Error creating file: {}", exception.getMessage());
        }

        try (// Открываем FileChannel для файла "test_copie.txt" с возможностью чтения и записи
             // Open a FileChannel for the file "test_copie.txt" with read and write options
             FileChannel fileChannel = FileChannel.open(Path.of("products/test_copie.txt"),
                     StandardOpenOption.READ, StandardOpenOption.WRITE)) {

            // Создаем буфер, содержащий строку "Java NIO !!!! Hallo !!!!!"
            // Create a buffer containing the string "Java NIO !!!! Hallo !!!!!"
            ByteBuffer buffer = ByteBuffer.wrap("Java NIO !!!! Hallo !!!!!".getBytes());

            // Записываем содержимое буфера в файл
            // Write the contents of the buffer to the file
            fileChannel.write(buffer);

            // Логируем сообщение об успешной записи в файл
            // Log a message indicating that the file was written successfully
            log.info("File written");
        } catch (IOException exception) {
            // Логируем ошибку, если что-то пошло не так при записи в файл
            // Log the error if something went wrong while writing to the file
            log.error("Error creating file: {}", exception.getMessage());
        }
    }
}