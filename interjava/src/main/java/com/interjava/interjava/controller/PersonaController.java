package com.interjava.interjava.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.interjava.interjava.dto.Persona;
import com.interjava.interjava.services.PersonaService;
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "esta viva XXX";
    }
    
    @RequestMapping(value = "getPersona", method = RequestMethod.POST)
    public Persona createClient(@RequestBody Persona persona){
        return personaService.validaciones(persona);
    }
    

   

}
