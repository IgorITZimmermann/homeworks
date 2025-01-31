package de.ait.homework34;

import com.github.javafaker.Faker;
import de.ait.exceptions.NoActiveReservationException;
import de.ait.exceptions.RoomUnavailableException;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Класс HotelReservationSystemApp
 * Это приложение демонстрирует работу с системой бронирования номеров.
 * Здесь выполняются операции бронирования и отмены номеров.
 *
 * HotelReservationSystemApp Class
 * This application demonstrates working with the hotel reservation system.
 * It performs booking and cancellation operations.
 */
@Slf4j
public class HotelReservationSystemApp {
    public static void main(String[] args) {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Faker faker = new Faker();

        try {
            hotelReservationSystem.reserveRoom(101, faker.name().lastName());
            hotelReservationSystem.reserveRoom(102, faker.name().lastName());
        } catch (RoomUnavailableException exception) {
            log.error(Arrays.toString(exception.getStackTrace()));
            System.out.println(exception.getMessage());
        }

        try {
            hotelReservationSystem.cancelReservation(103);
            hotelReservationSystem.cancelReservation(101);
        } catch (NoActiveReservationException exception) {
            log.error(Arrays.toString(exception.getStackTrace()));
            System.out.println(exception.getMessage());
        }
    }
}
