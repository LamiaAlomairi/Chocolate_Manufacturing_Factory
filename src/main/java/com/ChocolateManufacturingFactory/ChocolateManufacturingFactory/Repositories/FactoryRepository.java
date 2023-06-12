package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactoryRepository extends JpaRepository<Factory, Long> {
}
