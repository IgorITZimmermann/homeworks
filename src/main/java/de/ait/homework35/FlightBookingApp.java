/*
 * Этот класс предназначен для управления системой бронирования авиабилетов.
 * Он содержит методы для бронирования, отмены и управления пассажирами на рейсах.
 *
 * This class is designed to manage the airline reservation system.
 * It includes methods for booking, canceling, and managing passengers on flights.
 */

package de.ait.homework35;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightBookingApp {
    public static void main(String[] args) {
        FlightBooking flightBooking = new FlightBooking();
        Faker faker = new Faker();
        System.out.println("----------1-----------");
        flightBooking.bookFlight("QA234", faker.name().lastName(),45);
        System.out.println("----------2-----------");
        try {
            flightBooking.bookFlight(null, faker.name().lastName(), 46);
            System.out.println("----------3-----------");
            flightBooking.bookFlight("QA234", null, 47);
            System.out.println("----------4-----------");
            flightBooking.bookFlight("QA234", faker.name().lastName(), -1);
        }
        catch (IllegalArgumentException exception){
           log.error(exception.getMessage());
        }
    }
}
