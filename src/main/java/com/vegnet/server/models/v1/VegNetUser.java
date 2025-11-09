package com.vegnet.server.models.v1;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public abstract class VegNetUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    @Column(unique = true)
    private String userName;

    @Column(unique = true)
    private String userEmail;

    @Nonnull
    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = true)
    @Convert(converter = AddressJsonConverter.class)
    private Address customerAddress;
    
    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private VegNetRole vegNetRoles = VegNetRole.ROLE_CUSTOMER;


    @PrePersist
    private void isUserNameOrEmailNotNull(){
        boolean valid = this.userName!=null || this.userEmail!=null;
        if(!valid){
            throw new IllegalCallerException("User creation failed. At least username or an email is required!");
        }
    }
    
}
