package company.models;

import company.abstracts.Employee;

public class Worker extends Employee {
    public Worker(String name, double salary, int id, String position) {
        super(name, salary, id, position);
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working...");
    }
}
