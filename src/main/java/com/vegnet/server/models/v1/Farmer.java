package com.vegnet.server.models.v1;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "farmer")
@Getter
@Setter
@NoArgsConstructor
public class Farmer extends VegNetUser {

    // might be performance defecient for updating object, in cases like a list
    // contains 10,000 objects, we have to add a single item in the list
    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Farm> farms;

    public Farmer(String userName, String userEmail, String userPassword, Address farmerAddress,
            VegNetRole vegNetRole) {
        this.setUserName(userName);
        this.setUserEmail(userEmail);
        this.setUserPassword(userPassword);
        this.setCustomerAddress(farmerAddress);
        this.setVegNetRoles(vegNetRole);
    }

}
