package de.ait.homework27;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BusinessTest {

    private Business business;

    // Этот метод выполняется перед каждым тестом, чтобы инициализировать объект бизнес.
    // This method is executed before each test to initialize the business object.
    @BeforeEach
    void setUp() {
        business = new Business("Tech Corp");
    }

    // Тест для проверки успешного добавления отдела в бизнес.
    // Test to verify successful addition of a department to the business.
    @Test
    void testAddDepartmentWasSuccessful() {
        Employee employee1 = new Employee("1", "Doe", "Junior developer", 35000);
        Employee employee2 = new Employee("3", "Tom", "Junior developer", 25000);

        Department departmentIT = new Department("IT");
        departmentIT.addEmployee(employee1);
        departmentIT.addEmployee(employee2);

        Business business = new Business("CompIT");
        business.addDepartment(departmentIT);
        Department resultDepartment = business.getDepartment("IT");
        assertEquals(departmentIT, resultDepartment);
    }

    // Тест для проверки добавления отдела, если отдел равен null.
    // Test to verify the addition of a department when the department is null.
    @Test
    void testAddDepartmentWhenDepartmentIsNull() {
        Department departmentIT = null;

        Business business = new Business("CompIT");
        business.addDepartment(departmentIT);
        HashMap<String, Department> employeesResult = business.getDepartments();
        assertEquals(0, employeesResult.size());
    }

    // Тест для проверки удаления отдела с различными названиями или значением null.
    // Test to verify removing a department with different names or null value.
    @Test
    void testRemoveDepartmentWhenDepartmentNameIsDifferent() {
        Employee employee1 = new Employee("1", "Doe", "Junior developer", 35000);
        Employee employee2 = new Employee("3", "Tom", "Junior developer", 25000);

        Department departmentIT = new Department("IT");
        departmentIT.addEmployee(employee1);
        departmentIT.addEmployee(employee2);

        Business business = new Business("CompIT");
        business.addDepartment(departmentIT);

        business.removeDepartment(null); // Удаляем с null названием
        HashMap<String, Department> employeesResult = business.getDepartments();
        assertEquals(1, employeesResult.size());

        business.removeDepartment(""); // Удаляем с пустым названием
        HashMap<String, Department> employeesResult2 = business.getDepartments();
        assertEquals(1, employeesResult2.size());

        business.removeDepartment("HR"); // Удаляем несуществующий отдел
        HashMap<String, Department> employeesResult3 = business.getDepartments();
        assertEquals(1, employeesResult3.size());

        business.removeDepartment("IT"); // Удаляем существующий отдел
        HashMap<String, Department> employeesResult4 = business.getDepartments();
        assertEquals(0, employeesResult4.size());
    }

    // Тест для проверки получения отдела, если название отдела не найдено, null или пустое.
    // Test to verify retrieving a department when the name is not found, null, or empty.
    @Test
    void testGetDepartmentWhenDepartmentNameIsNotFoundOrNullOrEmpty() {
        Business business = new Business("CompIT");

        Department resultDepartment = business.getDepartment(null); // Проверка с null
        assertNull(resultDepartment);

        Department resultDepartment2 = business.getDepartment(""); // Проверка с пустым названием
        assertNull(resultDepartment2);

        Department resultDepartment3 = business.getDepartment("HR"); // Проверка с несуществующим отделом
        assertNull(resultDepartment3);
    }

    // Тест для проверки получения отдела по названию.
    // Test to verify retrieving a department by its name.
    @Test
    public void testGetDepartment() {
        Department dept = new Department("IT");
        business.addDepartment(dept);

        Department itResult = business.getDepartment("IT");
        assertEquals(dept, itResult);
        Department hrResult = business.getDepartment("HR");
        assertNull(hrResult); // Несуществующий отдел
    }

    // Тест для проверки получения всех уникальных должностей компании.
    // Test to verify retrieving all unique positions in the company.
    @Test
    public void testGetUniquePositions() {
        Department itDept = new Department("IT");
        itDept.addEmployee(new Employee("1", "John Doe", "Developer", 60000));
        itDept.addEmployee(new Employee("2", "Jane Smith", "Tester", 55000));
        itDept.addEmployee(new Employee("3", "Max", "Tester", 55000));

        Department hrDept = new Department("HR");
        hrDept.addEmployee(new Employee("3", "Alice", "Manager", 70000));

        business.addDepartment(itDept);
        business.addDepartment(hrDept);

        HashSet<String> uniquePositions = business.getAllPositions();

        assertTrue(uniquePositions.contains("Developer"));
        assertTrue(uniquePositions.contains("Tester"));
        assertTrue(uniquePositions.contains("Manager"));
        assertEquals(3, uniquePositions.size()); // Проверка общего количества уникальных должностей
    }

    // Тест для проверки подсчета общей зарплаты компании.
    // Test to verify the total company salary calculation.
    @Test
    public void testGetTotalCompanySalary() {
        Department itDept = new Department("IT");
        itDept.addEmployee(new Employee("1", "John Doe", "Developer", 60000));

        Department hrDept = new Department("HR");
        hrDept.addEmployee(new Employee("2", "Jane Smith", "Manager", 80000));

        business.addDepartment(itDept);
        business.addDepartment(hrDept);

        double expectedTotalSalary = 60000 + 80000;
        double totalCompanySalaryResult = business.getTotalCompanySalary();
        assertEquals(expectedTotalSalary, totalCompanySalaryResult);
    }
}