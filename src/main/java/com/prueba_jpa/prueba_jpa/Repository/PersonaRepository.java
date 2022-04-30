package com.prueba_jpa.prueba_jpa.Repository;

import com.prueba_jpa.prueba_jpa.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
