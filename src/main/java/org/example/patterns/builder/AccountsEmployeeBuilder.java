package org.example.patterns.builder;

public class AccountsEmployeeBuilder extends EmployeeBuilder {
    @Override
    EmployeeBuilder setDepartment() {
        this.department = "Account";
        return this;
    }

    @Override
    Employee build() {
        return new Employee(this);
    }
 }
