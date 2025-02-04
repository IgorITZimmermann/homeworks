/*
 * Этот класс предназначен для управления системой бронирования авиабилетов.
 * Он содержит методы для бронирования, отмены и управления пассажирами на рейсах.
 *
 * This class is designed to manage the airline reservation system.
 * It includes methods for booking, canceling, and managing passengers on flights.
 */

package de.ait.homework35;

import com.github.javafaker.Faker;
import de.ait.exceptions.SeatUnavailableException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AirlineReservationSystemApp {
    public static void main(String[] args) {
        AirlineReservationSystem airlineReservationSystem = new AirlineReservationSystem();
        Faker faker = new Faker();
        try {
            System.out.println("----------1-----------");
            airlineReservationSystem.reserveSeat("QA234", 3, faker.name().lastName());
            System.out.println("----------2-----------");
            //airlineReservationSystem.reserveSeat("QA239", 3, faker.name().lastName());
            System.out.println("----------3-----------");
            //airlineReservationSystem.reserveSeat("QA234", 3, faker.name().lastName());
            airlineReservationSystem.reserveSeat("QA234", 30, faker.name().lastName());

        }
        catch (NullPointerException | IllegalArgumentException | SeatUnavailableException exception){
            log.error(exception.getMessage());
        }
    }
}
