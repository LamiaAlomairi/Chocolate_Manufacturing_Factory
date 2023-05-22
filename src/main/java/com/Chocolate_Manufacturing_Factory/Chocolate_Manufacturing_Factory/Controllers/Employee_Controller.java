package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Controllers;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Employee;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services.Employee_ٍService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "employee")
public class Employee_Controller {
    //    http://localhost:8080/employee/getAll
    @Autowired
    Employee_ٍService employee_ٍService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {

        return employee_ٍService.getAllEmployees();
    }
    @GetMapping(value = "getById")
    public Employee getEmployeeById(@RequestParam Long id) {

        return employee_ٍService.getEmployeeById(id);
    }
}
