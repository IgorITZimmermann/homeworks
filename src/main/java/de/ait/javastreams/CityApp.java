package de.ait.javastreams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Класс для работы с данными о городах.
 * Содержит методы для фильтрации, сортировки и анализа списка городов.
 *
 * Class for working with city data.
 * Contains methods for filtering, sorting, and analyzing a list of cities.
 */
public class CityApp {

    private static CityTestData data = new CityTestData();

    public static void main(String[] args) {
        // Примеры использования методов / Examples of using methods
        System.out.println(countCitiesWithPopulationOver5Million());

        List<City> result = getCitiesSortedNames();
        for (City city : result) {
            System.out.println(city.getName());
        }
    }

    /**
     * Метод для получения списка всех прибрежных городов.
     *
     * @return список прибрежных городов
     *
     * Method to get a list of all coastal cities.
     *
     * @return a list of coastal cities
     */
    public static List<City> allCoastalCities() {
        List<City> coastalCities = data.getCities().stream()
                .filter(City::isCoastal)
                .collect(Collectors.toList());
        return coastalCities;
    }

    /**
     * Метод для получения списка названий всех городов в верхнем регистре.
     *
     * @return список городов с названиями в верхнем регистре
     *
     * Method to get a list of city names in uppercase.
     *
     * @return a list of cities with names in uppercase
     */
    public static List<City> getCitiesUpperCase() {
        return data.getCities().stream()
                .map(city -> new City(city.getName().toUpperCase(),
                        city.getCountry(), city.getPopulation(), city.isCoastal()))
                .collect(Collectors.toList());
    }

    /**
     * Метод для получения списка городов, отсортированных по возрастанию численности населения.
     *
     * @return список городов, отсортированных по населению
     *
     * Method to get a list of cities sorted by population in ascending order.
     *
     * @return a list of cities sorted by population
     */
    public static List<City> getCitiesSortedPopulation() {
        return data.getCities().stream()
                .sorted(Comparator.comparingInt(City::getPopulation))
                .collect(Collectors.toList());
    }

    /**
     * Метод для получения списка городов, отсортированных по названию.
     *
     * @return список городов, отсортированных по названию
     *
     * Method to get a list of cities sorted by name.
     *
     * @return a list of cities sorted by name
     */
    public static List<City> getCitiesSortedNames() {
        return data.getCities().stream()
                .sorted(Comparator.comparing(City::getName))
                .collect(Collectors.toList());
    }

    /**
     * Метод для подсчета количества городов с населением более 5 миллионов.
     *
     * @return количество городов с населением более 5 миллионов
     *
     * Method to count the number of cities with a population over 5 million.
     *
     * @return the number of cities with a population over 5 million
     */
    public static long countCitiesWithPopulationOver5Million() {
        return data.getCities().stream()
                .filter(city -> city.getPopulation() > 5_000_000)
                .count();
    }

    /**
     * Метод для поиска города с минимальным населением.
     *
     * @return Optional, содержащий город с минимальным населением
     *
     * Method to find the city with the minimum population.
     *
     * @return an Optional containing the city with the minimum population
     */
    public Optional<City> getCityWithMinPopulation(){
        return data.getCities().stream()
                .min(Comparator.comparingInt(City::getPopulation));
    }
}