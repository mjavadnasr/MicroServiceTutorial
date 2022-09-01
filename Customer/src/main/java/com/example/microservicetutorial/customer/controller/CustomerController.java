package com.example.microservicetutorial.customer.controller;

import com.example.microservicetutorial.customer.model.CustomerModel;
import com.example.microservicetutorial.customer.service.imp.CustomerServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerServiceImp customerService;

    @PostMapping
    public void registerCustomer(@RequestBody CustomerModel customerModel)
        {
            log.info("new Customer registration {}" , customerModel);
        }
}
