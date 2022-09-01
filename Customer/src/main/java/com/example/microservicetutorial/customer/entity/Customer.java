package com.example.microservicetutorial.customer.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data  @Builder
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
