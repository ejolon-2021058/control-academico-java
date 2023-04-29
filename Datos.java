package com.esau.manejador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import com.esau.manejador.*;
public class Datos{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	
	public String leerTexto(){
		String texto=null;
		try{
			texto=bf.readLine();
		}catch(IOException ioe){
			System.out.println("Error de IO");
			System.exit(1);
		}
	    return texto;
	}
	
	
	public int ingresarNumero(){
		int numero=0;
	 try{
		numero=Integer.parseInt(bf.readLine());
	 }catch(IOException ioe){
		System.out.println("Error de entrada");
		System.exit(1);
	 }
	 return numero;
	 
	}
	

}