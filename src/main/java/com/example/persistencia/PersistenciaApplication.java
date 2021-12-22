package com.example.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.Backend.GetMapping;
import main.java.Backend.Personas;

@SpringBootApplication
@RestController
public class PersistenciaApplication {
	@Autowired 
	LibroService service;
	
	public static void main(String[] args) {
		SpringApplication.run(PersistenciaApplication.class, args);
	}
	
	@GetMapping("/getAll")
	public List<Libro> Listar()
	{
		return service.listar();
	}
	

}
