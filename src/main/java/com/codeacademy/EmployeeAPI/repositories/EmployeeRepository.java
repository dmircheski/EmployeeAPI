package com.codeacademy.EmployeeAPI.repositories;

import com.codeacademy.EmployeeAPI.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
