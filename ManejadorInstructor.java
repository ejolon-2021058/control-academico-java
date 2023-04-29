package com.esau.manejador;
import java.util.ArrayList;
import com.esau.modelo.*;
import com.esau.vista.*;
import com.esau.manejador.*;
public class ManejadorInstructor{
	Datos dato=new Datos();
	int lenght;
	int codInstructor;
	String apellido;
	String direccion;
	int tel;
	String nombre;
	int contador;
	int falso;
	ArrayList<Instructor>listaInstructores =new ArrayList<>();
	
	public void agregarInstructor(String nombre,String apellido, int codInstructor, String direccion,int tel){listaInstructores.add(new Instructor(nombre,apellido, codInstructor, direccion, tel));
   
    
	 
   
    
	}
    public void reporteInstructores(){
	 System.out.println("-------------------------------");
	 System.out.println("Mostrando lista de Instructores");
	 for(Instructor i: listaInstructores){
		 System.out.println(i.getNombre()+" "+ i.getApellido()+" "+ i.getCodInstructor()+" "+i.getDireccion()+" "+i.getTel());
	    }
     
	}
	
	public void modificadorInstructor(String nombre,String apellido,int codInstructor,String direccion, int tel){
	 int opcion;
	  for(Instructor I:listaInstructores){
		 System.out.println("Ingrese el codigo del Instructor");
		 codInstructor=dato.ingresarNumero();
		   if(codInstructor==I.getCodInstructor()){
			 System.out.println("Que desea Modificar:");
			 System.out.println("1......Nombre");
			 System.out.println("2......Apellido");
			 System.out.println("3......Direccion");
			 System.out.println("4......Num. Telefono");
			   opcion=dato.ingresarNumero();
			   switch(opcion){
				   case 1:
				   System.out.println("Ingrese nuevo nombre:");
				   nombre=dato.leerTexto();
				   I.setNombre(nombre);
				   this.reporteInstructores();
				   break;
			       
				   case 2:
				   System.out.println("Ingrese nuevo Apellido:");
				   apellido=dato.leerTexto();
				   I.setApellido(apellido);
				   this.reporteInstructores();
				   break;
				    
				   case 3:
				   System.out.println("Ingrese nueva Direccion:");
				   direccion=dato.leerTexto();
				   I.setDireccion(direccion);
				   this.reporteInstructores();
				   break;
				   
				   case 4:
				   System.out.println("Ingrese nuevo numero de tel:");
				   tel=dato.ingresarNumero();
				   I.setTel(tel);
				   this.reporteInstructores();
				   break;
				   
				  
				  
				 
				 
				 
				}
			    
				}else{
                 falso++;
			}
            contador++;
	    }			
        if(falso==listaInstructores.size()){
	    System.out.println("Instructor inexistente");
		}
     
	}

    public void eliminarInstructor(String nombre,String apellido,int codInstructor,String direccion, int tel){
	   int opcion;
	    for(Instructor I:listaInstructores){ 
		  System.out.println("Ingrese el codigo del Instructor");
	      codInstructor=dato.ingresarNumero();
	      if(codInstructor==I.getCodInstructor()){
		      System.out.println("Elija la opcion 1 para eliminar:");
			 opcion=dato.ingresarNumero();
		     switch(opcion){
			     case 1:
			     listaInstructores.remove(nombre);
			      System.out.println("Eliminando Instructor");
			      break;
		        }
	            }else{
		        falso++;	
            }
	        
		 
		 
	    }
	    if(falso==listaInstructores.size()){
	    System.out.println("Instructor inexistente");
		}
     
	  	
		
	}










}	
		

   
	
	
	
	

	
	
	

