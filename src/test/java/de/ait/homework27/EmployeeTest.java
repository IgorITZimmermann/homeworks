package de.ait.homework27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Тестовый класс для проверки методов класса Employee.
 * Использует JUnit для тестирования создания объекта и методов доступа (getter и setter).
 *
 * Test class for validating the functionality of the Employee class.
 * Uses JUnit to test object creation and getter and setter methods.
 */
public class EmployeeTest {

    /**
     * Тест для проверки успешного создания объекта Employee и корректной работы getter и setter методов.
     *
     * Test to verify successful creation of an Employee object and proper functionality of getter and setter methods.
     */
    @Test
    void testEmployeeCreateAndGetterSettersWereSuccesfull() {
        // Создаем объект Employee / Creating an Employee object
        Employee employee = new Employee("1", "Doe", "Junior developer", 35000);

        // Проверяем, что объект был успешно создан / Verify the object is created successfully
        assertNotNull(employee);

        // Проверяем метод getId / Verify getId method
        String resultId = employee.getId();
        assertEquals("1", resultId);

        // Проверяем метод getName / Verify getName method
        String resultName = employee.getName();
        assertEquals("Doe", resultName);

        // Проверяем метод getPosition / Verify getPosition method
        String resultPosition = employee.getPosition();
        assertEquals("Junior developer", resultPosition);

        // Проверяем метод getSalary / Verify getSalary method
        double resultSalary = employee.getSalary();
        assertEquals(35000, resultSalary);

        // Проверяем метод setSalary / Verify setSalary method
        employee.setSalary(45000);
        double newSalary = employee.getSalary();
        assertEquals(45000, newSalary);
    }

    /**
     * Тест для проверки метода getInfo, возвращающего информацию о сотруднике.
     *
     * Test to verify the getInfo method that returns information about the employee.
     */
    @Test
    void testGetInfo() {
        Employee employee = new Employee("1", "Doe", "Junior developer", 35000);
        String resultInfo = employee.getInfo();
        assertEquals("ID: 1, Name: Doe, Position: Junior developer, Salary: 35000.0", resultInfo);
    }

    /**
     * Тест для проверки методов получения данных (getters).
     * Проверяет, что значения атрибутов возвращаются корректно.
     *
     * Test to verify getter methods.
     * Checks that attribute values are returned correctly.
     */
    @Test
    public void testGetters() {
        // Создаем объект Employee / Create an Employee object
        Employee emp = new Employee("1", "Тим Рикки", "Developer", 60000);

        // Проверяем, что геттеры возвращают корректные значения / Check that getters return correct values
        assertEquals("1", emp.getId());
        assertEquals("Тим Рикки", emp.getName());
        assertEquals("Developer", emp.getPosition());
        assertEquals(60000, emp.getSalary());
    }

    /**
     * Тест для проверки методов установки данных (setters).
     * Проверяет, что значения атрибутов обновляются корректно.
     *
     * Test to verify setter methods.
     * Checks that attribute values are updated correctly.
     */
    @Test
    public void testSetters() {
        // Создаем объект Employee / Create an Employee object
        Employee emp = new Employee("1", "Тим Рикки", "Developer", 60000);

        // Изменяем атрибуты сотрудника с помощью сеттеров / Update employee attributes using setters
        emp.setName("Тим Рикки");
        emp.setPosition("Tester");
        emp.setSalary(50000);

        // Проверяем, что сеттеры корректно обновили значения / Verify setters updated the values correctly
        assertEquals("Тим Рикки", emp.getName());
        assertEquals("Tester", emp.getPosition());
        assertEquals(50000, emp.getSalary());
    }
}