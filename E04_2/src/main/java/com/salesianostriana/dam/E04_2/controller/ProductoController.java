package com.salesianostriana.dam.E04_2.controller;


import com.salesianostriana.dam.E04_2.modelo.CategoriaRepository;
import com.salesianostriana.dam.E04_2.modelo.Producto;
import com.salesianostriana.dam.E04_2.modelo.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/producto")

public class ProductoController {

    private CategoriaRepository repository;
    private ProductoRepository prepository;

    @GetMapping("/")
    public ResponseEntity <List<Producto>> findAll(){

        return ResponseEntity
                .ok()
                .body(prepository.findAll());
    }
}
