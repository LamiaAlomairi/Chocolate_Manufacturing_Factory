package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_Repository extends JpaRepository<Employee, Long>  {
}
