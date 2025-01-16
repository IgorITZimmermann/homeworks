package de.ait.homework30;

import lombok.extern.slf4j.Slf4j;

/**
 * The VideoUploader class implements the Uploadable interface, allowing for the upload of video files.
 * It provides logging functionality to record the upload process.
 *
 * Класс VideoUploader реализует интерфейс Uploadable, обеспечивая загрузку видеофайлов. Класс обеспечивает логирование хода загрузки.
 */
@Slf4j
public class VideoUploader implements Uploadable {

    /**
     * Uploads a video file specified by the given file path.
     *
     * @param filePath the path of the file to upload
     *
     * Загружает видеофайл, указанный в пути к файлу.
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
