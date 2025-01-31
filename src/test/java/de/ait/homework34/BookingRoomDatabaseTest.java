package de.ait.homework34;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Тесты для BookingRoomDatabase
 * Этот класс проверяет корректность работы методов добавления гостя в систему бронирования.
 *
 * Tests for BookingRoomDatabase
 * This class verifies the correctness of methods for adding guests to the booking system.
 */
public class BookingRoomDatabaseTest {

    private BookingRoomDatabase bookingRoomDatabase = null;
    private static Faker faker = null;

    /**
     * Инициализация перед каждым тестом.
     * Initialization before each test.
     */
    @BeforeEach
    public void setUp() {
        faker = new Faker();
        bookingRoomDatabase = new BookingRoomDatabase();
    }

    /**
     * Проверяет успешное добавление гостя.
     * Verifies successful guest addition.
     */
    @Test
    void testAddGuestSuccess() {
        assertDoesNotThrow(() -> bookingRoomDatabase.addGuest(0, faker.name().firstName()));
    }

    /**
     * Проверяет ошибку при добавлении гостя в несуществующую комнату.
     * Verifies failure when adding a guest to a non-existent room.
     */
    @Test
    void testAddGuestFailInvalidRoomIndex() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> bookingRoomDatabase.addGuest(-1, faker.name().firstName()));
    }

    /**
     * Проверяет ошибку при добавлении гостя с пустым именем.
     * Verifies failure when adding a guest with an empty name.
     */
    @Test
    void testAddGuestFailGuestNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> bookingRoomDatabase.addGuest(0, null));
    }
}
