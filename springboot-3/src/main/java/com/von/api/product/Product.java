package com.von.api.product;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@ToString(exclude = "id")

@Entity(name = "products")
public class Product {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private String productPrice;
    private String company;

    @Builder(builderMethodName = "builder")
    public Product(Long id, String productName, String productPrice, String company) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.company = company;
    }

}
