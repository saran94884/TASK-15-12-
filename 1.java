package com.example.hr;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void printName() {
        System.out.println("Employee Name: " + name);
    }

    public void printSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}




package com.example.hrtest;
import com.example.hr.Employee;  // Import the Employee class from the "com.example.hr" package

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1001, 50000.0);

        employee.printName();
        employee.printSalary();
    }
}
