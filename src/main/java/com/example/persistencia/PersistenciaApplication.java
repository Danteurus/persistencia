package com.example.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/getOne")
	public Libro ObtenerUno(@RequestParam(value = "id") int id) {
		List<Libro> l= service.listar();
		Libro regresar = null;
		for (Libro lib: l) {
			if(lib.getId()==id) {
				regresar=lib;
			}
		}
		return regresar;
	}

	 @GetMapping("/add")
	public Libro Agregar(@RequestParam(value = "titulo") String titulo, 
			@RequestParam(value = "autor") String autor,
			@RequestParam(value = "descripcion") String descripcion)
	{
		Libro l = new Libro(titulo,autor,descripcion);
		
		return service.agregar(l);
	}
	
	@GetMapping("/delete")
	public Libro Eliminar(@RequestParam(value="id")int id) {
		
		return service.eliminar(id);
	}

	@GetMapping("/edit")
	public Libro Editar(@RequestParam(value="id")int id, 
			@RequestParam(value="titulo")String titulo, 
			@RequestParam(value="autor")String autor,
			@RequestParam(value="descripcion")String descripcion) {
		List<Libro> l= service.listar();
		Libro regresar = null;
		Libro editado = null;
		for (Libro lib: l) {
			if(lib.getId()==id) {
				regresar=lib;
			}
		}
		
		if(regresar != null) {
			service.eliminar(id);
			editado = new Libro(id,titulo,autor,descripcion);
			service.editar(editado);
		}
		
		return editado;
	}
}
