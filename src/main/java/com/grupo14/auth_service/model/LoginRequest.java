package com.grupo14.auth_service.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String correo;
    private String contrasena;
}
