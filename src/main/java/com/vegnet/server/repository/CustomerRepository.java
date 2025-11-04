package com.vegnet.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.simple.SimpleJdbcCallOperations;

import com.vegnet.server.models.v1.Customer;
import com.vegnet.server.models.v1.VegNetUser;

public interface CustomerRepository extends VegNetUserRepository<Customer>{

}
