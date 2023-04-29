package com.esau.manejador;
import java.util.ArrayList;
import com.esau.modelo.*;
import com.esau.vista.*;
import com.esau.manejador.*;
public class ManejadorMateria{
   Datos dato=new Datos();
   int contador;
   int falso;
   ArrayList<Materia>Materias =new ArrayList<>();
   
   public void agregarMateria(String nombre,int codMateria, String descripcion){Materias.add(new Materia(nombre,codMateria,descripcion));
   

	 
   
    }

   public void reporteMateria(){
	 System.out.println("Mostrando Datos de Materia");
	 for(Materia m: Materias){
		 System.out.println(m.getNombre()+" "+ m.getCodMateria()+" "+ m.getDescripcion());
	    }
     
	}
	
	public void modificadorMateria(String nombre, int codMateria, String descripcion){
	 int opcion;
	 
 	 for(Materia M: Materias){
		 System.out.println("Ingrese el codigo de la Materia que desea modificar:");
		 codMateria=dato.ingresarNumero();
		  if(codMateria==M.getCodMateria()){
			System.out.println("Que desea Modificar:");
			System.out.println("1......Nombre");
			System.out.println("2......Descripcion");
			   opcion=dato.ingresarNumero();
			   switch(opcion){
				   case 1:
				   System.out.println("Ingrese nuevo nombre:");
				   nombre=dato.leerTexto();
				   M.setNombre(nombre);
				   this.reporteMateria();
				   break;
			       
				   case 2:
				   System.out.println("Ingrese nueva Descripcion:");
				   descripcion=dato.leerTexto();
				   M.setDescripcion(descripcion);
				   this.reporteMateria();
				   break;
				 
				 
				}
			    
				}else{
                 falso++;
			}
            contador++;
	    }			
        if(falso==Materias.size()){
	    System.out.println("Materia Inexistente");
		
     
	}
    }

    public void eliminarMateria(String nombre,int codMateria,String descripcion){
		int opcion;
	   for(Materia M: Materias){ 
		  System.out.println("Ingrese el codigo de la Materia");
	      codMateria=dato.ingresarNumero();
	      if(codMateria==M.getCodMateria()){
		      System.out.println("Elija la opcion 1 para eliminar:");
			 opcion=dato.ingresarNumero();
		     switch(opcion){
			     case 1:
			      Materias.remove(nombre);
			      System.out.println("Eliminando Materia");
   				  break;
		        }
	            }else{
		        falso++;	
            }
	        
		 
		 
	    }
	    if(falso==Materias.size()){
	    System.out.println("Materia inexistente");
		}
		
		
		
		
	}
   
   	
	
	

	
	
	
	
	
}