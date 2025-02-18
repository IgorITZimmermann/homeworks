package de.ait.homework39;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class WeatherApp {
    public static void main(String[] args) {
        List<Weather> coldWeatherList = getWeatherMinusZero();
        if (coldWeatherList.isEmpty()) {
            System.out.println("No cities have a temperature below zero.");
        } else {
            for (Weather weather : coldWeatherList) {
                System.out.println("The cities whose temperature drops below zero :" + weather.getCity() + " (" + weather.getTemperature() + "°C)");
            }
        }
        isWeatherMore25Grad();

        getCityMaxTemp();

        // 1
        double averageTemperature = getAverageTemperature();
        System.out.println("Average temperature: " + averageTemperature);

// 2
        Map<Boolean, List<String>> isRainy = groupByIsRainy();
        if (!isRainy.isEmpty()) {
            System.out.println("Group by rainy: " + isRainy);
        } else {
            System.out.println("No cities found.");
        }

// 3
        List<Weather> sortedWeather = sortByCityName();
        if (!sortedWeather.isEmpty()) {
            System.out.println("Sorted by city name: ");
            for (Weather weather : sortedWeather) {
                System.out.println(weather.getCity());
            }
        } else {
            System.out.println("No cities in list.");
        }
    }

    public static List<Weather> getWeatherMinusZero() {
        List<Weather> weatherMinusZero = WeatherTestData.getWeatherList().stream()
                .filter(t -> t.getTemperature() < 0)
                .collect(Collectors.toList());
        return weatherMinusZero;
    }

    public static void isWeatherMore25Grad() {
        int maxTemp = 25;
        boolean maxTemperatureResult = WeatherTestData.getWeatherList().stream()
                .anyMatch(w -> w.getTemperature() > maxTemp);
        if (!maxTemperatureResult) {
            System.out.println("Are there no cities with temperatures above 25°C");
        } else {
            List<Weather> hotWeatherList = WeatherTestData.getWeatherList().stream()
                    .filter(w -> w.getTemperature() > maxTemp)
                    .collect(Collectors.toList());
            for (Weather weather : hotWeatherList) {
                System.out.println("Are there any cities with temperatures above 25°C? *" + maxTemperatureResult + "*: It's the  city :" + weather.getCity());
            }
        }
    }

    public static void getCityMaxTemp() {
        Optional<Weather> maxTemperatureCity = WeatherTestData.getWeatherList().stream()
                .max(Comparator.comparingDouble(Weather::getTemperature));
        double weatherMax = maxTemperatureCity.get().getTemperature();

        List<Weather> list = WeatherTestData.getWeatherList().stream()
                .filter(t -> t.getTemperature() == weatherMax).collect(Collectors.toList());

        for (Weather weather : list) {
            System.out.println("The city  with maximum temperature : " + weather.getCity() + "+" +
                    weather.getTemperature() + "°C");
        }
    }

    // Подсчёт средней температуры с помощью mapToDouble и average().
    public static double getAverageTemperature() {
        return WeatherTestData.getWeatherList().stream()
                .mapToDouble(Weather::getTemperature)
                .average()
                .orElse(0);
    }

    // Группировка по признаку isRainy (true/false) с помощью Collectors.groupingBy(...)
    public static Map<Boolean, List<String>> groupByIsRainy() {
        return WeatherTestData.getWeatherList().stream()
                .collect(Collectors.groupingBy(
                        Weather::isRainy, Collectors.mapping(Weather::getCity, Collectors.toList())));
    }

    // Сортировка данных по названию города с помощью Comparator.comparing(Weather::getCity)
    public static List<Weather> sortByCityName() {
        return WeatherTestData.getWeatherList().stream()
                .sorted(Comparator.comparing(Weather::getCity))
                .collect(Collectors.toList());
    }

}
