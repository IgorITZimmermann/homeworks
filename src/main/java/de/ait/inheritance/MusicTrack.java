package de.ait.inheritance;

/**
 * Класс MusicTrack представляет музыкальный трек с названием и исполнителем.
 * Предоставляет базовые функции для работы с музыкальными треками, такие как вывод информации и воспроизведение.
 *
 * The MusicTrack class represents a music track with a title and an artist.
 * Provides basic functionality such as printing information and playing the track.
 */
public class MusicTrack {

    private String title; // Название трека / Title of the track
    private String artist; // Исполнитель трека / Artist of the track

    /**
     * Конструктор для создания музыкального трека с заданным названием и исполнителем.
     *
     * Constructor to create a music track with the specified title and artist.
     *
     * @param title Название трека / Title of the track
     * @param artist Исполнитель трека / Artist of the track
     */
    public MusicTrack(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    /**
     * Метод для вывода информации о треке.
     *
     * Method to print information about the track.
     */
    public void printInfo() {
        System.out.println("Title: " + title + ", Artist: " + artist);
    }

    /**
     * Метод для воспроизведения трека.
     *
     * Method to play the track.
     */
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    /**
     * Возвращает название трека.
     *
     * Returns the title of the track.
     *
     * @return Название трека / Title of the track
     */
    public String getTitle() {
        return title;
    }

    /**
     * Устанавливает название трека.
     *
     * Sets the title of the track.
     *
     * @param title Новое название трека / New title of the track
     */
    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be null or empty.");
        }
    }

    /**
     * Возвращает исполнителя трека.
     *
     * Returns the artist of the track.
     *
     * @return Исполнитель трека / Artist of the track
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Устанавливает исполнителя трека.
     *
     * Sets the artist of the track.
     *
     * @param artist Новый исполнитель трека / New artist of the track
     */
    public void setArtist(String artist) {
        if (artist != null && !artist.trim().isEmpty()) {
            this.artist = artist;
        } else {
            System.out.println("Artist cannot be null or empty.");
        }
    }
}