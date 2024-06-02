package company.models;

import company.abstracts.Employee;

public class Manager extends Employee {
    public Manager(String name, double salary, int id,String position) {
        super(name, salary, id, position);
    }

    @Override
    public void work() {
        System.out.println("Manager " + this.getName() + " is managing...");
    }

}
