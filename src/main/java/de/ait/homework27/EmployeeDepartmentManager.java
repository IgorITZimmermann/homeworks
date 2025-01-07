package de.ait.homework27;

public class EmployeeDepartmentManager {
    public static void main(String[] args) {
        Employee employeeDoe = new Employee("1","Doe","Junior developer", 35000);
        Employee employeeTom = new Employee("3","Tom","Junior developer", 25000);
        Employee employeeBatman = new Employee("2","John","Senior developer", 50000);

        Department departmentIT = new Department("IT");
        departmentIT.addEmployee(employeeDoe);
        departmentIT.addEmployee(employeeBatman);
        departmentIT.addEmployee(employeeTom);

        Business business = new Business("CompIT");
        business.addDepartment(departmentIT);

        System.out.println(business.getTotalCompanySalary());
        System.out.println(business.getAllPositions());


    }
}
