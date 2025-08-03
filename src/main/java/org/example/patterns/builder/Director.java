package org.example.patterns.builder;

public class Director {
    EmployeeBuilder employeeBuilder;

    public Director(EmployeeBuilder em) {
        this.employeeBuilder = em;
    }

   public Employee run () {
        Employee employee = employeeBuilder.setName("abcd").setAge(27).setAddress("springField")
                .setPhone("gwfdshdtesrw").build();
       return employee;
    }
}

