package com.amazingcode.in.example.service;

import com.amazingcode.in.example.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> list = new ArrayList<>();

    public List<Customer> getEmployees(){
        list.clear();
        list.add(new Customer(1, "Vaibhav", "+91 7498260558"));
        list.add(new Customer(2, "Bhagwat", "+91 8498260559"));
        list.add(new Customer(3, "Cupcake", "+91 9498260550"));
        return list;
    }
}
