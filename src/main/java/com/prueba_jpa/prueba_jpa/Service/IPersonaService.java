package com.prueba_jpa.prueba_jpa.Service;

import com.prueba_jpa.prueba_jpa.Model.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas ();
    
    public void savePersona (Persona perso);
    
    public void updatePersona (Persona perso);
    
    public void deletePersona (Long id);
    
    public Persona findPersona (Long id);
           
}
