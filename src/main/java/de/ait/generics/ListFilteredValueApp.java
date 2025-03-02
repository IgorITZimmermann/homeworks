package de.ait.generics;

import java.util.Arrays;
import java.util.List;

// Основной класс приложения для демонстрации работы с фильтрацией списка
// Main application class to demonstrate the use of list filtering
public class ListFilteredValueApp {
    public static void main(String[] args) {
        // Создание списка целых чисел
        // Creating a list of integers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> stringsList = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        ListFilteredValue listFilteredValue = new ListFilteredValue();
        // Фильтрация списка и вывод результата
        // Filtering the list and printing the result
        List<Double> result = listFilteredValue.getFilteredList(integerList,4.0);
        System.out.println(result);
    }
}