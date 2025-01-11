package de.ait.homework27;

import java.util.Objects;

/**
 * Класс Employee представляет сотрудника компании с основными атрибутами:
 * уникальным идентификатором, именем, должностью и зарплатой.
 *
 * The Employee class represents a company employee with the following attributes:
 * a unique identifier, name, position, and salary.
 */
public class Employee {

    private String id; // Уникальный идентификатор сотрудника / Unique identifier for the employee
    private String name; // Имя сотрудника / Name of the employee
    private String position; // Должность сотрудника / Position of the employee
    private double salary; // Зарплата сотрудника / Salary of the employee

    /**
     * Конструктор для создания объекта сотрудника с заданными параметрами.
     * Constructor to create an Employee object with specified parameters.
     */
    public Employee(String id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Метод для получения ID сотрудника / Getter for employee ID
    public String getId() {
        return id;
    }

    // Метод для получения имени сотрудника / Getter for employee name
    public String getName() {
        return name;
    }

    // Метод для установки имени сотрудника / Setter for employee name
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения должности сотрудника / Getter for employee position
    public String getPosition() {
        return position;
    }

    // Метод для установки должности сотрудника / Setter for employee position
    public void setPosition(String position) {
        this.position = position;
    }

    // Метод для получения зарплаты сотрудника / Getter for employee salary
    public double getSalary() {
        return salary;
    }

    // Метод для установки зарплаты сотрудника / Setter for employee salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Метод для получения информации о сотруднике в текстовом формате.
     * Returns a string representation of the employee's information.
     */
    protected String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }

    /**
     * Метод equals для сравнения сотрудников по их уникальному идентификатору.
     * Overrides equals to compare employees by their unique identifier.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    /**
     * Метод hashCode для генерации хэша на основе уникального идентификатора сотрудника.
     * Overrides hashCode to generate a hash based on the employee's unique identifier.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}