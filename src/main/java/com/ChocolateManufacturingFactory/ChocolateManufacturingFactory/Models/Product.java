package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models;

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
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer quantity;
    Double price;
    @ElementCollection
    private List<String> ingredients;
}
