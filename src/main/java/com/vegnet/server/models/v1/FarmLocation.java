package com.vegnet.server.models.v1;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FarmLocation {
    @Id
    private Long farmLocationId;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;

    @Convert(converter = AddressJsonConverter.class)
    private Address farmAddress;
    
    private boolean isPickUpPoint = true;
    
}
