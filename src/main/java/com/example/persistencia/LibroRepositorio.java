package com.example.persistencia;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface LibroRepositorio extends Repository<Libro, Integer>{
	List<Libro>findAll();
	Libro save(Libro l);
	void delete(Libro l);
}
