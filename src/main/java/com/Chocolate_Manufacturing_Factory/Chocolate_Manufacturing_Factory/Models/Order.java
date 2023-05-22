package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer quantity;
    String shipping_address;

    @ManyToOne
    @JoinColumn(name = "chocolate_id", referencedColumnName = "id")
    Chocolate chocolate;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
}
