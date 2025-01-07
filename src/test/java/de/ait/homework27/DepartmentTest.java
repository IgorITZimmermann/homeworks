package de.ait.homework27;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentTest {

    private Department departmentIT;

    @BeforeEach
    void setUp() {
        departmentIT = new Department("IT");
    }

    @Test
    void testAddEmployeeSuccesfull() {
        Employee employee = new Employee("1","Doe","Junior developer", 35000);
        Employee employee2 = new Employee("2","John","Senior developer", 50000);
        Employee employee3 = new Employee("3","Tom","Junior developer", 25000);
        departmentIT.addEmployee(employee);
        departmentIT.addEmployee(employee2);
        departmentIT.addEmployee(employee3);
        ArrayList<Employee> employeesResult = departmentIT.getEmployees();
        assertEquals(3, employeesResult.size());
        assertEquals(employee, employeesResult.get(0));
        assertEquals(employee2, employeesResult.get(1));
        assertEquals(employee3, employeesResult.get(2));
    }

    @Test
    void testAddNullEmployee() {
        Employee employee = null;
        departmentIT.addEmployee(employee);
        ArrayList<Employee> employeesResult = departmentIT.getEmployees();
        assertEquals(0, employeesResult.size());
    }

    @Test
    void testAddEmptyEmployee() {
        Employee employee = new Employee(null,"Doe","Junior developer", 35000);
        departmentIT.addEmployee(employee);
        ArrayList<Employee> employeesResult = departmentIT.getEmployees();
        assertEquals(0, employeesResult.size());
    }
}
