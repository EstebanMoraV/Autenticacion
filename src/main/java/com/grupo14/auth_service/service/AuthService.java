package com.grupo14.auth_service.service;

import org.springframework.stereotype.Service;

import com.grupo14.auth_service.model.Usuario;
import com.grupo14.auth_service.repository.UsuarioRepository;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;

    public AuthService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    /**
     * Busca un usuario por correo y contraseña.
     * @return el Usuario completo si las credenciales son válidas, o null si no lo son.
     */
    public Usuario login(String correo, String contrasena) {
        return usuarioRepository.findByCorreoAndContrasena(correo, contrasena)
                .orElse(null);
    }
}
