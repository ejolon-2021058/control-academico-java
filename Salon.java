package com.esau.modelo;
public class Salon{
	int codSalon;
	String nombre;
	int cantidad;
	
	public Salon(int codSalon,String nombre ,int cantidad){
		this.codSalon=codSalon;
		this.nombre=nombre;
		this.cantidad=cantidad;
	}
	private void setCodSalon(int codSalon){
		this.codSalon=codSalon;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	public int getCodSalon(){
		return codSalon;
	}
	public String getNombre(){
		return nombre;
	}
	public int getCantidad(){
		return cantidad;
	}
	
	
	
	

	
}