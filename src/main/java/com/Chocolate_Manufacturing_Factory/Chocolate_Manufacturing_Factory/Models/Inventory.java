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
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(mappedBy = "inventory")
    @JsonIgnore
    private List<Chocolate> chocolates;

    @ManyToOne
    @JoinColumn(name = "factory_id", referencedColumnName = "id")
    Factory factory;

}
