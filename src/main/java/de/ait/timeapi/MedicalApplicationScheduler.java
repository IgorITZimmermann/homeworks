/*
 * Класс MedicalApplicationScheduler используется для управления расписанием медицинских приёмов.
 * Он включает в себя методы для вычисления времени приёма лекарств и планирования медицинских встреч.
 *
 * The MedicalApplicationScheduler class is used for managing medical appointment schedules.
 * It includes methods for calculating medication intake times and scheduling medical appointments.
 */

package de.ait.timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Упражнение 1: Вычисление времени приёма лекарства

Задача
У пациента есть расписание приёма лекарства каждые 8 часов.
Дано время первого приёма (например, LocalDateTime startTime),
нужно вывести время всех приёмов (количество приёмов, допустим, 5) в понятном текстовом формате.
 */
public class MedicalApplicationScheduler {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.now();

        int count = 5;

        int intervalHours = 8;

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("First time --> " + dateTimeFormatter.format(startTime));

        for (int i = 2; i < count + 1; i++) {
            LocalDateTime nextTime = startTime.plusHours(intervalHours);
            System.out.println(i + " --> " + dateTimeFormatter.format(nextTime));
            startTime = nextTime;
        }


    }
}
