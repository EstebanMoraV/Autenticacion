package com.grupo14.auth_service.service;

import org.springframework.stereotype.Service;

import com.grupo14.auth_service.repository.UsuarioRepository;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;

    public AuthService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public boolean login(String correo, String contrasena) {
        return usuarioRepository.findByCorreo(correo)
                .map(usuario -> usuario.getContrasena().equals(contrasena))
                .orElse(false);
    }
}



