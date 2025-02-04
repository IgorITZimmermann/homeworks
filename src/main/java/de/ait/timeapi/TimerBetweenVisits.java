/*
 * Этот класс предназначен для работы с медицинским расписанием и временем.
 * Он использует API даты и времени Java для планирования и управления медицинскими событиями.
 *
 * This class is designed for working with medical scheduling and time management.
 * It uses Java's date and time API to schedule and manage medical events.
 */

package de.ait.timeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimerBetweenVisits {
    public static void main(String[] args) {

        LocalDateTime firstVisit = LocalDateTime.of(2025,1,15,9,00);
        LocalDateTime secondVisit = LocalDateTime.of(2025,2,4,10,00);

        Duration duration = Duration.between(firstVisit, secondVisit);
        System.out.println("Days between visits " + duration.toDays());
        System.out.println("Hours between visits " + duration.toHours());
    }
}
