package de.ait.generics;

// Класс Artist представляет художника.
public class Artist {
    // Поля для хранения имени и национальности художника
    private String name, nationality;

    // Конструктор для создания объекта Artist с именем и национальностью
    public Artist(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    // Метод для получения имени художника
    public String getName() {
        return name;
    }

    // Метод для установки имени художника
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения национальности художника
    public String getNationality() {
        return nationality;
    }

    // Метод для установки национальности художника
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Переопределение метода toString для удобного вывода информации о художнике
    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}