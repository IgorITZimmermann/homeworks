package de.ait.generics;

// Класс Painting представляет картину и реализует интерфейс Artwork.
public class Painting implements Artwork {
    // Поля для хранения названия картины и имени художника
    private String title, artist;

    // Конструктор для создания объекта Painting с названием и художником
    public Painting(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Метод для получения названия картины
    public String getTitle() {
        return title;
    }

    // Метод для получения имени художника
    public String getArtist() {
        return artist;
    }

    // Метод для установки названия картины
    public void setTitle(String title) {
        this.title = title;
    }

    // Переопределение метода toString для удобного вывода информации о картине
    @Override
    public String toString() {
        return "Painting{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }

    // Реализация метода display из интерфейса Artwork
    @Override
    public void display() {
        System.out.println("Картина: " + title + ", автор: " + artist);
    }
}