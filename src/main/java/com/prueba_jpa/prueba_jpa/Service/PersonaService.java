package com.prueba_jpa.prueba_jpa.Service;

import com.prueba_jpa.prueba_jpa.Model.Persona;
import com.prueba_jpa.prueba_jpa.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository persoRepositoty;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepositoty.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepositoty.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepositoty.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepositoty.findById(id).orElse(null);
    return perso;
    }

    @Override
    public void updatePersona(Persona perso) {
         persoRepositoty.save(perso);
    }
    
}