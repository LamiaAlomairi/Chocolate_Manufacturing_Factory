package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Employee;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {

        return employeeRepository.findById(id).get();
    }
}
