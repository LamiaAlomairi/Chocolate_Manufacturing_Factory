package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String phoneNumber;
    Double salary;

    @ManyToOne
    @JoinColumn(name = "factory_id", referencedColumnName = "id")
    Factory factory;
}
