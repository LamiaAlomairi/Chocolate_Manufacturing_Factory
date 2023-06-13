package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models;

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
public class Factory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String location;
    String email;

    @OneToMany(mappedBy = "factory")
    @JsonIgnore
    private List<Employee> employees;
}
