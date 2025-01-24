package de.ait.enums;

// This file contains the main application logic for simulating a streetlight system.
// Этот файл содержит основную логику приложения для моделирования системы уличного освещения.

public class StreetLightApp {
    public static void main(String[] args) {
        // Example usage of the Light enumeration
        // Пример использования перечисления Light
        for (Light light : Light.values()) {
            System.out.println("Traffic Light: " + light);
        }
    }
}
