package de.ait.generics;

// Интерфейс Container, определяющий методы для работы с контейнером
// Container interface defining methods for working with a container
public interface Container<T> {
    void add(T item); // Метод для добавления элемента в контейнер / Method to add an item to the container
    T get(int index); // Метод для получения элемента из контейнера по индексу / Method to get an item from the container by index
}