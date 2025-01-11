package de.ait.homework27;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Класс Business представляет компанию, состоящую из нескольких департаментов.
 * Этот класс управляет добавлением, удалением и получением информации о департаментах,
 * а также предоставляет общую информацию о позициях сотрудников и общей зарплате компании.
 *
 * The Business class represents a company that consists of multiple departments.
 * This class manages adding, removing, and retrieving department information,
 * as well as providing overall information about employee positions and total company salary.
 */
public class Business {
    private String name; // Название компании / Name of the company
    private HashMap<String, Department> departments = new HashMap<>(); // Хранение департаментов / Storage of departments

    // Конструктор для создания объекта Business с заданным именем
    // Constructor to create a Business object with a given name
    public Business(String name) {
        this.name = name;
    }

    /**
     * Метод для добавления департамента в компанию.
     * Если департамент равен null, выводится сообщение об ошибке.
     * Adds a department to the company.
     * If the department is null, an error message is displayed.
     */
    public void addDepartment(Department department) {
        if (department == null) {
            System.out.println("Department is null");
        } else {
            departments.put(department.getName(), department);
            System.out.println("Department " + department.getName() + " added");
        }
    }

    /**
     * Метод для удаления департамента по его имени.
     * Если департамент не найден или имя некорректно, выводится сообщение об ошибке.
     * Removes a department by its name.
     * If the department is not found or the name is invalid, an error message is displayed.
     */
    public void removeDepartment(String departmentName) {
        if (departmentName == null || departmentName.isEmpty()) {
            System.out.println("Department name is null or empty");
        } else {
            if (departments.containsKey(departmentName)) {
                departments.remove(departmentName);
                System.out.println("Department " + departmentName + " removed");
            } else {
                System.out.println("Department " + departmentName + " not found");
            }
        }
    }

    /**
     * Метод для получения департамента по его имени.
     * Если департамент не найден или имя некорректно, возвращается null.
     * Retrieves a department by its name.
     * If the department is not found or the name is invalid, null is returned.
     */
    public Department getDepartment(String departmentName) {
        if (departmentName == null || departmentName.isEmpty()) {
            System.out.println("Department name is null or empty");
        } else {
            if (departments.containsKey(departmentName)) {
                return departments.get(departmentName);
            } else {
                System.out.println("Department " + departmentName + " not found");
            }
        }
        return null;
    }

    /**
     * Метод для получения всех уникальных должностей сотрудников в компании.
     * Returns a set of all unique employee positions in the company.
     */
    public HashSet<String> getAllPositions() {
        HashSet<String> positions = new HashSet<>();
        for (Department department : departments.values()) {
            for (Employee employee : department.getEmployees()) {
                positions.add(employee.getPosition());
            }
        }
        return positions;
    }

    /**
     * Метод для расчета общей зарплаты всех сотрудников компании.
     * Returns the total salary of all employees in the company.
     */
    public double getTotalCompanySalary() {
        double totalSalaryBusiness = 0;
        for (Department department : departments.values()) {
            totalSalaryBusiness = totalSalaryBusiness + department.getTotalSalary();
        }
        return totalSalaryBusiness;
    }

    public HashMap<String, Department> getDepartments() {
        return new HashMap<>(departments);
    }
}