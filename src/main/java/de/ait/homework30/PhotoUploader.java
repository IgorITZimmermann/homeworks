package de.ait.homework30;

import lombok.extern.slf4j.Slf4j;

/**
 * The PhotoUploader class implements the Uploadable interface, allowing for the upload of media files.
 * It provides logging functionality to record the upload process.
 *
 * Класс PhotoUploader реализует интерфейс Uploadable, предоставляя возможность загрузки медиафайлов.
 * Класс обеспечивает запись журнала (логирование) в ходе загрузки.
 */
@Slf4j
public class PhotoUploader implements Uploadable {

    /**
     * Uploads a media file specified by the given file path.
     *
     * @param filePath the path of the file to upload
     *
     * Загружает медиафайл, указанный в пути к файлу.
     *
     * @param filePath путь к файлу для загрузки
     */
    @Override
    public void uploadMedia(String filePath) {
        if (filePath == null || filePath.isEmpty()) {
            log.warn("File path is empty or null");
        } else {
            log.info("File {} uploaded", filePath);
        }
    }
}
