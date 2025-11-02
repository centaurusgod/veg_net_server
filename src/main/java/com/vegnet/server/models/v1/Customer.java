package com.vegnet.server.models.v1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Customer extends VegNetUser {
    // default address, order should inherit or override the address
    private Address customerAddress;

    public Customer(Long userId, String userName, String userEmail, String userPassword){
        super(userId, userName, userEmail, userPassword);
    }
    
}
