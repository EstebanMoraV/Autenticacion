package com.grupo14.auth_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo14.auth_service.model.LoginRequest;
import com.grupo14.auth_service.model.LoginResponse;
import com.grupo14.auth_service.model.Usuario;
import com.grupo14.auth_service.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        Usuario usuario = authService.login(request.getCorreo(), request.getContrasena());

        if (usuario != null) {
            // Construimos el LoginResponse con los datos completos del usuario
            LoginResponse response = new LoginResponse(
                "Login exitoso",
                usuario.getRut(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getCorreo(),
                usuario.getEmpresa(),
                usuario.getCargo(),
                usuario.getDepto()
            );
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body("Credenciales inválidas");
        }
    }
}
