package de.ait.homework39;

import java.util.Arrays;
import java.util.List;

public class WeatherTestData {
    public static List<Weather> getWeatherList() {
        return Arrays.asList(
                new Weather("New York", 10.5, false),
                new Weather("London", 30.5, true),
                new Weather("Los Angeles", 18.2, false),
                new Weather("Chicago", -2.0, true),
                new Weather("Houston", 25.0, false),
                new Weather("Miami", 30.5, true),
                new Weather("Paris", 12.0, false),
                new Weather("Berlin", 3.0, true),
                new Weather("Sydney", 22.3, false),
                new Weather("Tokyo", 15.6, true)
        );
    }
}
