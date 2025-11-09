package com.vegnet.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vegnet.server.models.v1.Customer;
import com.vegnet.server.repository.CustomerRepository;

@Service
public class CustomerService extends AbstractVegNetUserService<Customer>{

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        super(customerRepository);
    }

}
