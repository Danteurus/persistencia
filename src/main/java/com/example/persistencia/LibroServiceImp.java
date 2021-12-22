package com.example.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroRepositorio repositorio;
	
	@Override
	public List<Libro> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Libro obtenerUno(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro agregar(Libro l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro editar(Libro l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
