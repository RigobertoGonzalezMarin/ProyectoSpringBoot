package com.appsrigo.ProyectoSpringBoot.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona2") // Se agrega este esteriotipo para identificar que va a ser una segunda instancia de la clase,
// Esto se hace por si es que hay más de una implementación de la interfaz
public class PersonaRepo2_Imp implements IPersonaRepo {

    private static Logger LOG = LoggerFactory.getLogger(PersonaRepo2_Imp.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("PersonaRepo2_Imp: " + nombre);
    }
}
