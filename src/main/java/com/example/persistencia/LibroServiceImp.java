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
		return repositorio.save(l);
	}

	@Override
	public Libro editar(Libro l) {
		// TODO Auto-generated method stub
		return repositorio.save(l);
	}

	@Override
	public Libro eliminar(int id) {
		// TODO Auto-generated method stub
		List<Libro> l= repositorio.findAll();
		Libro eli = null;
		for (Libro lib: l) {
			if(lib.getId()==id) {
				eli=lib;
			}
		}
		repositorio.delete(eli);
		
		return eli;
	}

}
