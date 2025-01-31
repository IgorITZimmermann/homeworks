package de.ait.homework34;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс FlightBooking
 * Этот класс управляет бронированием авиабилетов.
 * Он содержит информацию о рейсах, пассажирах и бронированиях,
 * а также методы для добавления и отмены бронирований.
 *
 * FlightBooking Class
 * This class handles flight ticket booking.
 * It contains information about flights, passengers, and reservations,
 * as well as methods for adding and canceling bookings.
 */
@Slf4j
public class FlightBooking {
    /**
     * Бронирует место на рейсе.
     * Books a seat on the flight.
     * @param flightNumber номер рейса / flight number
     * @param passengerName имя пассажира / passenger name
     * @param seatNumber номер места / seat number
     */
    public void bookFlight(String flightNumber, String passengerName, int seatNumber){
        if (flightNumber == null || flightNumber.isEmpty()) {
            log.error("Flight number is null or empty");
            throw new IllegalArgumentException("Flight number is null or empty");
        }
        if (passengerName == null || passengerName.isEmpty()) {
            log.error("Passenger name is null or empty");
            throw new IllegalArgumentException("Passenger name is null or empty");
        }
        if (seatNumber <= 0) {
            log.error("Incorrect seat number");
            throw new IllegalArgumentException("Incorrect seat number");
        }
        log.info("Passenger {} registered successfully on flight {}", passengerName, flightNumber);
    }
}
