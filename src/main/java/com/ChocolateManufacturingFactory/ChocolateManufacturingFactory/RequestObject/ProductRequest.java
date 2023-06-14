package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.RequestObject;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Product;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@Data
public class ProductRequest {
    String name;
    Integer quantity;
    Double price;
    List<String> ingredients;

    public static Product convert(ProductRequest request) {
        Date nowDate = new Date();
        Product product = new Product();

        product.setName(request.getName());
        product.setQuantity(request.getQuantity());
        product.setPrice(request.getPrice());
        product.setIngredients(request.getIngredients());
        product.setIsActive(true);
        product.setCreatedDate(nowDate);
        product.setUpdatedDate(nowDate);
        return product;
    }

    public static List<Product> convert(List<ProductRequest> requestList) {
        List<Product> products = new ArrayList<>();
        if (!requestList.isEmpty()) {
            for (ProductRequest productRequest : requestList) {
                products.add(convert(productRequest));
            }
        }
        return products;
    }
}
