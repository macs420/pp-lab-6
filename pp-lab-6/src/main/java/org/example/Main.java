package org.example;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Worker("worker 1", 21.73, 1),
                new Worker("worker 2", 11.09, 2),
                new Worker("worker 3", 40.02, 3),
                new Worker("worker 4", 01.03, 4), 
                new Manager("manager", 19.92, 5)
        };


        for (Employee employee: employees) {
            System.out.println("Employee: " + employee.getName() + " getting: " + employee.getSalary());
            employee.work();
        }
    }
}