package com.appsrigo.ProyectoSpringBoot.rest;

import com.appsrigo.ProyectoSpringBoot.ProyectoSpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.appsrigo.ProyectoSpringBoot.models.Persona;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("persona")
public class RestDemoController {

    @GetMapping("/consultarPersona")
    public Persona getPersona(){
        Persona persona = new Persona();
        persona.setEdad((byte)20);
        persona.setNombre("Juan");
        return persona;
    }

    @GetMapping("/consultarPersonas")
    public List<Persona> getPersonas(){
        return ProyectoSpringBootApplication.personaList;
    }

    @PostMapping("/crearPersona")
    public void crearPersona(@RequestBody Persona p){ // La anotación @RequestBody se encarga de convertir el objeto enviado a un clase de Java, en este caso la clase Persona
        ProyectoSpringBootApplication.personaList.add(p);
    }
}
