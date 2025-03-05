package de.ait.generics;

// Класс ArtPiece представляет произведение искусства.
public class ArtPiece {
    // Поля для хранения года создания и названия произведения
    private int year;
    private String title;

    // Конструктор для создания объекта ArtPiece с годом и названием
    public ArtPiece(int year, String title) {
        this.year = year;
        this.title = title;
    }

    // Метод для получения года создания произведения
    public int getYear() {
        return year;
    }

    // Метод для получения названия произведения
    public String getTitle() {
        return title;
    }

    // Переопределение метода toString для удобного вывода информации о произведении
    @Override
    public String toString() {
        return "ArtPiece{" +
                "year=" + year +
                ", title='" + title + '\'' +
                '}';
    }
}