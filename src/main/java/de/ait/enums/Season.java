package de.ait.enums;

// Перечисление "Сезон" для представления времён года с их температурными характеристиками
// Enumeration "Season" representing seasons with their temperature characteristics
public enum Season {

    WINTER(-10, -25, 5),  // Зима: средняя температура -10°C, минимальная -25°C, максимальная 5°C
    // Winter: average temperature -10°C, minimum -25°C, maximum 5°C
    SPRING(0, 15, 25),    // Весна: средняя температура 0°C, минимальная 15°C, максимальная 25°C
    // Spring: average temperature 0°C, minimum 15°C, maximum 25°C
    SUMMER(10, 20, 30),   // Лето: средняя температура 10°C, минимальная 20°C, максимальная 30°C
    // Summer: average temperature 10°C, minimum 20°C, maximum 30°C
    FALL(20, 30, 40);     // Осень: средняя температура 20°C, минимальная 30°C, максимальная 40°C
    // Fall: average temperature 20°C, minimum 30°C, maximum 40°C

    // Поле для хранения средней температуры сезона
    // Field to store the average temperature of the season
    private int averageTemperature;

    // Поле для хранения минимальной температуры сезона
    // Field to store the minimum temperature of the season
    private int min;

    // Поле для хранения максимальной температуры сезона
    // Field to store the maximum temperature of the season
    private int max;

    // Конструктор для инициализации температурных характеристик сезона
    // Constructor to initialize the temperature characteristics of the season
    Season(int averageTemperature, int min, int max) {
        this.averageTemperature = averageTemperature;
        this.min = min;
        this.max = max;
    }

    // Метод для получения средней температуры сезона
    // Method to get the average temperature of the season
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // Метод для получения минимальной температуры сезона
    // Method to get the minimum temperature of the season
    public int getMin() {
        return min;
    }

    // Метод для получения максимальной температуры сезона
    // Method to get the maximum temperature of the season
    public int getMax() {
        return max;
    }
}