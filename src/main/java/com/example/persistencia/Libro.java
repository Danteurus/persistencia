package com.example.persistencia;

import javax.persistence.*;

@Entity
@Table(name = "Libro")
public class Libro {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String titulo;
	@Column
	private String autor;
	@Column
	private String descripcion;
	
	public Libro(String titulo, String autor, String descripcion) {
		// TODO Auto-generated constructor stub
		this.titulo=titulo;
		this.autor=autor;
		this.descripcion=descripcion;
	}
	
	public Libro(int id, String titulo, String autor, String descripcion) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.titulo=titulo;
		this.autor=autor;
		this.descripcion=descripcion;
	}
	
	public Libro() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
