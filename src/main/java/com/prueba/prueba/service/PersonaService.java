package com.prueba.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.persona.Persona;
import com.prueba.prueba.repository.PersonaRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public void createPersona(Persona persona){
        personaRepository.save(persona);
    }    

    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }

    @Transactional
    public Persona buscarPersonaId(Long id){
        return personaRepository.findById(id).orElse(null);
    }

    @Transactional
    public void eliminarPersona(Persona persona){
        personaRepository.delete(persona);
    }

    @Transactional
    public Persona actualizarPersona(Long id, Persona persona) {
        persona.setId(id);                 // asegura que se actualiza el recurso {id}
        return personaRepository.save(persona);
    }

}
