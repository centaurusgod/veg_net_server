package com.vegnet.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vegnet.server.models.v1.Admin;

public interface AdminRepository  extends VegNetUserRepository<Admin>{
    
}
