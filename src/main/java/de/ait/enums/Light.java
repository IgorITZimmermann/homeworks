package de.ait.enums;

// Перечисление "Свет" для светофора с разными цветами и продолжительностью их горения
// Enumeration "Light" for a traffic light with different colors and their durations
public enum Light {

    RED(30),    // Красный свет горит 30 секунд // Red light lasts for 30 seconds
    YELLOW(10), // Желтый свет горит 10 секунд // Yellow light lasts for 10 seconds
    GREEN(45);  // Зеленый свет горит 45 секунд // Green light lasts for 45 seconds

    // Поле для хранения продолжительности горения цвета (в секундах)
    // Field to store the duration of the light (in seconds)
    private int duration;

    // Конструктор для задания продолжительности горения для каждого цвета
    // Constructor to set the duration of each light color
    Light(int duration) {
        this.duration = duration;
    }

    // Метод для получения продолжительности горения цвета
    // Method to get the duration of the light color
    public int getDuration() {
        return duration;
    }
}