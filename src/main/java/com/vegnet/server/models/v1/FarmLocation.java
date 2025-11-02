package com.vegnet.server.models.v1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FarmLocation {
    private Long farmLocationId;
    private Farm farm;
    private Address farmAddress;
    private LocationCordinates locationCordinates;
    private boolean isPickUpPoint = true;
    
}
