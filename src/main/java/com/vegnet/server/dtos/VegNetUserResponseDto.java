package com.vegnet.server.dtos;

import com.vegnet.server.models.v1.Address;

public record VegNetUserResponseDto(String userName, String userEmail, Address customerAddress) {
    
}
