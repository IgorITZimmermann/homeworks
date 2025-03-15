package de.ait.homework46;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class JavaTimeTasks {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        task10();
    }

    public static void task1() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();  // Получаем текущую дату и время

        System.out.println("Текущая дата: " + currentDate);
        System.out.println("Текущее время: " + currentTime);
        System.out.println("Текущая дата и время: " + currentDateTime);
    }

    public static void task2() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Current Date and Time: " + currentDateTime.format(formatter));
    }

    public static void task3() {
        System.out.println("Введите строку");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(input, formatter);
        System.out.println("Результат: " + localDateTime);
        scanner.close();
    }

    public static void task4() {
        ZonedDateTime zonedDateTimeGermany = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeAmerica = zonedDateTimeGermany.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("ZonedDateTime Germany: " + zonedDateTimeGermany);
        System.out.println("ZonedDateTime America: " + zonedDateTimeAmerica);
    }

    public static void task5() {
        LocalDate birthDate = LocalDate.of(2000, 01, 01);
        LocalDate localDateNow = LocalDate.now();

        Period period = Period.between(birthDate, localDateNow);

        int years = period.getYears();
        int month = period.getMonths();
        int days = period.getDays();

        System.out.println("I was born in " + years + " years, " + month + " months and " + days + " days");

    }

    public static void task6() {
        LocalTime startLocalTime = LocalTime.of(9, 10);
        LocalTime endLocalTime = LocalTime.of(18, 0);

        Duration duration = Duration.between(startLocalTime, endLocalTime);

        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;

        System.out.println("Duration: " + hours + " hours, " + minutes + " minutes");
    }

    public static void task7() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        localDateTime = localDateTime.plusWeeks(2).minusDays(3).plusHours(5);
        System.out.println(localDateTime);
    }

    public static void task8() {
        Date date = new Date();
        System.out.println(date);
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localDateTime);
    }

    public static void task9() {
        Instant instant = Instant.now();
        long epochMillis = instant.toEpochMilli();
        System.out.println(epochMillis);
        long epochSeconds = instant.getEpochSecond();
        System.out.println(epochSeconds);

        LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localTime);
    }

    public static void task10() {
        LocalDateTime localTime = LocalDateTime.now().plusMinutes(1);
        System.out.println(localTime);
        while (true) {
            LocalDateTime currentDateTime = LocalDateTime.now();
            if (currentDateTime.isBefore(localTime)) {
                System.out.println("Not now");
            } else {
                System.out.println("Now");
                break;
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }

}
