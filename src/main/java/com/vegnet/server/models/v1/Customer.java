package com.vegnet.server.models.v1;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Customer extends VegNetUser {
    
}
