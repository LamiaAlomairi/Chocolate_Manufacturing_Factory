package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {
}
