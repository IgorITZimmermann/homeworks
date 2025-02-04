/*
 * Класс NewDateTimeAPI демонстрирует использование нового API даты и времени Java.
 * Он включает методы для работы с LocalDateTime, ZonedDateTime и ChronoUnit.
 *
 * The NewDateTimeAPI class demonstrates the usage of Java's new date and time API.
 * It includes methods for working with LocalDateTime, ZonedDateTime, and ChronoUnit.
 */

package de.ait.timeapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NewDateTimeAPI {
    public static void main(String[] args) {
        // Получение текущей даты / Getting the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата / Current date: " + currentDate);

        // Создание конкретной даты / Creating a specific date
        LocalDate manuelDate = LocalDate.of(2020, 12, 4);
        System.out.println("Указанная дата / Manual date: " + manuelDate);

        // Получение года, месяца и дня / Extracting year, month, and day
        int year = manuelDate.getYear();
        int month = manuelDate.getMonthValue();
        int day = manuelDate.getDayOfMonth();
        System.out.println("Год / Year: " + year);
        System.out.println("Месяц / Month: " + month);
        System.out.println("День / Day: " + day);

        // Манипуляция датами / Manipulating dates
        manuelDate = manuelDate.plusDays(10); // Добавление 10 дней / Adding 10 days
        System.out.println("Дата после 10 дней / Date after 10 days: " + manuelDate);
        manuelDate = manuelDate.plusMonths(2); // Добавление 2 месяцев / Adding 2 months
        System.out.println("Дата после 2 месяцев / Date after 2 months: " + manuelDate);
        manuelDate = manuelDate.minusDays(100); // Вычитание 100 дней / Subtracting 100 days
        System.out.println("Дата после вычитания 100 дней / Date after subtracting 100 days: " + manuelDate);

        // Работа с временем / Working with time
        LocalTime localTime = LocalTime.now();
        System.out.println("Текущее время / Local time: " + localTime);

        LocalTime manuelTime = LocalTime.of(22, 0, 10);
        System.out.println("Указанное время / Manual time: " + manuelTime);
        manuelTime = manuelTime.plusHours(1);
        System.out.println("Время через час / Time after 1 hour: " + manuelTime);

        // Работа с датой и временем / Working with date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущая дата и время / Current date time: " + currentDateTime);

        LocalDateTime manuelDateTime = LocalDateTime.of(2020, 1, 12, 14, 0);
        System.out.println("Указанная дата и время / Manual date time: " + manuelDateTime);
        manuelDateTime = manuelDateTime.plusHours(1);
        System.out.println("Дата и время через час / Date time after 1 hour: " + manuelDateTime);

        // Работа с часовыми поясами / Working with time zones
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Текущая дата и время с часовым поясом / Zoned date time: " + zonedDateTime);

        ZonedDateTime zoneIdZonedDateTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Дата и время в Лос-Анджелесе / Date time in Los Angeles: " + zoneIdZonedDateTime);

        // Работа с мгновенным временем / Working with instant time
        Instant instant = Instant.now();
        System.out.println("Мгновенное время / Instant: " + instant);

        // Форматирование даты и времени / Formatting date and time
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_DATE_TIME;
        String localDateTimeString = currentDateTime.format(isoFormatter);
        System.out.println("Дата в ISO-формате / Date in ISO format: " + localDateTimeString);

        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(customFormatter);
        System.out.println("Форматированная дата / Formatted date: " + formattedDateTime);

        // Разбор пользовательского ввода / Parsing user input
        String inputUser = "04.02.2010";
        DateTimeFormatter formatterUser = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDateUser = LocalDate.parse(inputUser, formatterUser);

        if (LocalDate.now().getYear() - localDateUser.getYear() < 18) {
            System.out.println("Вы слишком молоды! / You are too young!");
        } else {
            System.out.println("ОК / OK");
        }

        // Работа с периодами и продолжительностью / Working with periods and durations
        LocalDate startDate = LocalDate.of(2024, 9, 9);
        LocalDate endDate = LocalDate.of(2024, 10, 19);

        Period period = Period.between(startDate, endDate);
        System.out.println("Период в месяцах / Period in months: " + period.getMonths());
        System.out.println("Период в днях / Period in days: " + period.getDays());
        System.out.println("Период в годах / Period in years: " + period.getYears());

        Duration duration = Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay());
        System.out.println("Продолжительность в днях / Duration in days: " + duration.toDays());
        System.out.println("Продолжительность в часах / Duration in hours: " + duration.toHours());
        System.out.println("Продолжительность в минутах / Duration in minutes: " + duration.toMinutes());
        System.out.println("Продолжительность в миллисекундах / Duration in milliseconds: " + duration.toMillis());
    }
}
