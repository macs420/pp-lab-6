package org.example;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[]{
                new Worker("worker 1", 21.73, 1, "worker under 2"),
                new Worker("worker 2", 11.09, 2, "worker under 3"),
                new Worker("worker 3", 40.02, 3, "worker under 4"),
                new Worker("worker 4", 01.03, 4, "worker under manager"),
                new Manager("manager", 19.92, 5, "boss")
        };

        ArrayList<Employee> employees = new ArrayList<Employee>();

        Collections.addAll(employees, employeesArray);

        employees.forEach(employee -> {
            employee.work();
            String employeeMessage = String.format("- %s (ID: %d, Position: %s, Hire date: %s, Salary: %.2f)",
                    employee.getName(),
                    employee.hashCode(),
                    employee.getPosition(),
                    employee.getHireDate(),
                    employee.getSalary());
            System.out.println(employeeMessage);
        });

        System.out.println("============================================");

        Employee[] otherEmployees = new Employee[]{
                new Worker("worker 1", 21.73, 6, "worker under 2"),
                new Worker("worker duplicated", 21.13, 6, "worker under 2"),
                new Worker("worker 2", 11.09, 7, "worker under 3"),
                new Manager("manager", 19.92, 8, "BiH")
        };

        for (Employee employee : otherEmployees) {
            System.out.println(employee.getName() + getEqualString(otherEmployees[1].equals(employee)) + otherEmployees[1].getName());
            var hashCode = employee.hashCode();

            String employeeMessage = String.format("- %s has code:  %d",
                    employee.getName(),
                    hashCode);
            System.out.println(employeeMessage);

            employees.add(employee);
        }

        System.out.println("============================================");

        double salarySum = 0.0;
        double workersSum = 0.0;
        double managersSum = 0.0;
        ArrayList<Employee> duplicatedEmployees = new ArrayList<Employee>();
        for(Employee employee : employees) {
            salarySum += employee.getSalary();

            if(employee instanceof Worker) {
                workersSum += employee.getSalary();
            }

            if(employee instanceof Manager) {
                managersSum += employee.getSalary();
            }
        }

        for(int firstEmployeeIndex = 0; firstEmployeeIndex < employees.size(); firstEmployeeIndex++) {
            Employee currentEmployee = employees.get(firstEmployeeIndex);
            int firstHashCode = currentEmployee.hashCode();

            for(int secondEmployeeIndex = 0; secondEmployeeIndex < employees.size(); secondEmployeeIndex++) {
                if(firstEmployeeIndex != secondEmployeeIndex) {
                    Employee secondEmployee = employees.get(secondEmployeeIndex);
                    int secondHashCode = secondEmployee.hashCode();

                    if(firstHashCode == secondHashCode) {
                        duplicatedEmployees.add(secondEmployee);
                    }
                }
            }

        }

        System.out.println("Employees salaries sum: " + salarySum + " RSD");
        System.out.println("Workers salaries sum: " + workersSum + " BAM");
        System.out.println("Managers salaries sum: " + managersSum + " KN");

        duplicatedEmployees.forEach(employee -> System.out.println("Duplicated Employee: " + employee.getName() + "With Id:" + employee.hashCode()));
    }

    public static String getEqualString(boolean equal) {
        return equal ? " is equal " : "is not equal " ;
    }

}