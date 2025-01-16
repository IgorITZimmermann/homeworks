package de.ait.homework30;

/**
 * The Uploadable interface defines a contract for uploading media files.
 * It provides methods for uploading and checking file types.
 *
 * Интерфейс Uploadable задает контракт для загрузки медиафайлов.
 * Он предоставляет методы для загрузки и проверки типов файлов.
 */
public interface Uploadable {

    // Supported file types
    // Поддерживаемые типы файлов
    String FILE_TYPE_JPG = ".jpg";
    String FILE_TYPE_PNG = ".png";
    String FILE_TYPE_MP4 = ".mp4";
    String FILE_TYPE_MOV = ".mov";

    /**
     * Uploads the specified media file.
     *
     * @param filePath the path of the file to upload
     *
     * Загружает указанный медиафайл.
     *
     * @param filePath путь к файлу для загрузки
     */
    void uploadMedia(String filePath);

    /**
     * Checks if the file type is supported.
     *
     * @param filePath the path of the file to check
     * @return true if the file type is supported, false otherwise
     *
     * Проверяет, является ли тип файла поддерживаемым.
     *
     * @param filePath путь к файлу для проверки
     * @return true, если тип файла поддерживается, false в противном случае
     */
    default boolean checkFileType(String filePath) {
        if (filePath.endsWith(FILE_TYPE_JPG) || filePath.endsWith(FILE_TYPE_PNG)
                || filePath.endsWith(FILE_TYPE_MP4) || filePath.endsWith(FILE_TYPE_MOV)) {
            return true;
        } else {
            return false;
        }
    }
}
