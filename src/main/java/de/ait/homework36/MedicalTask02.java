package de.ait.homework36;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Slf4j
public class MedicalTask02 {

    private static Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /**
     * Главный метод программы. Запрашивает у пользователя дату рождения,
     * вычисляет возраст и определяет, попадает ли он в допустимый диапазон.
     *
     * The main method of the program. It asks the user for their birth date,
     * calculates their age, and determines whether it falls within an acceptable range.
     */
    public static void main(String[] args) {
        System.out.print("Введите дату рождения (dd.MM.yyyy): ");
        String birthDateString = scanner.nextLine();
        LocalDate birthDate = null;
        int age = 0;
        try {
            // Преобразование введенной строки в объект LocalDate
            // Parsing the input string into a LocalDate object
            birthDate = LocalDate.parse(birthDateString, FORMATTER);

            // Вычисление возраста на основе текущей даты
            // Calculating the age based on the current date
            age = LocalDate.now().getYear() - birthDate.getYear();

            // Проверка, не был ли день рождения в этом году ещё впереди
            // Checking if the birthday has not yet occurred this year
            if (LocalDate.now().getDayOfYear() < birthDate.getDayOfYear()) {
                age--;
            }
        } catch (Exception e) {
            // Обработка ошибки при некорректном вводе даты
            // Handling errors if the input date format is incorrect
            System.out.println("Ошибка формата даты. Используйте формат dd.MM.yyyy");
            return;
        }

        // Вывод возраста и проверка на соответствие допустимому возрастному диапазону
        // Displaying the age and checking whether it falls within an acceptable range
        System.out.println("Ваш возраст: " + age + " лет.");
        if (age < 18) {
            System.out.println("Вы слишком молоды для медицинского осмотра.");
        } else if (age > 65) {
            System.out.println("Рекомендуется дополнительная проверка здоровья.");
        } else {
            System.out.println("Ваш возраст подходит для стандартного осмотра.");
        }
    }
}
