package com.vegnet.server.dtos;

import com.vegnet.server.models.v1.Address;
import com.vegnet.server.models.v1.VegNetRole;

public record VegNetUserSaveDto(String userName, String userEmail, String userPassword, Address customerAddress, VegNetRole vegNetRoles) {
    
}
