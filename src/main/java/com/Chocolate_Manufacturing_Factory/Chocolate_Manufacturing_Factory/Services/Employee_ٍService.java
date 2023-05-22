package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Employee;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories.Employee_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employee_ٍService {
    @Autowired
    Employee_Repository employee_repository;
    public List<Employee> getAllEmployees() {

        return employee_repository.findAll();
    }

    public Employee getEmployeeById(Long id) {

        return employee_repository.findById(id).get();
    }
}
