package com.vegnet.server.models.v1;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Farm {
    private Long farmId;
    private String registeredName;
    private String panNumber;
    private Address primaryFarmAddress;
    private List<FarmLocation> farmLocations;
    
}
