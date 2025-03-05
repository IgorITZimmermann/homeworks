package de.ait.generics;

// Класс Sculpture представляет скульптуру и реализует интерфейс Artwork.
public class Sculpture implements Artwork {
    // Поля для хранения названия скульптуры и материала
    private String name;
    private String material;

    // Конструктор для создания объекта Sculpture с названием и материалом
    public Sculpture(String name, String material) {
        this.name = name;
        this.material = material;
    }

    // Реализация метода display из интерфейса Artwork
    @Override
    public void display() {
        System.out.println("Скульптура: " + name + ", материал: " + material);
    }
}