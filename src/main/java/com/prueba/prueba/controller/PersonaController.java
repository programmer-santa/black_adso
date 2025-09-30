package com.prueba.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.prueba.persona.Persona;
import com.prueba.prueba.service.PersonaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/v1/aprendiz")
// @CrossOrigin(origins = "http://localhost:5173")
@CrossOrigin
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping()
    public void createPersona(@RequestBody Persona persona) {
        personaService.createPersona(persona);
    }

    @GetMapping()
    public List<Persona> verPersona() {
        return personaService.verPersonas();
    }    

    @GetMapping("/{id}")
    public Persona buscarPersonaId(@PathVariable Long id){
        return personaService.buscarPersonaId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable Long id){
        Persona persona = personaService.buscarPersonaId(id);
        if (persona != null) personaService.eliminarPersona(persona);
    }

    @PutMapping("/{id}")
    public Persona actualizar(@PathVariable Long id, @RequestBody Persona persona) {
        return personaService.actualizarPersona(id, persona);
    }
}
