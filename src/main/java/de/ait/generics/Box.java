package de.ait.generics;

// Класс Box, использующий обобщения (generics) для хранения значения любого типа
// Box class using generics to store a value of any type
public class Box <T>{

    private T value; // Значение, хранящееся в коробке / Value stored in the box

    // Конструктор для инициализации значения в коробке
    // Constructor to initialize the value in the box
    public Box (T value){
        this.value = value;
    }

    // Геттер для получения значения из коробки
    // Getter to retrieve the value from the box
    public T getValue() {
        return value;
    }

    // Сеттер для установки значения в коробке
    // Setter to set the value in the box
    public void setValue(T value) {
        this.value = value;
    }
}