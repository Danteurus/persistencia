package com.example.persistencia;

import java.util.List;
import java.util.Map;

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
	private LibroRepository lirepo;
	
	public static void main(String[] args) {
		SpringApplication.run(PersistenciaApplication.class, args);
	}
	
	@GetMapping("/getAll")
	public List<Libro> Listar()
	{
		return service.listar();
	}
	
	@GetMapping("/getAllR")
	public Map<String, Libro> findAllR(){
		return lirepo.findAll();
	}
	
	@GetMapping("/getOne")
	public Libro ObtenerUno(@RequestParam(value = "id") int id) {
		Libro regresar = service.obtenerUno(id);
		return regresar;
	}
	
	@GetMapping("/getOneR")
	public Libro UnoR(@RequestParam(value= "id") int id) {
		return lirepo.findById(id);
	}

	 @GetMapping("/add")
	public Libro Agregar(@RequestParam(value = "titulo") String titulo, 
			@RequestParam(value = "autor") String autor,
			@RequestParam(value = "descripcion") String descripcion)
	{
		Libro l = new Libro(titulo,autor,descripcion);
		
		return service.agregar(l);
	}
	 
	 @GetMapping("/addR")
		public Libro AgregarR(@RequestParam(value="id")int id,
				@RequestParam(value = "titulo") String titulo, 
				@RequestParam(value = "autor") String autor,
				@RequestParam(value = "descripcion") String descripcion)
		{
			Libro l = new Libro(id,titulo,autor,descripcion);
			
			return lirepo.save(l);
		}
	
	@GetMapping("/delete")
	public Libro Eliminar(@RequestParam(value="id")int id) {
		
		return service.eliminar(id);
	}
	
	@GetMapping("/deleteR")
	public Libro EliminarR(@RequestParam(value="id")int id) {
		return lirepo.delete(id);
	}

	@GetMapping("/edit")
	public Libro Editar(@RequestParam(value="id")int id, 
			@RequestParam(value="titulo")String titulo, 
			@RequestParam(value="autor")String autor,
			@RequestParam(value="descripcion")String descripcion) {
		Libro regresar = service.obtenerUno(id);
		
		if(regresar != null) {
			regresar.setTitulo(titulo);
			regresar.setAutor(autor);
			regresar.setDescripcion(descripcion);
			service.editar(regresar);
		}
		
		return regresar;
	}
	
	@GetMapping("/editR")
	public Libro EditarR(@RequestParam(value="id")int id, 
			@RequestParam(value="titulo")String titulo, 
			@RequestParam(value="autor")String autor,
			@RequestParam(value="descripcion")String descripcion) {
		Libro regresar = lirepo.findById(id);
		
		if(regresar != null) {
			regresar.setTitulo(titulo);
			regresar.setAutor(autor);
			regresar.setDescripcion(descripcion);
			lirepo.save(regresar);
		}
		
		return regresar;
	}
}
