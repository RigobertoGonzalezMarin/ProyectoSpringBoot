package com.appsrigo.ProyectoSpringBoot;

import com.appsrigo.ProyectoSpringBoot.models.Persona;
import com.appsrigo.ProyectoSpringBoot.service.IPersonaService;
import com.appsrigo.ProyectoSpringBoot.service.PersonaService_Imp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProyectoSpringBootApplication implements CommandLineRunner {

    public static List<Persona> personaList = new ArrayList<>();

	private final Logger LOG= LoggerFactory.getLogger(ProyectoSpringBootApplication.class);
	@Autowired
	private IPersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//LOG.info("Hola mundo");
		//personaService = new PersonaService_Imp(); // Con la inyección de dependencias ya no hace falta hacer esto, ya que spring boot se encarga de buscar la implementación de la interfaz
		personaService.registrar("Rigo");
	}

	private void prueba(){
		// Se encontro una nueva función para subir al repositorio Git
	}

	private String hola() {
		return "";
	}
}
