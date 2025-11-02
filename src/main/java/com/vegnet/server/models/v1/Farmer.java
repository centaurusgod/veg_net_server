package com.vegnet.server.models.v1;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Farmer extends VegNetUser {

    // might be performance defecient for updating object, in cases like a list contains 10,000 objects, we have to add a single item in the list
    private List<Farm> farms;

    public Farmer(Long userId, String userName, String userEmail, String userPassword){
        super(userId, userName, userEmail, userPassword);
    }
    
}
