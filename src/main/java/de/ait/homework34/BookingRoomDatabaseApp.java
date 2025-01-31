package de.ait.homework34;

import com.github.javafaker.Faker;
import de.ait.exceptions.NoGuestException;
import lombok.extern.slf4j.Slf4j;

/**
 * Класс BookingRoomDatabaseApp
 * Это приложение демонстрирует работу с базой данных бронирования номеров.
 * Здесь создается объект базы данных и выполняются операции бронирования и отмены номеров.
 *
 * BookingRoomDatabaseApp Class
 * This application demonstrates working with the booking room database.
 * It initializes a database object and performs operations like booking and canceling rooms.
 */
@Slf4j
public class BookingRoomDatabaseApp {
    public static void main(String[] args) {
        BookingRoomDatabase bookingRoomDatabase = new BookingRoomDatabase();
        Faker faker = new Faker();

        try {
            bookingRoomDatabase.addGuest(0, faker.name().lastName());
            bookingRoomDatabase.addGuest(1, faker.name().lastName());
            bookingRoomDatabase.addGuest(2, faker.name().lastName());
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException exception) {
            log.error(exception.getMessage());
            System.out.println(exception.getMessage());
        }

        try {
            bookingRoomDatabase.getGuest(0);
            bookingRoomDatabase.getGuest(3);
        } catch (NoGuestException exception) {
            log.error(exception.getMessage());
            System.out.println(exception.getMessage());
        }
    }
}
