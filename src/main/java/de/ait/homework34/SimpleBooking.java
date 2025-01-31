package de.ait.homework34;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс SimpleBooking
 * Этот класс предоставляет базовую функциональность для бронирования номера.
 *
 * SimpleBooking Class
 * This class provides basic functionality for room booking.
 */
@Slf4j
public class SimpleBooking {

    /**
     * Бронирует номер для гостя.
     * Books a room for a guest.
     * @param roomNumber номер комнаты / room number
     * @param guestName имя гостя / guest name
     */
    public void bookRoom(int roomNumber, String guestName){
        if(roomNumber <= 0){
            log.error("Wrong room number: {}", roomNumber);
            throw new IllegalArgumentException("Wrong room number: " + roomNumber);
        }
        if(guestName == null || guestName.isEmpty()){
            log.error("Guest name is empty or null");
            throw new IllegalArgumentException("Guest name is empty or null");
        }
        log.info("Booking successful. Room: {} Guest:{}", roomNumber, guestName);
    }
}
