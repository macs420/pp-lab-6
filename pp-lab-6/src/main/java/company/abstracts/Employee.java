package company.abstracts;

import company.interfaces.Employable;

import java.util.Date;

public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private int id;
    private String hireDate;
    private String position;

    public String getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public Employee(String name, double salary, int id, String position) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = new Date().toString();
        this.position = position;
    }

    public void work() {

    }
}
