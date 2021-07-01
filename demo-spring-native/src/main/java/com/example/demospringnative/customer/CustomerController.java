package com.example.demospringnative.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

//    @Autowired
//    private CustomerRepository repository;
//
//    public CustomerController() {
//    }
//
//    @GetMapping
//    public Iterable<Customer> getList() {
//        return repository.findAll();
//    }
}
