package de.ait.homework37;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeoApi {

    // Список стран
    // List of countries
    private static List<String> countries = Arrays.asList("Germany", "France", "Brazil", "Argentina", "Canada", "China", "Australia", "India");

    // Список городов
    // List of cities
    private  static List<String> cities = Arrays.asList("Berlin", "Buenos Aires", "Paris", "Los Angeles", "New York", "London", "Beijing");

    // Список рек
    // List of rivers
    private static List<String> rivers = Arrays.asList("Amazon", "Nile", "Yangtze", "Mississippi", "Danube", "Main", "Ganges");

    // Список континентов
    // List of continents
    private static List<String> continents = Arrays.asList("Europe", "Asia", "Africa", "Australia", "Antarctica", "South America", "North America");


    public static void main(String[] args) {
        // Используя Stream API, отфильтруйте страны, названия которых начинаются на букву "C".
        // Using Stream API, filter countries whose names start with the letter "C".
        List<String> countriesWithCResult = countries.stream().filter(c -> c.startsWith("C")).collect(Collectors.toList());
        System.out.println("страны, названия которых начинаются на букву \"C\".");
        System.out.println(countriesWithCResult);
        System.out.println("---------------------------");

        // Используя Stream API, отфильтруйте города, название которых длиннее 6 символов.
        // Using Stream API, filter cities whose names are longer than 6 characters.
        List<String> citesNameResult = cities.stream().filter(c -> c.length() > 6).collect(Collectors.toList());
        System.out.println("города, название которых длиннее 6 символов");
        System.out.println(citesNameResult);
        System.out.println("---------------------------");

        // Используя Stream API, отфильтруйте только те реки, у которых чётное количество букв в названии.
        // Using Stream API, filter only those rivers whose names have an even number of letters.
        List<String> riversResult = rivers.stream().filter(r -> r.length() % 2 == 0).collect(Collectors.toList());
        System.out.println("реки, у которых чётное количество букв в названии.");
        System.out.println(riversResult);
        System.out.println("---------------------------");

        // Используя Stream API, отфильтруйте континенты, у которых название короче 7 символов.
        // Using Stream API, filter continents whose names are shorter than 7 characters.
        List<String> continentsResult = continents.stream().filter(c -> c.length() < 7).collect(Collectors.toList());
        System.out.println("континенты, у которых название короче 7 символов.");
        System.out.println(continentsResult);
        System.out.println("---------------------------");
    }
}