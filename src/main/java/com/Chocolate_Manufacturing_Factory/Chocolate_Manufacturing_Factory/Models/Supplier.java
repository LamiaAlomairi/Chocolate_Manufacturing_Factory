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
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String address;
    Integer contactNumber;
    String email;

    @OneToMany(mappedBy = "supplier")
    @JsonIgnore
    private List<Ingredient> ingredients;
}
