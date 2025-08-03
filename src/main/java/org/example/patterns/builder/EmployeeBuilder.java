package org.example.patterns.builder;

public abstract class EmployeeBuilder {
    String name;
    int age;
    String address;
    String phone;
    String dob;
    String joinedAt;
    String[] prevCompanies;
    String department;

    EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    EmployeeBuilder setAddress(String name) {
        this.address = name;
        return this;
    }

    EmployeeBuilder setPhone(String name) {
        this.phone = name;
        return this;
    }

    EmployeeBuilder setDob(String name) {
        this.dob = name;
        return this;
    }

    EmployeeBuilder setJoinedAt(String name) {
        this.joinedAt = name;
        return this;
    }

    EmployeeBuilder setPrevComp(String[] name) {
        this.prevCompanies = name;
        return this;
    }

    abstract EmployeeBuilder setDepartment();

    abstract Employee build();
}
