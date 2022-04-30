package com.prueba_jpa.prueba_jpa.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    public void setApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

}
