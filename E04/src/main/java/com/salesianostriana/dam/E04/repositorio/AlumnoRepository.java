package com.salesianostriana.dam.E04.repositorio;

import com.salesianostriana.dam.E04.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository <Alumno,Long> {
}
