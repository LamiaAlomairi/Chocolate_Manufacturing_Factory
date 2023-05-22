package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

}
