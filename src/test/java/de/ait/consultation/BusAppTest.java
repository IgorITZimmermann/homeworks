package de.ait.consultation;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BusAppTest {

    @Test
    void testIsBusAvailableSuccess() {
        BusApp busApp = new BusApp();
        boolean result = busApp.isBusAvailable(LocalTime.of(9,0));
        assertTrue(result);
    }

    @Test
    void testIsBusAvailableFailToLate() {
        BusApp busApp = new BusApp();
        boolean result = busApp.isBusAvailable(LocalTime.of(5,0));
        assertFalse(result);
    }
}
