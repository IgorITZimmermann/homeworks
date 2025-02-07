package de.ait.homework36;

import lombok.extern.slf4j.Slf4j;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Slf4j
public class MedicalTask04 {
    private static Scanner scanner = new Scanner(System.in);

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /**
     * Главный метод программы. Запрашивает у пользователя дату рождения,
     * вычисляет возраст в годах, месяцах и днях, а затем выводит результат.
     *
     * The main method of the program. It asks the user for their birth date,
     * calculates their age in years, months, and days, and then displays the result.
     */
    public static void main(String[] args) {
        System.out.print("Введите дату рождения в формате dd.MM.yyyy: ");
        try {
            String birthDate = scanner.nextLine();
            LocalDate birthDateLocalDate = LocalDate.parse(birthDate, FORMATTER);
            LocalDate current = LocalDate.now();

            // Вычисление возраста в годах, месяцах и днях
            // Calculating age in years, months, and days
            Period period = Period.between(birthDateLocalDate, current);
            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();

            // Вывод возраста
            // Displaying the calculated age
            System.out.println("Возраст пациента: " + years + " лет, " + months + " месяцев, " + days + " дней.");
        } catch (DateTimeException e) {
            System.out.println("Ошибка в формате даты. Используйте формат dd.MM.yyyy");
        }
    }
}
