package com.salesianostriana.dam.E04.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder

public class GetAlumnoDto {
    private String nombre;
    private String email;
    private String curso;
    /*private Direccion direccion;
    private Curso curso;*/
}
