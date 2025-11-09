package com.vegnet.server.models.v1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class Customer extends VegNetUser {
    
    public Customer(String userName, String userEmail, String userPassword, Address userAddress, VegNetRole vegNetRole){
        this.setUserName(userName);
        this.setUserEmail(userEmail);
        this.setUserPassword(userPassword);
        this.setCustomerAddress(userAddress);
        this.setVegNetRoles(vegNetRole);
    }
}
