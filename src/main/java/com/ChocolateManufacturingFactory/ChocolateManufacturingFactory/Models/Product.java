package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models;

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
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer quantity;
    Double price;
    String manufacturingDate;
    String expirationDate;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<Order> orders;

}
