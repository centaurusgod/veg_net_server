package com.vegnet.server.models.v1;


import jakarta.persistence.Convert;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public  class Address {
    private  String streetAddressLine1;
    private  String streetAddressLine2;
    
    private  String city;
    private  String stateOrProvince;
    private  String country;
    
    private  String contactPhoneNumber;
    
    @Convert(converter = LocationCoordinatesJsonConverter.class)
    private  LocationCordinates locationCordinates;
}
