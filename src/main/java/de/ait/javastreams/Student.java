package de.ait.javastreams;

public class Student {
    private String name;
    private int age;
    private String department;
    private double gpa;

    public Student(String name, int age, String department, double gpa) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', age=%d, department='%s', gpa=%.2f}",
                name, age, department, gpa);
    }
}
