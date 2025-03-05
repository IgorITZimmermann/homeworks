package de.ait.generics;

// Класс ArtStyle представляет стиль искусства.
public class ArtStyle {
    // Поле для хранения названия стиля
    private String styleName; // например, "Impressionism", "Cubism"

    // Конструктор для создания объекта ArtStyle с названием стиля
    public ArtStyle(String styleName) {
        this.styleName = styleName;
    }

    // Метод для получения названия стиля
    public String getStyleName() {
        return styleName;
    }

    // Переопределение метода toString для удобного вывода информации о стиле
    @Override
    public String toString() {
        return "ArtStyle{" +
                "styleName='" + styleName + '\'' +
                '}';
    }
}