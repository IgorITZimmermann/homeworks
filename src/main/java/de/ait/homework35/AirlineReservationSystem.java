/*
 * Этот класс предназначен для управления системой бронирования авиабилетов.
 * Он содержит методы для бронирования, отмены и управления пассажирами на рейсах.
 *
 * This class is designed to manage the airline reservation system.
 * It includes methods for booking, canceling, and managing passengers on flights.
 */

package de.ait.homework35;

import de.ait.exceptions.SeatUnavailableException;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class AirlineReservationSystem {
    private Map<String, Map<Integer, Boolean>> bookedSeats;

    public AirlineReservationSystem() {
        bookedSeats = new HashMap<>();
        Map<Integer, Boolean> bookedSeatsForFlight = new HashMap<>();
        bookedSeatsForFlight.put(1, true);
        bookedSeatsForFlight.put(2, true);
        bookedSeatsForFlight.put(3, false);
        bookedSeats.put("QA234", bookedSeatsForFlight);
    }

    /*
     * Метод: reserveSeat
     * Описание: Резервирует место в самолёте
     *
     * Method: reserveSeat
     * Description: Reserves a seat on the airplane
     */
    public void reserveSeat(String flightNumber, int seatNumber, String passengerName) throws SeatUnavailableException {
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
        if(!bookedSeats.containsKey(flightNumber)){
            throw new IllegalArgumentException("Flight number is wrong " + flightNumber);
        }
        if(bookedSeats.get(flightNumber).get(seatNumber)){
            throw new SeatUnavailableException("Seat is not available " + seatNumber);
        }
        else {
            bookedSeats.get(flightNumber).put(seatNumber, true);
            log.info("Seat {} was reserved for flight {} by passenger {}", seatNumber, flightNumber, passengerName);
        }
    }

    /*
     * Метод: cancelReservation
     * Описание: Отменяет бронирование места
     *
     * Method: cancelReservation
     * Description: Cancels seat reservation
     */
    public void cancelReservation(String flightNumber, int seatNumber) throws SeatUnavailableException {
        if(flightNumber == null || flightNumber.isEmpty()){
            log.error("Flight number cannot be empty or null");
            throw new IllegalArgumentException("Flight number cannot be empty or null");
        }
        if(seatNumber <= 0){
            log.error("Seat number is negative or zero");
            throw new IllegalArgumentException("Seat number is negative or zero");
        }
        if(!bookedSeats.containsKey(flightNumber)){
            throw new IllegalArgumentException("Flight number is wrong " + flightNumber);
        }
        if(bookedSeats.get(flightNumber).get(seatNumber) == null){
            throw new IllegalArgumentException("Seat number is wrong " + seatNumber);

    }
        if(bookedSeats.get(flightNumber).get(seatNumber)){
            throw new SeatUnavailableException("Sear is alrady free" + seatNumber);
        }
        else {
            bookedSeats.get(flightNumber).put(seatNumber, false);
            log.info("Seat {} was canceled for flight {}", seatNumber, flightNumber);
        }
    }




}
