package com.salesianostriana.dam.E04.controller;

import com.salesianostriana.dam.E04.dto.GetAlumnoDto;
import com.salesianostriana.dam.E04.modelo.Alumno;
import com.salesianostriana.dam.E04.repositorio.AlumnoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoRepository repository;

    @GetMapping("/")
    public ResponseEntity<List<Alumno>> findAll() {

        return ResponseEntity
                .ok()
                .body(repository.findAll());

    }

}
