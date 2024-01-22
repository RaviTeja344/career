package com.example.product.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Builder
@Data
@AllArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productID;
    private String productName;
    private int productPrice;

}
