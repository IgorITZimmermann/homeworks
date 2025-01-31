package de.ait.homework34;

import de.ait.exceptions.NoGuestException;
import lombok.extern.slf4j.Slf4j;

/**
 * Класс BookingRoomDatabase
 * Этот класс управляет базой данных бронирования номеров.
 * Он отвечает за хранение информации о доступных и забронированных номерах,
 * а также за операции добавления, удаления и поиска бронирований.
 *
 * BookingRoomDatabase Class
 * This class manages the booking room database.
 * It is responsible for storing information about available and booked rooms,
 * as well as performing operations like adding, removing, and searching for bookings.
 */
@Slf4j
public class BookingRoomDatabase {

    private int[] rooms = {101, 102, 103, 201, 202};
    private String[] guests = new String[5];

    /**
     * Добавляет гостя в указанную комнату.
     * Adds a guest to the specified room.
     * @param roomIndex индекс комнаты / room index
     * @param guestName имя гостя / guest name
     */
    public void addGuest(int roomIndex, String guestName){
        if(roomIndex < 0 || roomIndex >= rooms.length){
            log.error("Wrong room index: {}", roomIndex);
            throw new ArrayIndexOutOfBoundsException("Wrong room index: " + roomIndex);
        }
        if(guestName == null || guestName.isEmpty()){
            log.error("Guest name is empty or null");
            throw new IllegalArgumentException("Guest name is empty or null");
        }
        guests[roomIndex] = guestName;
        log.info("Guest {} was added to room {}", guestName, rooms[roomIndex]);
    }

    /**
     * Получает имя гостя, зарегистрированного в указанной комнате.
     * Retrieves the name of the guest registered in the specified room.
     * @param roomIndex индекс комнаты / room index
     * @return имя гостя / guest name
     * @throws NoGuestException если в комнате нет гостя / if no guest is in the room
     */
    public String getGuest(int roomIndex) throws NoGuestException{
        if(roomIndex < 0 || roomIndex >= rooms.length){
            log.error("Wrong room index: {}", roomIndex);
            throw new ArrayIndexOutOfBoundsException("Wrong room index: " + roomIndex);
        }
        if(guests[roomIndex] == null){
            log.error("No guest in room {}", rooms[roomIndex]);
            throw new NoGuestException("No guest in room " + rooms[roomIndex]);
        }
        return guests[roomIndex];
    }
}
