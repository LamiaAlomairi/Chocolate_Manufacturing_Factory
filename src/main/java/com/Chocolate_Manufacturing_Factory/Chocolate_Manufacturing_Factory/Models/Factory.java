package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "factory")
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String location;
    Integer capacity;

    @OneToMany(mappedBy = "factory")
    @JsonIgnore
    private List<Employee> employees;

    @OneToMany(mappedBy = "factory")
    @JsonIgnore
    private List<Inventory> inventories;
}
