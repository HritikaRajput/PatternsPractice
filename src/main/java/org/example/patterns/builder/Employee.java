package org.example.patterns.builder;

public class Employee {
    String name;
    int age;
    String address;
    String phone;
    String dob;
    String joinedAt;
    String[] prevCompanies;
    String department;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.age = employeeBuilder.age;
        this.address = employeeBuilder.address;
        this.phone = employeeBuilder.phone;
        this.dob = employeeBuilder.dob;
        this.joinedAt = employeeBuilder.joinedAt;
        this.prevCompanies = employeeBuilder.prevCompanies;
        this.department = employeeBuilder.department;
    }

    @Override
    public String toString() {
        return this.name + " "+
                this.address + " "+
                this.age + " "+
                this.department+ " "+
                        this.joinedAt+ " "+
                                this.prevCompanies;
    }

}
