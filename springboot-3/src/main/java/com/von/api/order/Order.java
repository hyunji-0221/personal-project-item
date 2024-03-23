package com.von.api.order;

import com.von.api.product.Product;
import com.von.api.user.User;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString (exclude = "id")

@Entity(name = "orders")
public class Order {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "prodId")
    private Product product;

    @Builder(builderMethodName = "builder")
    public Order(Long id, User user, Product product) {
        this.id = id;
        this.user = user;
        this.product = product;
    }
}
