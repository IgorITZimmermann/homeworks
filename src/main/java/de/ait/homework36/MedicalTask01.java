package de.ait.homework36;

import lombok.extern.slf4j.Slf4j;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Slf4j
public class MedicalTask01 {

    private static Scanner scanner = new Scanner(System.in);

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter VISIT_FORMATTER = DateTimeFormatter.ofPattern("dd MMMM yyyy");

    /**
     * Главный метод программы. Запрашивает у пользователя дату последнего визита,
     * вычисляет дату следующего визита и проверяет, не выпадает ли он на выходной день.
     *
     * The main method of the program. It asks the user for the last visit date,
     * calculates the next visit date, and checks if it falls on a weekend.
     */
    public static void main(String[] args) {
        System.out.print("Введите дату последнего визита (dd.MM.yyyy):");
        String lastVisitdate = scanner.nextLine();
        LocalDate lastVisitDateLocalDate = null;
        LocalDate nextVisitDateLocalDate = null;
        String formatedNextVisit = null;
        boolean weekend = false;
        try {
            // Преобразование введенной даты в объект LocalDate
            // Parsing the input date into a LocalDate object
            lastVisitDateLocalDate = LocalDate.parse(lastVisitdate, FORMATTER);

            // Определение даты следующего визита через 6 месяцев
            // Calculating the next visit date, which is 6 months later
            nextVisitDateLocalDate = lastVisitDateLocalDate.plusMonths(6);

            // Проверка, не попадает ли дата визита на выходные (суббота/воскресенье)
            // Checking if the visit date falls on a weekend (Saturday/Sunday)
            DayOfWeek dayOfWeek = nextVisitDateLocalDate.getDayOfWeek();
            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                weekend = true;
            }

            // Форматирование даты следующего визита для удобного вывода
            // Formatting the next visit date for a user-friendly output
            formatedNextVisit = nextVisitDateLocalDate.format(VISIT_FORMATTER);
        } catch (DateTimeException e) {
            // Обработка ошибки при некорректном вводе даты
            // Handling errors if the input date format is incorrect
            System.out.println("Ошибка в формате даты. Используйте формат dd.MM.yyyy");
            return;
        }

        // Вывод результата пользователю
        // Displaying the result to the user
        System.out.println("Следующий визит назначен на: " + formatedNextVisit);
        if (weekend) {
            System.out.println("Дата визита выпадает на выходной день! Рекомендуется выбрать другую дату.");
        }
    }
}
