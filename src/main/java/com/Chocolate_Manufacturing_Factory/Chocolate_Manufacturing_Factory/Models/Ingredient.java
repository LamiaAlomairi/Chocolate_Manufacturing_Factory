package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer quantity;
    Double cost;

    @ManyToOne
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
    Supplier supplier;

    @ManyToMany
    @JoinTable(name = "ingredient_chocolate", joinColumns = @JoinColumn(name = "ingredient_id"), inverseJoinColumns = @JoinColumn(name = "chocolate_id"))
    private List<Chocolate> chocolates;
}
