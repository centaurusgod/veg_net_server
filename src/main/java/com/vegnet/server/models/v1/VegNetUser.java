package com.vegnet.server.models.v1;

import java.time.Instant;
import java.util.Date;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class VegNetUser {

    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    
    
}
