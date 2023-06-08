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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String address;
    Integer phoneNumber;

    @OneToMany(mappedBy = "users")
    @JsonIgnore
    private List<Order> orders;
}
