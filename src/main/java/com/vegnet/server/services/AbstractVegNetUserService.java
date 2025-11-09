package com.vegnet.server.services;

import java.util.Optional;

import com.vegnet.server.models.v1.VegNetUser;
import com.vegnet.server.repository.VegNetUserRepository;

public abstract class AbstractVegNetUserService<T extends VegNetUser > {
    private final VegNetUserRepository<T>  vegNetUserRepository;
    
    public AbstractVegNetUserService(VegNetUserRepository<T>  vegNetUserRepository){
        this.vegNetUserRepository = vegNetUserRepository;
    }

    public T saveUser(T user) throws Exception{
        try {
            T newUser = vegNetUserRepository.save(user);
            return newUser;
            
        } catch (Exception e) {
            throw new Exception("Unable to save user. Reason: "+e.getMessage());
        }
    }
}
