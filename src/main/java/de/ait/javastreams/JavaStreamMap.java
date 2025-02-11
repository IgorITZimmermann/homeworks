package de.ait.javastreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamMap {

    // Список марок автомобилей
    // List of car brands
    private static List<String> cars = List.of("Volvo", "BMW", "Ford", "Mazda", "Bentley", "Mercedes");

    // Список фраз
    // List of phrases
    private static List<String> phrases = List.of("Hello java", "Goodbye and love you", "Thank you mach", "See you later");

    public static void main(String[] args) {
        // Используем Stream API для получения длин названий автомобилей, сортируем их и собираем в список
        // Using Stream API to get the lengths of car names, sort them, and collect them into a list
        List<Integer> carsNameLengths = cars.stream()
                .map(String::length) // Преобразуем каждое название в его длину
                .sorted() // Сортируем длины по возрастанию
                .collect(Collectors.toList()); // Собираем результаты в список
        System.out.println("carsNameLengths: " + carsNameLengths);

        // Используем Stream API для разбиения фраз на отдельные слова и собираем их в один список
        // Using Stream API to split phrases into individual words and collect them into a single list
        List<String> words = phrases.stream()
                .flatMap(phrases -> Arrays.stream(phrases.split(" "))) // Разбиваем каждую фразу на слова
                .collect(Collectors.toList()); // Собираем все слова в один список
        System.out.println("Words from phrases: " + words);

        // Создаем список списков чисел
        // Create a list of lists of integers
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // Используем Stream API для "выравнивания" списка списков в один список
        // Using Stream API to flatten the list of lists into a single list
        List<Integer> listsResult = lists.stream()
                .flatMap(Collection::stream) // Преобразуем каждый внутренний список в поток и объединяем их
                .collect(Collectors.toList()); // Собираем все элементы в один список
        System.out.println("Flattened list: " + listsResult);

        // Используем Stream API для подсчета количества элементов в "выравненном" списке
        // Using Stream API to count the number of elements in the flattened list
        long listsResultCount = lists.stream()
                .flatMap(Collection::stream) // Преобразуем каждый внутренний список в поток и объединяем их
                .count(); // Подсчитываем количество элементов
        System.out.println("Total count of elements: " + listsResultCount);

        // Проверяем, есть ли в списке списков хотя бы одно четное число
        // Check if there is at least one even number in the list of lists
        boolean hasEven = lists.stream()
                .anyMatch(list -> list.stream().anyMatch(i -> i % 2 == 0)); // Проверяем каждый внутренний список на наличие четных чисел
        System.out.println("Has even number: " + hasEven);

        // Используем Stream API для фильтрации, преобразования и ограничения списка автомобилей
        // Using Stream API to filter, transform, and limit the list of cars
        List<String> carsResult = cars.stream()
                .filter(cars -> {
                    System.out.println("Filtering: " + cars); // Логируем процесс фильтрации
                    return cars.length() > 5; // Фильтруем автомобили, длина названия которых больше 5 символов
                })
                .map(cars1 -> {
                    System.out.println("Mapping: " + cars1); // Логируем процесс преобразования
                    return cars1.toUpperCase(); // Преобразуем названия автомобилей в верхний регистр
                })
                .distinct() // Убираем дубликаты (в данном случае они отсутствуют)
                .limit(1) // Ограничиваем результат одним элементом
                .collect(Collectors.toList()); // Собираем результаты в список
        System.out.println("Filtered and mapped cars: " + carsResult);
    }
}