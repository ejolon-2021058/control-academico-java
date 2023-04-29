package com.esau.vista;
import com.esau.modelo.*;
import com.esau.manejador.*;
import com.esau.manejador.Datos;
public class PantallaDirector{
	ManejadorMateria mMateria=new ManejadorMateria();
	ManejadorInstructor mInstructor=new ManejadorInstructor();
	ManejadorSalon mSalon=new ManejadorSalon();
	Datos dato=new Datos();
    int codMateria;
	int codInstructor;
	int opcion;
	int tel;
	int codSalon;
	int cantidad;
	String apellido;
	String direccion;
	String nombre;
	String descripcion;
	String s;
	String n;
    
	public void menuPrincipal(){
	  System.out.println("-----Menu Director----");
	  System.out.println("1.....Materia");
	  System.out.println("2.....Instructor");
	  System.out.println("3.....Salones");
	  System.out.println("4.....Asignar");
	  System.out.println("5.....Regresar");
	  opcion=dato.ingresarNumero();
	  switch(opcion){
	        case 1:
			 
            this.menuMateria();
			break;
	     
            case 2:
 		     
			this.menuInstructor();
			break;
		 
		    case 3:
			  
			this.menuSalones();
			break;
		   
		 
		 
		 
		}
	}
	public void menuMateria(){
		System.out.println("-----Menu Materia------");
		System.out.println("1.....Agregar Materia");
		System.out.println("2.....Modificar");
		System.out.println("3.....Eliminar");
		System.out.println("4.....Regresar");
	    opcion=dato.ingresarNumero();
		switch(opcion){
			case 1:
			do{
			codMateria++;
			System.out.println("        Ingrese Datos:            ");
			System.out.println("Ingrese nombre de la Materia");
            nombre=dato.leerTexto();
			System.out.println("Ingrese la descripcion del curso");
		    descripcion=dato.leerTexto();
            mMateria.agregarMateria(nombre,codMateria,descripcion);
			mMateria.reporteMateria();
			System.out.println("¿Desea agregar otra Materia?");
		    s=dato.leerTexto();
			}while(s.equals("si"));
			do{
			  this.menuPrincipal();
			}while(n.equals("no"));
		 	break;
		    case 2:
			do{
     		 System.out.println("-------Modificar datos:--------");
			 mMateria.modificadorMateria(nombre,codMateria,descripcion);
		     System.out.println("¿Desea modificar otra Materia?");
		     s=dato.leerTexto();
		    }while(s.equals("si"));
		    do{
			 this.menuPrincipal();
		    }while(n.equals("no"));
		    break;
		 
		   case 3:
		    do{
     		 System.out.println("-------Eliminar Materia:--------");
			 mMateria.eliminarMateria(nombre,codMateria,descripcion);
		     System.out.println("¿Desea eliminar otra Materia?");
		      s=dato.leerTexto();
		    }while(s.equals("si"));
		    do{
			 this.menuPrincipal();
		    }while(n.equals("no"));
		    break;
		 
		 
		 
		 
		 
		 
		   case 4:
		   this.menuPrincipal();
		  
		    
		 
		}   
	   
	  
	 
	}
    public void menuInstructor(){
	    System.out.println("-----Menu Instructor------");
		System.out.println("1.....Agregar Instructor");
		System.out.println("2.....Modificar");
		System.out.println("3.....Eliminar");
		System.out.println("4.....Regresar");
	    opcion=dato.ingresarNumero();
		switch(opcion){
          case 1:			
	      do{
		    codInstructor++;
			System.out.println("        Ingrese Datos:            ");
			System.out.println("Ingrese nombre del Instructor");
            nombre=dato.leerTexto();
			System.out.println("Ingrese el apellido del Instructor");
		    apellido=dato.leerTexto();
            System.out.println("Ingrese la direccion del Instructor ");
		    direccion=dato.leerTexto();
			System.out.println("Ingrese el numero de telefono");
		    tel=dato.ingresarNumero();
			mInstructor.agregarInstructor(nombre,apellido, codInstructor, direccion, tel);
			mInstructor.reporteInstructores();
			System.out.println("¿Desea agregar otro Instructor?");
		    s=dato.leerTexto();
			}while(s.equals("si"));
			do{
			  this.menuPrincipal();
			}while(n.equals("no"));
			
			break;
		    
		  case 2:
            do{
     		 System.out.println("-------Modificar datos:--------");
			 mInstructor.modificadorInstructor(nombre,apellido,codInstructor,direccion,tel);
		     System.out.println("¿Desea modificar otro Instructor?");
		      s=dato.leerTexto();
		    }while(s.equals("si"));
		    do{
			 this.menuPrincipal();
		    }while(n.equals("no"));
		    break;
		  case 3:
		    do{
     		 System.out.println("-------Eliminar Salon:--------");
			 mInstructor.eliminarInstructor(nombre,apellido,codInstructor,direccion,tel);
		     System.out.println("¿Desea eliminar otro Instructor?");
		      s=dato.leerTexto();
		    }while(s.equals("si"));
		    do{
			 this.menuPrincipal();
		    }while(n.equals("no"));
		    break;
		   
		 
		 
		   case 4:
		    this.menuPrincipal();
		    break;
		 
		   
		 
		 
		}   
		
	}
	
	public void menuSalones(){
	    System.out.println("-----Menu Salon------");
		System.out.println("1.....Agregar Salon");
		System.out.println("2.....Modificar");
		System.out.println("3.....Eliminar");
		System.out.println("4.....Regresar");
	    opcion=dato.ingresarNumero();
	    switch(opcion){
          case 1:			
	      do{
		    codSalon++;
			System.out.println("        Ingrese Datos:            ");
			System.out.println("Ingrese nombre del Salon:");
            nombre=dato.leerTexto();
			System.out.println("Ingrese cantidad de alumnos:");
		    cantidad=dato.ingresarNumero();
			mSalon.agregarSalon(codSalon,nombre,cantidad);
			mSalon.reportesalones();
			System.out.println("¿Desea agregar otro Salon?");
		    s=dato.leerTexto();
			}while(s.equals("si"));
			do{
			  this.menuPrincipal();
			}while(n.equals("no"));
			
			break;
		  case 2:
		   do{
		    System.out.println("        Modificar datos:            ");
		    mSalon.modificadorSalon(codSalon, nombre,cantidad);
		   System.out.println("¿Desea modificar otro salon?");
		   s=dato.leerTexto();
		   }while(s.equals("si"));
		   do{
			 this.menuPrincipal();
		    }while(n.equals("no"));
		   break;
		  
		  
		  
		 
		 
		 
		 
		  case 4:
		  this.menuPrincipal();
		 
		 
		 
	     	
		 
		    
		}   
	}
	
	

	
	
	




	
}



