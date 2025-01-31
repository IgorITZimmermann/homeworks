package de.ait.homework34;

import de.ait.exceptions.NoActiveReservationException;
import de.ait.exceptions.RoomUnavailableException;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс HotelReservationSystem
 * Этот класс управляет системой бронирования номеров в отеле.
 * Он предоставляет функциональность для резервирования и отмены бронирования номеров.
 *
 * HotelReservationSystem Class
 * This class manages the hotel room reservation system.
 * It provides functionality for booking and canceling room reservations.
 */
@Slf4j
public class HotelReservationSystem {
    private Map<Integer, Boolean> roomsInfo = new HashMap<>();

    public HotelReservationSystem() {
        roomsInfo.put(101, false);
        roomsInfo.put(102, false);
        roomsInfo.put(103, false);
        roomsInfo.put(201, true);
        roomsInfo.put(202, true);
    }

    /**
     * Резервирует номер для гостя.
     * Reserves a room for a guest.
     * @param roomNumber номер комнаты / room number
     * @param guestName имя гостя / guest name
     * @throws RoomUnavailableException если комната уже занята / if the room is already booked
     */
    public void reserveRoom(int roomNumber, String guestName) throws RoomUnavailableException {
        if (!roomsInfo.containsKey(roomNumber) || roomsInfo.get(roomNumber)) {
            throw new RoomUnavailableException("Room " + roomNumber + " is unavailable");
        }
        roomsInfo.put(roomNumber, true);
        log.info("Room {} reserved for {}", roomNumber, guestName);
    }

    /**
     * Отменяет бронирование номера.
     * Cancels a room reservation.
     * @param roomNumber номер комнаты / room number
     * @throws NoActiveReservationException если бронирование не активно / if no active reservation exists
     */
    public void cancelReservation(int roomNumber) throws NoActiveReservationException {
        if (!roomsInfo.containsKey(roomNumber) || !roomsInfo.get(roomNumber)) {
            throw new NoActiveReservationException("No active reservation for room " + roomNumber);
        }
        roomsInfo.put(roomNumber, false);
        log.info("Room {} reservation cancelled", roomNumber);
    }
}
