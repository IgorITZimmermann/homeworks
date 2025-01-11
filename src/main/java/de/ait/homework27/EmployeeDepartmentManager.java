package de.ait.homework27;

/**
 * Класс EmployeeDepartmentManager демонстрирует работу с классами Employee, Department и Business.
 * Он создает сотрудников, добавляет их в департамент, а затем объединяет департамент в компанию.
 * Выводит информацию о суммарной зарплате компании и всех уникальных должностях.
 *
 * The EmployeeDepartmentManager class demonstrates the functionality of the Employee, Department, and Business classes.
 * It creates employees, adds them to a department, and then integrates the department into a company.
 * Outputs information about the total company salary and all unique positions.
 */
public class EmployeeDepartmentManager {
    public static void main(String[] args) {
        // Создаем сотрудников с их параметрами
        // Creating employees with their attributes
        Employee employeeDoe = new Employee("1", "Doe", "Junior developer", 35000);
        Employee employeeTom = new Employee("3", "Tom", "Junior developer", 25000);
        Employee employeeBatman = new Employee("2", "John", "Senior developer", 50000);

        // Создаем департамент "IT" и добавляем в него сотрудников
        // Creating the "IT" department and adding employees to it
        Department departmentIT = new Department("IT");
        departmentIT.addEmployee(employeeDoe);
        departmentIT.addEmployee(employeeBatman);
        departmentIT.addEmployee(employeeTom);

        // Создаем компанию и добавляем в нее департамент
        // Creating a company and adding the department to it
        Business business = new Business("CompIT");
        business.addDepartment(departmentIT);

        // Выводим общую зарплату всех сотрудников компании
        // Printing the total salary of all employees in the company
        System.out.println(business.getTotalCompanySalary());

        // Выводим все уникальные должности сотрудников в компании
        // Printing all unique positions of employees in the company
        System.out.println(business.getAllPositions());
    }
}