package com.codeacademy.EmployeeAPI.database;

import com.codeacademy.EmployeeAPI.entity.Address;
import com.codeacademy.EmployeeAPI.entity.Employee;
import com.codeacademy.EmployeeAPI.entity.Review;
import com.codeacademy.EmployeeAPI.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private EmployeeRepository employeeRepository;

    public DbSeeder(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Employee employee1 = new Employee(
                "Deni",
                "Mircheski",
                "Mentor",
                new Address("Koce Metalec", "Skopje", "Macedonia"),
                Arrays.asList(
                        new Review("Pero", 8),
                        new Review("Maja", 9)
                )
        );

        Employee employee2 = new Employee(
                "Risto",
                "Kochevski",
                "Mentor",
                new Address("Koce Metalec", "Skopje", "Macedonia"),
                new ArrayList<>()
        );

        this.employeeRepository.deleteAll();
        this.employeeRepository.save(employee1);
        this.employeeRepository.save(employee2);
    }
}
