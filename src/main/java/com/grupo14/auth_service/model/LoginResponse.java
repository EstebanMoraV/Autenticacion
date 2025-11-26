package com.grupo14.auth_service.model;

import lombok.Data;

@Data
public class LoginResponse {
    private String mensaje;
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;
    private String empresa;
    private String cargo;
    private String depto;

    public LoginResponse(String mensaje, String rut, String nombre, String apellido,
                         String correo, String empresa, String cargo, String depto) {
        this.mensaje = mensaje;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.empresa = empresa;
        this.cargo = cargo;
        this.depto = depto;
    }
}
