package com.grupo14.auth_service.model;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private String tipo = "Bearer";

    public LoginResponse(String token) {
        this.token = token;
    }
}


