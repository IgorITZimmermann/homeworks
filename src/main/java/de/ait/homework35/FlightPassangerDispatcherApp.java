/*
 * Этот класс предназначен для управления системой бронирования авиабилетов.
 * Он содержит методы для бронирования, отмены и управления пассажирами на рейсах.
 *
 * This class is designed to manage the airline reservation system.
 * It includes methods for booking, canceling, and managing passengers on flights.
 */

package de.ait.homework35;

import com.github.javafaker.Faker;
import de.ait.exceptions.NoPassengerException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightPassangerDispatcherApp {
    public static void main(String[] args) {
        FlightPassangerDispatcher dispatcher = new FlightPassangerDispatcher();
        Faker faker = new Faker();

        System.out.println("------------1------------");
        dispatcher.addPassenger(0,faker.name().lastName());
        dispatcher.addPassenger(1,faker.name().lastName());
        dispatcher.addPassenger(2,faker.name().lastName());

        System.out.println("------------2------------");
        try {
            dispatcher.addPassenger(6, faker.name().lastName());
            System.out.println("------------3------------");
            dispatcher.getPassenger(1);
            System.out.println("------------4------------");
            dispatcher.getPassenger(6);
            System.out.println("------------5------------");
            dispatcher.getPassenger(3);
        }
        catch (ArrayIndexOutOfBoundsException  | NoPassengerException exception){
            log.error(exception.getMessage());
        }



    }
}
