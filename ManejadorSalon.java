package com.esau.manejador;
import java.util.ArrayList;
import com.esau.modelo.*;
import com.esau.vista.*;
import com.esau.manejador.*;
public class ManejadorSalon{
	Datos dato=new Datos();
	int lenght;
	int codSalon;
	String nombre;
	int contador;
	int falso;
	ArrayList<Salon>salones =new ArrayList<>();
	
	public void agregarSalon(int codSalon,String nombre,int cantidad){salones.add(new Salon(codSalon,nombre,cantidad));
   
    
	}
	
	public void reportesalones(){
	 System.out.println("Mostrando lista de Salones");
	 for(Salon S: salones){
		 System.out.println(S.getCodSalon()+" "+S.getNombre()+" "+S.getCantidad());
	    }
     
	}
	
    public void modificadorSalon(int codSalon,String nombre,int cantidad){
	 int opcion;
	 
 	 for(Salon S:salones){
		 System.out.println("Ingrese el codigo del salon");
		 codSalon=dato.ingresarNumero();
		  if(codSalon==S.getCodSalon()){
			System.out.println("Que desea Modificar:");
			System.out.println("1......Nombre");
			System.out.println("2......Cantidad");
			   opcion=dato.ingresarNumero();
			   switch(opcion){
				   case 1:
				   System.out.println("Ingrese nuevo nombre:");
				   nombre=dato.leerTexto();
				   S.setNombre(nombre);
				   this.reportesalones();
				   break;
			       
				   case 2:
				   System.out.println("Ingrese nueva Cantidad:");
				   cantidad=dato.ingresarNumero();
				   S.setCantidad(cantidad);
				   this.reportesalones();
				   break;
				 
				 
				}
			    
				}else{
                 falso++;
			}
            contador++;
	    }			
        if(falso==salones.size()){
	    System.out.println("Salon inexistente");
		
     
	}
    }
}