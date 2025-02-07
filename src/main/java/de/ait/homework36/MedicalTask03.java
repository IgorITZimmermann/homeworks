package de.ait.homework36;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

@Slf4j
public class MedicalTask03 {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Главный метод программы. Запрашивает у пользователя дату следующего визита,
     * вычисляет оставшееся количество дней до визита и предупреждает, если визит уже просрочен.
     *
     * The main method of the program. It asks the user for their next visit date,
     * calculates the remaining days until the visit, and warns if the visit is overdue.
     */
    public static void main(String[] args) {
        System.out.print("Введите дату следующего визита (yyyy-MM-dd): ");
        String nextVisitDateString = scanner.nextLine();
        LocalDate nextVisitDate = null;
        long daysUntilVisit = 0;
        try {
            // Преобразование введенной строки в объект LocalDate
            // Parsing the input string into a LocalDate object
            nextVisitDate = LocalDate.parse(nextVisitDateString);

            // Вычисление оставшегося количества дней до визита
            // Calculating the remaining days until the visit
            daysUntilVisit = ChronoUnit.DAYS.between(LocalDate.now(), nextVisitDate);
        } catch (Exception e) {
            // Обработка ошибки при некорректном вводе даты
            // Handling errors if the input date format is incorrect
            System.out.println("Ошибка формата даты. Используйте формат yyyy-MM-dd");
            return;
        }

        // Вывод оставшихся дней до визита и проверка просроченности
        // Displaying the remaining days and checking for overdue visits
        if (daysUntilVisit < 0) {
            System.out.println("Ваш визит уже просрочен на " + Math.abs(daysUntilVisit) + " дней!");
        } else {
            System.out.println("До следующего визита осталось: " + daysUntilVisit + " дней.");
        }
    }
}
