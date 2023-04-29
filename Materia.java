package com.esau.modelo;
import com.esau.manejador.*;
import com.esau.vista.*;
public class Materia{
    String nombre;
	int codMateria;
	String descripcion;
	
	
	public Materia(String nombre, int codMateria, String descripcion){
		this.nombre=nombre;
		this.codMateria=codMateria;
	    this.descripcion=descripcion;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setCodMateria(int codMateria){
		this.codMateria=codMateria;
	}
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
	
	public String getNombre(){
		return nombre;
	}
	public int getCodMateria(){
		return codMateria;
	}
	public String getDescripcion(){
		return descripcion;
	}
	
	
	
	

	
	
}