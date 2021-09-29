package com.salesianostriana.dam.E04.dto;

import com.salesianostriana.dam.E04.modelo.Curso;
import com.salesianostriana.dam.E04.modelo.Direccion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder

public class GetAlumnoDto {
    private String nombre;
    private String apellidos;
    private String email;
    private Direccion direccion;
    private Curso curso;
}
