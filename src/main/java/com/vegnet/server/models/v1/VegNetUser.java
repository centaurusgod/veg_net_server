package com.vegnet.server.models.v1;

import java.time.Instant;
import java.util.Date;

import jakarta.annotation.Nullable;
import jakarta.persistence.Convert;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class VegNetUser {
    @Id
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;

    @Convert(converter = AddressJsonConverter.class)
    private Address customerAddress;
    
    private VegNetRole vegNetRoles;
    
}
