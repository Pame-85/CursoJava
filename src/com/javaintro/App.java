package com.javaintro;

import com.javaintro.model.persona;
import com.javaintro.services.IPersonaService;
import com.javaintro.services.personaService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola,mundo!");
        persona  pers1 = new persona(1,"Pepe");
        IPersonaService personaService = new personaService();
        personaService.registrar(pers1);
    }
}
