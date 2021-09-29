package com.salesianostriana.dam.E04_2.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Categoria {

    private Long id;
    private String nombre;
}
