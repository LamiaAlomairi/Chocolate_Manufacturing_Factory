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
@Table(name = "chocolate")
public class Chocolate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String flavor;
    Integer quantity;
    Double price;
    String manufacturingDate;
    String expirationDate;

    @ManyToOne
    @JoinColumn(name = "inventory_id", referencedColumnName = "id")
    Inventory inventory;

    @OneToMany(mappedBy = "chocolate")
    @JsonIgnore
    private List<Order> orders;

    @ManyToMany(mappedBy = "chocolate")
    @JsonIgnore
    private List<Ingredient> ingredients;
}
