package com.salesianostriana.dam.E04.controller;

import com.salesianostriana.dam.E04.repositorio.AlumnoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoRepository repository;

}
