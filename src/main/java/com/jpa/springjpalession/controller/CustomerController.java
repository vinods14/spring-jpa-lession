package com.jpa.springjpalession.controller;

import com.jpa.springjpalession.request.CustomerRequest;
import com.jpa.springjpalession.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class CustomerController {

    private CustomerService customerService;

    @PostMapping(value = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createCustomer(@RequestBody CustomerRequest customerRequest) {
        customerService.save(customerRequest);
        return new ResponseEntity<>("Customer created successfully!", HttpStatus.OK);
    }

    @GetMapping(value = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findCustomers() {
        return new ResponseEntity<>(customerService.findCustomers(), HttpStatus.OK);
    }
}
