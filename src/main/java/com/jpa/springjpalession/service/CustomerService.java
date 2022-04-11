package com.jpa.springjpalession.service;

import com.jpa.springjpalession.model.Customer;
import com.jpa.springjpalession.repository.CustomerRepository;
import com.jpa.springjpalession.request.CustomerRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public Customer save(CustomerRequest customerRequest) {

        return customerRepository.save(
                Customer
                        .builder()
                        .firstName(customerRequest.getFirstName())
                        .lastName(customerRequest.getLastName())
                        .email(customerRequest.getEmail())
                        .phone(customerRequest.getPhone())
                        .build()
        );
    }

    public List<Customer> findCustomers() {
        return customerRepository.findAll();
    }

}
