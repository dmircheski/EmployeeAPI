package com.codeacademy.EmployeeAPI.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Employees")
public class Employee {
    @Id
    private String id;
    private String employeeName;
    private String employeeSurname;
    private String employeeRole;
    private Address address;
    private List<Review> reviews;

    public Employee(String employeeName, String employeeSurname, String employeeRole, Address address, List<Review> reviews) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeeRole = employeeRole;
        this.address = address;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
