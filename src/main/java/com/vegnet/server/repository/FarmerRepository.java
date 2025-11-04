package com.vegnet.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vegnet.server.models.v1.Farmer;

public interface FarmerRepository extends VegNetUserRepository<Farmer> {
    
}
