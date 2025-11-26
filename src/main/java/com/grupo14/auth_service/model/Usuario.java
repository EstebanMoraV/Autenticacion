package com.grupo14.auth_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @Column(length = 12, nullable = false, unique = true)
    private String rut; 
    // Rut como clave primaria.

    @Column(nullable = false, unique = true, length = 100)
    private String correo;
    // Correo electrónico, obligatorio y único.

    @Column(nullable = false, length = 255)
    private String contrasena;
    // Contraseña encriptada (ej. BCrypt).
}

