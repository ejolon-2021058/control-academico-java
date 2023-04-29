package com.esau.modelo;
import com.esau.manejador.*;
public class Usuario{   
    String nombre;
    int Id; 
	String clave;
    String rol;
  

    
   
   public Usuario(){
	 nombre="esau";
	 Id=2;
	 clave="2021";
	 rol="d";
	 
    } 
    public void setNombre(String nombre){
		this.nombre=nombre;
	}  
	public void setClave(String clave){
		this.clave=clave;
	}
	  public void setId(int id){
		this.Id=Id;
	}
	public void setRol(String rol){
	    this.rol=rol;
	}
    public String getNombre(){
		return nombre;
	}
	public int getId(){
		return Id;
	}
	public String getClave(){
		return clave;
	}
	public String getRol(){
		return rol;
	}
	
	
	
	
	

}