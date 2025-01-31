package de.ait.homework34;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Тесты для SimpleBooking
 * Этот класс проверяет базовую функциональность бронирования номеров.
 *
 * Tests for SimpleBooking
 * This class verifies the basic functionality of room booking.
 */
public class SimpleBookingTest {

    private static Faker faker = null;
    private SimpleBooking simpleBooking = null;

    /**
     * Инициализация перед каждым тестом.
     * Initialization before each test.
     */
    @BeforeEach
    public void setUp() {
        faker = new Faker();
        simpleBooking = new SimpleBooking();
    }

    /**
     * Проверяет успешное бронирование номера.
     * Verifies successful room booking.
     */
    @Test
    void testBookRoomAddGuestSuccess() {
        assertDoesNotThrow(() -> simpleBooking.bookRoom(101, faker.name().firstName()));
    }

    /**
     * Проверяет ошибку при бронировании номера с неверным номером.
     * Verifies failure when booking with an invalid room number.
     */
    @Test
    void testBookRoomAddGuestFailInvalidRoomNumber() {
        assertThrows(IllegalArgumentException.class, () -> simpleBooking.bookRoom(-1, faker.name().firstName()));
    }

    /**
     * Проверяет ошибку при бронировании номера с пустым именем гостя.
     * Verifies failure when booking with an empty guest name.
     */
    @Test
    void testBookRoomAddGuestFailEmptyGuestName() {
        assertThrows(IllegalArgumentException.class, () -> simpleBooking.bookRoom(101, ""));
    }

    /**
     * Проверяет ошибку при бронировании номера с null-именем гостя.
     * Verifies failure when booking with a null guest name.
     */
    @Test
    void testBookRoomAddGuestFailGuestNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> simpleBooking.bookRoom(101, null));
    }
}
