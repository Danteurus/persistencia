package com.example.persistencia;

import java.util.Map;
import java.util.UUID;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

public class LibroRepository implements RedisRepository{
	
	private static final String Key = "Libro";
	
	private RedisTemplate<String, Libro> redisTemplate;
	private HashOperations hashOperations;
	
	public LibroRepository(RedisTemplate<String, Libro> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	@Override
	public Map<String, Libro> findAll() {
		// TODO Auto-generated method stub
		return hashOperations.entries(Key);
	}

	@Override
	public Libro findById(int id) {
		// TODO Auto-generated method stub
		Map<String,Libro> prueba= hashOperations.entries(Key);
		Libro l = null;
		for (Map.Entry<String, Libro> entry : prueba.entrySet()) {
			Libro busca=entry.getValue();
			if (busca.getId()==id) {
				l=busca;
			}
		}
		return l;
	}

	@Override
	public Libro save(Libro l) {
		// TODO Auto-generated method stub
		hashOperations.put(Key, UUID.randomUUID().toString(), l);
		return l;
	}

	@Override
	public Libro delete(int id) {
		// TODO Auto-generated method stub
		Libro l = findById(id);
		if (l != null) {
			Map<String,Libro> prueba= hashOperations.entries(Key);
			String Id= null;
			for (Map.Entry<String, Libro> entry : prueba.entrySet()) {
				String key= entry.getKey();
				Libro busca=entry.getValue();
				if (busca.getId()==id) {
					Id=key;
				}
			}
			hashOperations.delete(Key, Id);
		}
		return l;
	}

}
