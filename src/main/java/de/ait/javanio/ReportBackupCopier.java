package de.ait.javanio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

@Slf4j
public class ReportBackupCopier {
    public static void main(String[] args) {
        // Создаем объекты Path для исходного и целевого файлов
        // Create Path objects for the source and destination files
        Path source = Path.of("crimes_report.txt");
        Path destination = Path.of("backup_crimes_report.txt");

        // Вызываем метод для копирования отчета
        // Call the method to copy the report
        copyReport(source, destination);
    }

    public static void copyReport(Path source, Path destination) {
        try {
            // Проверяем, существует ли целевой файл, и если нет, создаем его
            // Check if the destination file exists, and if not, create it
            if (!Files.exists(destination)) {
                Files.createFile(destination);

                // Открываем FileChannel для чтения из исходного файла и записи в целевой файл
                // Open FileChannels for reading from the source file and writing to the destination file
                try (FileChannel inFileChannel = FileChannel.open(source, StandardOpenOption.READ);
                     FileChannel outFileChannel = FileChannel.open(destination, StandardOpenOption.WRITE)) {

                    // Создаем буфер размером 1024 байта для чтения данных
                    // Create a buffer with a size of 1024 bytes for reading data
                    ByteBuffer buffer = ByteBuffer.allocate(1024);

                    // Переменная для хранения количества прочитанных байт
                    // Variable to store the number of bytes read
                    int bytesRead;

                    // Читаем данные из исходного файла в буфер и записываем их в целевой файл
                    // Read data from the source file into the buffer and write it to the destination file
                    while ((bytesRead = inFileChannel.read(buffer)) != -1) {
                        // Переключаем буфер в режим чтения
                        // Switch the buffer to read mode
                        buffer.flip();

                        // Записываем данные из буфера в целевой файл
                        // Write data from the buffer to the destination file
                        outFileChannel.write(buffer);

                        // Очищаем буфер для следующего чтения
                        // Clear the buffer for the next read
                        buffer.clear();
                    }
                }
            }
        } catch (IOException exception) {
            // Логируем ошибку, если что-то пошло не так при создании файла или копировании данных
            // Log the error if something went wrong while creating the file or copying data
            log.error("Error creating file: {}", exception.getMessage());
        }
    }
}