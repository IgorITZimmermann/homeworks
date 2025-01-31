package de.ait.homework34;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

/**
 * Класс SimpleBookingApp
 * Это приложение демонстрирует базовую функциональность бронирования номеров.
 *
 * SimpleBookingApp Class
 * This application demonstrates basic room booking functionality.
 */
@Slf4j
public class SimpleBookingApp {
    public static void main(String[] args) {
        SimpleBooking simpleBooking = new SimpleBooking();
        Faker faker = new Faker();

        try {
            simpleBooking.bookRoom(1, faker.name().lastName());
            simpleBooking.bookRoom(0, faker.name().lastName());
            simpleBooking.bookRoom(2, "");
        }
        catch (IllegalArgumentException exception){
            log.error("Guest name is empty or null or wrong room number");
            System.out.println("Guest name is empty or null or wrong room number");
        }
    }
}
