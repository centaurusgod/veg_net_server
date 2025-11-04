package com.vegnet.server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vegnet.server.models.v1.VegNetUser;

public interface VegNetUserRepository<T extends VegNetUser> extends JpaRepository<T, Long> {
   // Optional<T> findByUserNameOrEmail(String email, String userName);
}
