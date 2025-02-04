/*
 * Этот класс предназначен для управления системой бронирования авиабилетов.
 * Он содержит методы для бронирования, отмены и управления пассажирами на рейсах.
 *
 * This class is designed to manage the airline reservation system.
 * It includes methods for booking, canceling, and managing passengers on flights.
 */

package de.ait.homework35;

import de.ait.exceptions.NoPassengerException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightPassangerDispatcher {

    private  String[] flights = {"SU100", "BA202", "LH300", "AF101", "AA777"};
    private String[] passengers = new String[5];

    /*
     * Метод: addPassenger
     * Описание: Добавляет пассажира в систему
     *
     * Method: addPassenger
     * Description: Adds a passenger to the system
     */
    public void addPassenger(int flightIndex, String passengerName){
        if(flightIndex < 0 || flightIndex >= flights.length){
            log.error("FlightIndex is out of bounds. FlightIndex: " + flightIndex);
            throw new ArrayIndexOutOfBoundsException("FlightIndex is out of bounds. FlightIndex: " + flightIndex);
        }
        if(passengerName == null || passengerName.isEmpty()){
            log.error("Passenger name cannot be empty or null");
            throw new IllegalArgumentException("Passenger name cannot be empty or null");
        }
        log.info("Passenger {} was added to flight {} ", passengerName , flights[flightIndex]);
        passengers[flightIndex] = passengerName;
    }

    public String getPassenger(int flightIndex) throws NoPassengerException{
        if(flightIndex < 0 || flightIndex >= flights.length){
            log.error("FlightIndex is out of bounds. FlightIndex: " + flightIndex);
            throw new ArrayIndexOutOfBoundsException("FlightIndex is out of bounds. FlightIndex: " + flightIndex);
        }
        else {
            if(passengers[flightIndex] == null){
                log.error("No passanger was found at index " + flightIndex);
                throw new NoPassengerException("No passanger was found at index " + flightIndex);
            }
            else {
                log.info("Passenger {} was found at index {}", passengers[flightIndex], flightIndex);
                return passengers[flightIndex];
            }
        }

    }

}
