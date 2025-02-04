/*
 * Этот класс предназначен для управления системой бронирования авиабилетов.
 * Он содержит методы для бронирования, отмены и управления пассажирами на рейсах.
 *
 * This class is designed to manage the airline reservation system.
 * It includes methods for booking, canceling, and managing passengers on flights.
 */

package de.ait.homework35;

import de.ait.exceptions.InvalidArtworkDataException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightBooking {

    /*
     * Метод: bookFlight
     * Описание: Бронирует место на рейс
     *
     * Method: bookFlight
     * Description: Books a seat on a flight
     */
    public void bookFlight(String flightNumber, String passengerName, int seatNumber) {
        if(flightNumber == null || flightNumber.isEmpty()){
            log.error("Flight number cannot be empty or null");
            throw new IllegalArgumentException("Flight number cannot be empty or null");
        }
        if(passengerName == null || passengerName.isEmpty()){
            log.error("Passenger name cannot be empty or null");
            throw new IllegalArgumentException("Passenger name cannot be empty or null");
        }
        if(seatNumber <= 0){
            log.error("Seat number is negative or zero");
            throw new IllegalArgumentException("Seat number is negative or zero");
        }

        else {
            log.info("Flight booking was successfully completed. Flight number: {}. Passenger name: {}. Seat number: {}", flightNumber, passengerName, seatNumber);
        }

    }

}
