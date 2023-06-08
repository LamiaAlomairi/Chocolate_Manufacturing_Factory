package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Controllers;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Employee;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "employee")
public class EmployeeController {
    //    http://localhost:8080/employee/getAll
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();
    }
    @GetMapping(value = "getById")
    public Employee getEmployeeById(@RequestParam Long id) {

        return employeeService.getEmployeeById(id);
    }
}
