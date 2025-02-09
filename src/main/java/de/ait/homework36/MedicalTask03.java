package de.ait.homework36;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Задание 3: Запись пациента на обследование с учётом часовых поясов.
 * Task 3: Scheduling a patient examination with time zone consideration.
 *
 * Программа принимает дату и время в часовом поясе врача (например, Europe/Berlin)
 * и переводит её в часовой пояс пациента (например, America/New_York).
 *
 * The program receives the date and time in the doctor's time zone (e.g., Europe/Berlin)
 * and converts it to the patient's time zone (e.g., America/New_York).
 */
public class MedicalTask03 {

    public static void main(String[] args) {

        // Создаём Scanner для чтения пользовательского ввода.
        // Create a Scanner to read user input.
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести дату и время консультации в формате dd.MM.yyyy HH:mm.
        // Ask the user to enter the consultation date and time in the format dd.MM.yyyy HH:mm.
        System.out.print("Введите дату и время консультации (dd.MM.yyyy HH:mm): ");
        String dateTimeInput = scanner.nextLine();

        // Просим ввести часовой пояс врача, например, Europe/Berlin.
        // Ask for the doctor's time zone, for example, Europe/Berlin.
        System.out.print("Введите часовой пояс врача (например, Europe/Berlin): ");
        String doctorZoneInput = scanner.nextLine();

        // Просим ввести часовой пояс пациента, например, America/New_York.
        // Ask for the patient's time zone, for example, America/New_York.
        System.out.print("Введите часовой пояс пациента (например, America/New_York): ");
        String patientZoneInput = scanner.nextLine();

        // Создаём форматтер для разбора входной строки с датой и временем.
        // Create a formatter to parse the input date-time string.
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        // Парсим введённую строку в объект LocalDateTime (локальное представление даты и времени).
        // Parse the input string into a LocalDateTime object (local date-time representation).
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeInput, inputFormatter);

        // Получаем объекты ZoneId для часовых поясов врача и пациента.
        // Get ZoneId objects for the doctor's and patient's time zones.
        ZoneId doctorZone = ZoneId.of(doctorZoneInput);
        ZoneId patientZone = ZoneId.of(patientZoneInput);

        // Создаём ZonedDateTime для времени врача, используя локальное время + часовой пояс врача.
        // Create a ZonedDateTime for the doctor's time using local date-time + doctor's time zone.
        ZonedDateTime doctorZonedDateTime = ZonedDateTime.of(localDateTime, doctorZone);

        // Преобразуем время в часовой пояс пациента без изменения момента времени.
        // Convert to the patient's time zone without changing the instant in time.
        ZonedDateTime patientZonedDateTime = doctorZonedDateTime.withZoneSameInstant(patientZone);

        // Создаём форматтер для вывода результата.
        // Create a formatter for output.
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");

        // Формируем строки для вывода, в которых указываем дату, время и часовой пояс.
        // Form the output strings showing date, time, and time zone.
        String doctorOutput = doctorZonedDateTime.format(outputFormatter);
        String patientOutput = patientZonedDateTime.format(outputFormatter);

        // Выводим результат в требуемом формате.
        // Print out the result in the required format.
        System.out.println("\nВремя консультации для врача: "
                + doctorOutput + " (" + doctorZone.getId() + ")");

        System.out.println("Время консультации для пациента: "
                + patientOutput + " (" + patientZone.getId() + ")");
    }
}