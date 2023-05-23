package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customer_id;
    String name;
    String address;
    Integer phone_number;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Order> orders;
}
