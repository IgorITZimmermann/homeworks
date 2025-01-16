package de.ait.abstractclass;

import java.util.ArrayList;
import java.util.List;

/**
 * The Sportmanager class demonstrates the management of athletes.
 * It creates a list of athletes, displays their information, and initiates training for each athlete.
 *
 * Класс Sportmanager демонстрирует управление атлетами.
 * Он создаёт список атлетов, отображает их информацию и запускает тренировку для каждого атлета.
 */
public class Sportmanager {
    public static void main(String[] args) {
        // Create a list to store athletes
        // Создание списка для хранения атлетов
        List<Athlete> athleteList = new ArrayList<>();

        // Add athletes to the list
        // Добавление атлетов в список
        Athlete max = new Runner("Max", 3);
        athleteList.add(max);
        athleteList.add(new Swimmer("John", 2));
        athleteList.add(new Runner("Peter", 1));
        athleteList.add(new Swimmer("Paul", 4));

        // Iterate through the list, display athlete information, and initiate training
        // Итерация по списку, отображение информации и запуск тренировки
        for (Athlete athlete : athleteList) {
            athlete.showInfo();
            athlete.train();
            System.out.println("---------------------------");
        }
    }
}
