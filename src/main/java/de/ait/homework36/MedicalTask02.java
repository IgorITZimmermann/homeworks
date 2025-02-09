package de.ait.homework36;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Slf4j
public class MedicalTask02 {

    public static void main(String[] args) {

        // Создаём сканер для чтения данных с консоли.
        // Create a scanner to read data from the console.
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя дату и время операции в формате dd.MM.yyyy HH:mm.
        // Requesting the user to enter the surgery date and time in the format dd.MM.yyyy HH:mm.
        System.out.print("Введите дату и время операции (dd.MM.yyyy HH:mm): ");
        String input = scanner.nextLine();

        // Создаём объект формата даты и времени по заданной маске.
        // Creating a date-time formatter object with the specified pattern.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        // Парсим введённую пользователем строку в объект LocalDateTime.
        // Parsing the user input string into a LocalDateTime object.
        LocalDateTime surgeryDateTime = LocalDateTime.parse(input, formatter);

        // Получаем текущее локальное время.
        // Getting the current local date and time.
        LocalDateTime now = LocalDateTime.now();

        // Проверяем, что указанная дата операции не в прошлом.
        // Checking that the specified surgery date is not in the past.
        if (surgeryDateTime.isBefore(now)) {
            System.out.println("Указанное время операции уже прошло.");
            return;
        }

        // Вычисляем разницу во времени между текущим моментом и временем операции.
        // Calculating the time difference between the current moment and the surgery time.
        Duration duration = Duration.between(now, surgeryDateTime);

        // Получаем общее количество минут между двумя датами.
        // Getting the total number of minutes between the two dates.
        long totalMinutes = duration.toMinutes();

        // Из общего количества минут вычисляем количество целых дней, часов и оставшихся минут.
        // From the total number of minutes, we calculate the number of full days, hours, and remaining minutes.
        long days = totalMinutes / (60 * 24);
        long hours = (totalMinutes % (60 * 24)) / 60;
        long minutes = totalMinutes % 60;

        // Выводим результат в удобочитаемом формате.
        // Displaying the result in a readable format.
        System.out.println("До операции осталось: "
                + days + " дней, "
                + hours + " часов, "
                + minutes + " минут.");
    }
}
