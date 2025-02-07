package de.ait.homework36;

import lombok.extern.slf4j.Slf4j;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Slf4j
public class MedicalTask05 {

    private static Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /**
     * Главный метод программы. Запрашивает у пользователя дату производства товара
     * и срок хранения в месяцах, затем вычисляет дату окончания срока хранения.
     *
     * The main method of the program. It asks the user for the product's manufacturing date
     * and the shelf life in months, then calculates the expiration date.
     */
    public static void main(String[] args) {
        System.out.print("Введите дату производства (dd.MM.yyyy): ");
        try {
            String dateOfProduction = scanner.nextLine();
            LocalDate dateOfProductionLocalDate = LocalDate.parse(dateOfProduction, FORMATTER);

            System.out.print("Введите срок хранения в месяцах: ");
            int shelfLifeMonths = scanner.nextInt();
            if (shelfLifeMonths < 1) {
                throw new IllegalArgumentException("Срок хранения не может быть меньше 1 месяца: " + shelfLifeMonths);
            }
            scanner.nextLine();

            // Вычисление даты окончания срока хранения
            // Calculating the expiration date
            LocalDate expirationDate = dateOfProductionLocalDate.plusMonths(shelfLifeMonths);

            // Вывод результатов
            // Displaying the results
            System.out.println("Дата окончания срока хранения: " + expirationDate.format(FORMATTER));
            if (expirationDate.isBefore(LocalDate.now())) {
                System.out.println("Внимание! Срок хранения уже истек.");
            }
        } catch (DateTimeException e) {
            System.out.println("Ошибка в формате даты. Используйте формат dd.MM.yyyy");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}