package de.ait.javastreams;

/**
 * Класс, представляющий город.
 * Содержит информацию о названии города, стране, населении и является ли город прибрежным.
 *
 * Class representing a city.
 * Contains information about the city name, country, population, and whether the city is coastal.
 */
public class City {
    private String name;        // Название города / City name
    private String country;     // Страна / Country
    private int population;     // Население / Population
    private boolean isCoastal;  // Является ли город прибрежным / Whether the city is coastal

    /**
     * Конструктор для создания объекта City.
     *
     * @param name название города
     * @param country страна
     * @param population население
     * @param isCoastal является ли город прибрежным
     *
     * Constructor for creating a City object.
     *
     * @param name the city name
     * @param country the country
     * @param population the population
     * @param isCoastal whether the city is coastal
     */
    public City(String name, String country, int population, boolean isCoastal) {
        this.name = name;
        this.country = country;
        this.population = population;
        this.isCoastal = isCoastal;
    }

    // Геттеры для всех полей / Getters for all fields

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public boolean isCoastal() {
        return isCoastal;
    }

    /**
     * Переопределение метода toString для удобного вывода информации о городе.
     *
     * @return строковое представление объекта City
     *
     * Overriding the toString method for convenient output of city information.
     *
     * @return a string representation of the City object
     */
    @Override
    public String toString() {
        return String.format(
                "City{name='%s', country='%s', population=%d, isCoastal=%b}",
                name, country, population, isCoastal
        );
    }
}