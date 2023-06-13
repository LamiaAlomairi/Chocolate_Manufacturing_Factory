package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Getter
@Setter
@Data
public class BaseEntity {
    Boolean isActive;
    @CreatedDate
    Date createdDate;
    @UpdateTimestamp
    Date updatedDate;
}
