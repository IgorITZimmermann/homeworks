package de.ait.homework27;

import java.util.HashMap;
import java.util.HashSet;

public class Business {
    private String name;
    private HashMap<String,  Department> departments = new HashMap<>();

    public Business(String name) {
        this.name = name;
    }

    public  void addDepartment(Department department)
    {
        if(department == null){
            System.out.println("Department is null");
        }
        else {
            departments.put(department.getName(),department);
            System.out.println("Department " + department.getName() + " added");
        }
    }

    public void removeDepartment(String departmentName){
        if(departmentName == null || departmentName.isEmpty()){
            System.out.println("Department name is null or empty");
        }
        else {
            if(departments.containsKey(departmentName)) {
                departments.remove(departmentName);
                System.out.println("Department " + departmentName + " removed");
            }
            else {
                System.out.println("Department " + departmentName + " not found");
            }
        }
    }

    public Department getDepartment(String departmentName){
        if(departmentName == null || departmentName.isEmpty()){
            System.out.println("Department name is null or empty");
        }
        else {
            if(departments.containsKey(departmentName)) {
                return departments.get(departmentName);
            }
            else {
                System.out.println("Department " + departmentName + " not found");
            }
        }
        return null;
    }

    public HashSet<String> getAllPositions(){
        HashSet<String> positions = new HashSet<>();
        for(Department department : departments.values()){
            for(Employee employee : department.getEmployees()){
                positions.add(employee.getPosition());
            }
        }
        return positions;
    }

    public double getTotalCompanySalary(){
        double totalSalaryBusiness = 0;
        for(Department department : departments.values()){
            totalSalaryBusiness = totalSalaryBusiness + department.getTotalSalary();
        }
        return totalSalaryBusiness;
    }
}
