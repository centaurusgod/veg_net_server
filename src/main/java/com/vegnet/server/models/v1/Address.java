package com.vegnet.server.models.v1;

import org.springframework.beans.factory.parsing.Location;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public final class Address {
    private final String streetAddressLine1;
    private final String streetAddressLine2;
    
    private final String city;
    private final String stateOrProvince;
    private final String country;
    
    private final String contactPhoneNumber;
    
    private final LocationCordinates locationCordinates;
}
