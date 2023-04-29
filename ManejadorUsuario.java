package com.esau.manejador;
import com.esau.vista.*;
import com.esau.manejador.*;
import com.esau.modelo.*;
import java.util.ArrayList;
public class ManejadorUsuario{
   Usuario usuario=new Usuario();
   ManejadorMateria mMateria=new ManejadorMateria();
   PantallaDirector pd=new PantallaDirector();
   PantallaInstructor pi=new PantallaInstructor();
   
   public void logInicial(String user, String clave){
      
	   if (user.equals(usuario.getNombre())&& clave.equals(usuario.getClave())){
		  
		  
		   if(usuario.getRol().equals("d")){
			    System.out.println("Datos correctos");
				pd.menuPrincipal();
			   
			   
		    }
		    
          
         
         
          
	    }else{  
		    System.out.println("Dato Erroneos");
		    
        }
         
      
      
    }
	
	public void logSecundario(String user, String clave){
      
	   if (user.equals(usuario.getNombre())&& clave.equals(usuario.getClave())){
		  
		  
		   if(usuario.getRol().equals("i")){
			    System.out.println("Datos correctos");
				pi.menuPrincipal();
			   
			   
		    }
		    
          
         
         
          
	    }else{  
		    System.out.println("Dato Erroneos");
		    
        }
        
      
      
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}