package com.example.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
