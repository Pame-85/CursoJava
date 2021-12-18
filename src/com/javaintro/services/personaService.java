package com.javaintro.services;

import com.javaintro.model.persona;

public class personaService implements IPersonaService {

    @Override
    public void registrar(persona persona) {
        System.out.println (persona + "registrada");
        
    }
    
}
