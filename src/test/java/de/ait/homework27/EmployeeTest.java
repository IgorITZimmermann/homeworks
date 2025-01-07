package de.ait.homework27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeTest {

    @Test
    void testEmployeeCreateAndGetterSettersWereSuccesfull() {
        Employee employee = new Employee("1","Doe","Junior developer", 35000);
        assertNotNull(employee);
        String resultId = employee.getId();
        assertEquals("1", resultId);
        String resultName = employee.getName();
        assertEquals("Doe", resultName);
        String resultPosition = employee.getPosition();
        assertEquals("Junior developer", resultPosition);
        double resultSalary = employee.getSalary();
        assertEquals(35000, resultSalary);
        employee.setSalary(45000);
        double newSalary = employee.getSalary();
        assertEquals(45000, newSalary);
    }
}
