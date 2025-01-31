package de.ait.homework34;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Тесты для FlightBooking
 * Этот класс проверяет корректность работы методов бронирования авиабилетов.
 *
 * Tests for FlightBooking
 * This class verifies the correctness of methods for flight ticket booking.
 */
public class FlightBookingTest {

    private static Faker faker = null;
    private FlightBooking flightBooking = null;

    /**
     * Инициализация перед каждым тестом.
     * Initialization before each test.
     */
    @BeforeEach
    public void setUp() {
        faker = new Faker();
        flightBooking = new FlightBooking();
    }

    /**
     * Проверяет успешное бронирование рейса.
     * Verifies successful flight booking.
     */
    @Test
    void testBookFlightSuccess() {
        assertDoesNotThrow(() -> flightBooking.bookFlight("ASD345", faker.name().lastName(), 10));
    }

    /**
     * Проверяет ошибку при бронировании без номера рейса.
     * Verifies failure when booking without a flight number.
     */
    @Test
    void testBookFlightFailFlightNumberIsNull() {
        assertThrows(IllegalArgumentException.class, () -> flightBooking.bookFlight(null, faker.name().lastName(), 10));
    }

    /**
     * Проверяет ошибку при бронировании с пустым номером рейса.
     * Verifies failure when booking with an empty flight number.
     */
    @Test
    void testBookFlightFailFlightNumberIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> flightBooking.bookFlight("", faker.name().lastName(), 10));
    }

    /**
     * Проверяет ошибку при бронировании без имени пассажира.
     * Verifies failure when booking without a passenger name.
     */
    @Test
    void testBookFlightFailPassengerNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> flightBooking.bookFlight("ASD345", null, 10));
    }

    /**
     * Проверяет ошибку при бронировании с пустым именем пассажира.
     * Verifies failure when booking with an empty passenger name.
     */
    @Test
    void testBookFlightFailPassengerNameIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> flightBooking.bookFlight("ASD345", "", 10));
    }

    /**
     * Проверяет ошибку при бронировании с нулевым номером места.
     * Verifies failure when booking with seat number zero.
     */
    @Test
    void testBookFlightFailSeatNumberIs0() {
        assertThrows(IllegalArgumentException.class, () -> flightBooking.bookFlight("ASD345", faker.name().lastName(), 0));
    }
}
