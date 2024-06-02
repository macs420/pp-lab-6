package company.abstracts;

import company.interfaces.Employable;
import company.models.Worker;

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

    @Override
    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj){
        if(obj == null) {
            return false;
        }

/*        if(obj.getClass() != this.getClass()) {
            return false;
        }*/

        if(!(obj instanceof Employee)) {
            return false;
        }

        return ((Employee)obj).hashCode() == hashCode();
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
