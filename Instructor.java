package com.esau.modelo;	
public class Instructor{
	String nombre;
	String apellido;
	int CodInstructor;
	int tel;
	String direccion;
    
	public Instructor(String nombre,String apellido,int CodInstructor,String direccion,int tel){
	    this.nombre=nombre;
     	this.apellido=apellido;
		this.CodInstructor=CodInstructor;
		this.tel=tel;
		this.direccion=direccion;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
    public void setApellido(String apellido){
        this.apellido=apellido;
 	}		
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}	
	public void setTel(int tel){
		this.tel=tel;
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public String getDireccion(){
		return direccion;
	}
	public int getCodInstructor(){
		return CodInstructor;
	}
	public int getTel(){
		return tel;
	}
	
	
		
	
}
	
	
	
