package com.example.persistencia;

import java.util.List;

public interface LibroService {
	List<Libro>listar();
	Libro obtenerUno(int id);
	Libro agregar(Libro l);
	Libro editar(Libro l);
	Libro eliminar(int id);
}
