package com.example.persistencia;

import java.util.Map;

public interface RedisRepository {
	Map<String, Libro> findAll();
	Libro findById(int id);
	Libro save(Libro l);
	Libro delete(int id);
}
