package com.vegnet.server.models.v1;

import java.util.List;

import org.hibernate.type.descriptor.jdbc.JsonAsStringJdbcType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity(name="farm")
@Getter
@Setter
public class Farm {
    @Id
    private Long farmId;

    private String registeredName;
    private String panNumber;

    @ManyToOne 
    @JoinColumn(name = "farmer_id", nullable = false)
    private Farmer farmer;

    @Convert(converter = AddressJsonConverter.class)
    private Address primaryFarmAddress;

    @OneToMany(mappedBy = "farm", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FarmLocation> farmLocations;
}
