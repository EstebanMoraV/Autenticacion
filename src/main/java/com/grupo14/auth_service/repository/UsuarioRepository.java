package com.grupo14.auth_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo14.auth_service.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    // Buscar usuario por correo electrónico
    Optional<Usuario> findByCorreo(String correo);
}

