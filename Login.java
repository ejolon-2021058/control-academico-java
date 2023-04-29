package com.esau.vista;
import com.esau.manejador.*;
public class Login{
	Datos dato=new Datos();
	
	String usuario;
	String clave;
	
	ManejadorUsuario mu=new ManejadorUsuario();
	
	public void loginInicial(){
        System.out.println("----------LOGIN-----------");
		System.out.println("Ingresa Usuario:");
		usuario=dato.leerTexto();
		
		System.out.println("Ingrese Clave:");
		clave=dato.leerTexto();
		mu.logInicial(usuario,clave);
        System.out.println("-------------------------");
	}
    public void loginSecundario(){
		System.out.println("----------LOGIN-----------");
		System.out.println("Ingresa Usuario:");
		usuario=dato.leerTexto();
		
		System.out.println("Ingrese Clave:");
		clave=dato.leerTexto();
		mu.logSecundario(usuario,clave);
        System.out.println("-------------------------");
		
	}

	
	
	
	
	
	
}		

	
	
	
	
	
	
	
