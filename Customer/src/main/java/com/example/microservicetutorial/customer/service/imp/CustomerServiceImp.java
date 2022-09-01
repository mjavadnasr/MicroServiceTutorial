package com.example.microservicetutorial.customer.service.imp;

import com.example.microservicetutorial.customer.entity.Customer;
import com.example.microservicetutorial.customer.model.CustomerModel;
import com.example.microservicetutorial.customer.repo.CustomerRepo;
import com.example.microservicetutorial.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public void register(CustomerModel customerModel) {
        Customer customer = Customer.builder()
                .firstName(customerModel.getFirstName())
                .lastName(customerModel.getLastName())
                .email(customerModel.getEmail())
                .build();

        //todo email validation for is valid and not taken

    }
}
