package com.appsrigo.ProyectoSpringBoot.repository;

import com.sun.istack.internal.logging.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository // Este esteriotipo se utiliza cuando la clase va a ser de acceso a datos
@Qualifier("persona1") // Se agrega este esteriotipo para identificar que va a ser una segunda instancia de la clase,
// Esto se hace por si es que hay más de una implementación de la interfaz
public class PersonaRepo1_Imp implements IPersonaRepo {

    private final Logger LOG = Logger.getLogger(PersonaRepo1_Imp.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("PersonaRepo1_Imp: " + nombre);
    }
}
