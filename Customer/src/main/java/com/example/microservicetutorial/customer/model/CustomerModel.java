package com.example.microservicetutorial.customer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {

    private String firstName;
    private String lastName;
    private String email;
}
