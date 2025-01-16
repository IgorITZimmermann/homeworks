package de.ait.homework30;

/**
 * The MediaManager class serves as the entry point for managing media uploads.
 * It demonstrates the usage of different uploaders for video and image files, ensuring type validation before uploading.
 *
 * Класс MediaManager является точкой входа для управления загрузкой медиа.
 * Он демонстрирует использование различных загрузчиков для видео и изображений, обеспечивая проверку типа файлов перед загрузкой.
 */
public class MediaManager {

    public static void main(String[] args) {
        // Uploading a video file
        // Загрузка видеофайла
        Uploadable videoUpload = new VideoUploader();
        String videoPath = "/Dokuments/private/video.mp4";
        boolean checkFileResult = videoUpload.checkFileType(videoPath);
        if (checkFileResult) {
            videoUpload.uploadMedia(videoPath);
        } else {
            System.out.println("Wrong video type");
        }

        System.out.println("---------------------------");

        // Uploading an image file
        // Загрузка изображения
        String imagePath = "/Dokuments/private/image.jpg";
        Uploadable imageUpload = new PhotoUploader();
        boolean checkImageResult = imageUpload.checkFileType(imagePath);
        if (checkImageResult) {
            imageUpload.uploadMedia(imagePath);
        } else {
            System.out.println("Wrong image type");
        }

        System.out.println("---------------------------");

        // Attempting to upload an unsupported file
        // Попытка загрузки неподдерживаемого файла
        String photoPath = "/Dokuments/private/image.png24";
        Uploadable photoUpload = new PhotoUploader();
        boolean checkPhotoResult = imageUpload.checkFileType(photoPath);
        if (checkPhotoResult) {
            photoUpload.uploadMedia(photoPath);
        } else {
            System.out.println("Wrong photo type");
        }
    }
}
