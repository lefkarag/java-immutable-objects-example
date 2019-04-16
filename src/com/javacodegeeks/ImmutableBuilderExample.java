package com.javacodegeeks;

import com.javacodegeeks.Employee.EmployeeBuilder;

public class ImmutableBuilderExample {

    public static void main(String[] args) {
        Employee emp = new EmployeeBuilder().setName("John Smith").setEmail("johnsmith@example.com").build();
        System.out.printf("%s's email is %s", emp.getName(), emp.getEmail());
    }
}

class Employee {
    
    private final String name;
    private final String email;
    
    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    static class EmployeeBuilder {
    
        private String name;
        private String email;
        
        public Employee build() {
            return new Employee(this);
        }
        
        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }
        
        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
    }
}