package de.ait.generics;

import java.util.ArrayList;
import java.util.List;

// Класс ContainerListApp, реализующий интерфейс Container для работы со списком элементов
// ContainerListApp class implementing the Container interface to work with a list of elements
public class ContainerListApp<T>  implements Container<T>{

    private List<T> elements = new ArrayList<>(); // Список элементов / List of elements

    @Override
    public void add(T item) {
        elements.add(item); // Добавление элемента в список / Adding an item to the list
    }

    @Override
    public T get(int index) {
        return elements.get(index); // Получение элемента по индексу / Getting an item by index
    }

    // Статический метод для вывода элементов списка
    // Static method to print elements of the list
    public static <T> void printElements(List<T> list){
        for(T element: list){
            System.out.println(element);
        }
    }

    // Метод для получения всех элементов списка
    // Method to get all elements of the list
    public List<T> getElements() {
        return elements;
    }
}