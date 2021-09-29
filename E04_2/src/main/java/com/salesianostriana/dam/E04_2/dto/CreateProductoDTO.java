package com.salesianostriana.dam.E04_2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductoDTO {

    private String nombre;
    private double pvp;
    private String imagen;
    //private Categoria categoria;
}
