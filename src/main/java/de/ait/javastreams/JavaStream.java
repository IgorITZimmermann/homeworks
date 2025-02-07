package de.ait.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {

    // Исходный список автомобилей
    // Initial list of cars
    private static List<String> cars = List.of("Volvo", "BMW", "Ford", "Mazda", "Bentley", "Mercedes");

    /**
     * Главный метод программы. Демонстрирует работу Stream API в Java,
     * включая фильтрацию и преобразование списков.
     *
     * The main method of the program. It demonstrates the usage of Java Stream API,
     * including filtering and transforming lists.
     */
    public static void main(String[] args) {
        // Фильтрация списка: оставляем только марки, начинающиеся с "B"
        // Filtering the list: keeping only car brands starting with "B"
        List<String> result = cars.stream()
                .filter(carname -> carname.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(result);

        // Исходный массив автомобилей
        // Initial car array
        String[] carsArray = {"Volvo", "BMW", "Ford", "Mazda", "Bentley", "Mercedes"};

        // Фильтрация массива: оставляем только марки, начинающиеся с "B" и длиной в 3 символа
        // Filtering the array: keeping only brands starting with "B" and having a length of 3 characters
        List<String> resultArray = Arrays.stream(carsArray)
                .filter(carname -> carname.startsWith("B"))
                .filter(c -> c.length() == 3)
                .collect(Collectors.toList());
        System.out.println(resultArray);

        // Фильтрация массива: выбираем марки длиной 5 символов
        // Filtering the array: selecting brands with a length of 5 characters
        List<String> resultArrayLength = Arrays.stream(carsArray)
                .filter(carname -> carname.length() == 5)
                .collect(Collectors.toList());
        System.out.println(resultArrayLength);

        // Исходный список чисел
        // Initial list of integers
        List<Integer> integerList = List.of(1, 5, 8, 4, 12, 26, 23, 90, 67);

        // Фильтрация списка чисел: оставляем только чётные числа
        // Filtering the list of numbers: keeping only even numbers
        List<Integer> evenNumbers = integerList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
