package com.salesianostriana.dam.E04_2.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Producto {

    private Long id;

    private String nombre;
    private double desc;
    private double pvp;
    private List<String> imagenes;


    @ManyToOne
    private Categoria categoria;

}
