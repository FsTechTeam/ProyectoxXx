/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Principal;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Vader33
 */
public class Proveedor {
    
    
    
            /**
    * metodo para ingresar un cliente 
    * @param Nombre
    * @param Alias
    * @param Nit
    * @param Correo
    */
        public void insertar(String Nombre,String Alias,String Nit,String Correo) {
       
        Conexion cone= new Conexion();
        Connection conect=cone.getconexion() ;
        
            if(conect!=null){
            System.out.println("Conexion correcta");
        }
         try
        {
            Statement statement=(Statement) conect.createStatement();                    
            statement.execute("INSERT INTO Proveedor (Nombre,Alias,NIT,Correo) VALUES('"+Nombre+"','"+Alias+"','"+Nit+"','"+Correo+"')");             
            System.out.println("Datos ingresados correctamente");          
            statement.close();
            conect.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
      
    }
}
