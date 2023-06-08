package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
