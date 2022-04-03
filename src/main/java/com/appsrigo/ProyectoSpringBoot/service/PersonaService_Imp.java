package com.appsrigo.ProyectoSpringBoot.service;

import com.appsrigo.ProyectoSpringBoot.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service // Este esteriotipo se utiliza cuando la clase va a ser de lógica de negocio
public class PersonaService_Imp implements IPersonaService{

    @Autowired // Con esto spring va a buscar una implementación de esta interfaz y ya no va a ser necesario instanciar esta clase cada vez que se llame
    @Qualifier("persona2") // Se le indica que implementación de esta interfaz se a utilizar, con esto spring sabe que PersonaRepo va a utilizar
    private IPersonaRepo personaRepo;

    @Override
    public void registrar(String nombre) {
        personaRepo.registrar(nombre);
    }
}
