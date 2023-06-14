package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.ResponseObject;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Product;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Builder
public class ProductResponse {
    Long id;
    String name;
    Integer quantity;
    Double price;
    List<String> ingredients;

    public static ProductResponse convertToResponse(Product productRequest) {
        return ProductResponse.builder()
                .id(productRequest.getId())
                .name(productRequest.getName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice())
                .ingredients(productRequest.getIngredients())
                .build();
    }

    public static List<ProductResponse> convertToResponseList(List<Product> productsRequest) {
        List<ProductResponse> productResponseList = new ArrayList<>();
        if (!productsRequest.isEmpty()) {
            for (Product request : productsRequest) {
                productResponseList.add(convertToResponse(request));
            }
        }
        return productResponseList;
    }
}
