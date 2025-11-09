package com.vegnet.server.models.v1.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vegnet.server.dtos.VegNetUserResponseDto;
import com.vegnet.server.dtos.VegNetUserSaveDto;
import com.vegnet.server.models.v1.Customer;
import com.vegnet.server.models.v1.VegNetUser;
import com.vegnet.server.services.CustomerService;

@RestController
@RequestMapping
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save-user")
    public ResponseEntity<VegNetUserResponseDto> saveCustomer(@RequestBody VegNetUserSaveDto userSaveDto)
            throws Exception {
        Customer newUser = new Customer(userSaveDto.userName(), userSaveDto.userEmail(), userSaveDto.userPassword(),
                userSaveDto.customerAddress(), userSaveDto.vegNetRoles());

        Customer savedCustomer = customerService.saveUser(newUser);

        VegNetUserResponseDto responseDto = new VegNetUserResponseDto(
                savedCustomer.getUserName(),
                savedCustomer.getUserEmail(),
                savedCustomer.getCustomerAddress());
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);

    }

    @GetMapping("/health")
    public String checkHealth() {
        return "Healthy.";
    }

}
