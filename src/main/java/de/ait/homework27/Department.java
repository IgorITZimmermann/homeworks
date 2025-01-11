package de.ait.homework27;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Класс Department представляет департамент компании, содержащий список сотрудников.
 * Этот класс управляет добавлением, удалением и поиском сотрудников, а также предоставляет
 * общую информацию о зарплатах в департаменте.
 *
 * The Department class represents a department within a company that contains a list of employees.
 * This class manages adding, removing, and finding employees, as well as providing
 * overall salary information within the department.
 */
public class Department {
    private String name; // Название департамента / Name of the department
    private ArrayList<Employee> employees = new ArrayList<>(); // Список сотрудников / List of employees

    // Конструктор для создания департамента с заданным именем
    // Constructor to create a department with a given name
    public Department(String name) {
        this.name = name;
    }

    // Метод для получения имени департамента / Getter for the department name
    public String getName() {
        return name;
    }

    /**
     * Метод для добавления сотрудника в департамент.
     * Проверяется, что сотрудник и его данные не равны null, а зарплата больше 0.
     * Adds an employee to the department.
     * Validates that the employee and their details are not null, and the salary is greater than 0.
     */
    public void addEmployee(Employee employee) {
        if (employee == null) {
            System.out.println("Employee is null");
        } else if (employee.getId() == null || employee.getName() == null
                || employee.getPosition() == null || employee.getSalary() <= 0) {
            System.out.println("Employee is invalid");
        } else {
            employees.add(employee);
            System.out.println("Employee ID " + employee.getId() + " added");
        }
    }

    /**
     * Метод для удаления сотрудника из департамента по его ID.
     * Если ID не найдено, выводится сообщение об ошибке.
     * Removes an employee from the department by their ID.
     * If the ID is not found, an error message is displayed.
     */
    public void removeEmployee(String employeeId) {
        boolean found = false;
        if (employeeId == null || employeeId.isEmpty()) {
            System.out.println("Employee ID is null or empty");
        } else {
            for (Employee employee : employees) {
                if (employee.getId().equals(employeeId)) {
                    employees.remove(employee);
                    System.out.println("Employee ID " + employeeId + " removed");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee ID " + employeeId + " not found");
            }
        }
    }

    /**
     * Метод для поиска сотрудника в департаменте по его ID.
     * Если ID не найдено, возвращается null.
     * Finds an employee in the department by their ID.
     * If the ID is not found, null is returned.
     */
    public Employee findEmployee(String employeeId) {
        if (employeeId == null || employeeId.isEmpty()) {
            System.out.println("Employee ID is null or empty");
        } else {
            for (Employee employee : employees) {
                if (employee.getId().equals(employeeId)) {
                    return employee;
                }
            }
            System.out.println("Employee ID " + employeeId + " not found");
        }
        return null;
    }

    /**
     * Метод для расчета общей зарплаты всех сотрудников департамента.
     * Returns the total salary of all employees in the department.
     */
    public double getTotalSalary() {
        double totalSalary = 0;
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return totalSalary;
        }

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    /**
     * Метод для получения списка всех сотрудников департамента.
     * Returns a list of all employees in the department.
     */
    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    // Переопределение equals для сравнения департаментов по имени
    // Overrides equals to compare departments by name
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    // Переопределение hashCode для генерации уникального хэша по имени департамента
    // Overrides hashCode to generate a unique hash based on the department name
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}