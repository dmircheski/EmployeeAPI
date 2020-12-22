package com.codeacademy.EmployeeAPI.controller;

import com.codeacademy.EmployeeAPI.entity.Employee;
import com.codeacademy.EmployeeAPI.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees-api")
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
    public List<Employee> getAll() {
        List<Employee> employees = this.employeeRepository.findAll();

        return employees;
    }
}
