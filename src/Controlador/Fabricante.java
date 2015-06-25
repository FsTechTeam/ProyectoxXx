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
public class Fabricante {
         /**
    * metodo para ingresar un cliente 
    * @param Nombre
    * @param Direccion
    * @param Contacto
    * @param TipoTelefono
    */
        public void insertar(String Nombre,String Direccion,String Contacto,int TipoTelefono) {

    
        Conexion cone= new Conexion();
        Connection conect=cone.getconexion() ;
            
            if(conect!=null){
            System.out.println("Conexion correcta");
        }
         try
        {
            Statement statement=(Statement) conect.createStatement();                    
            statement.execute("INSERT INTO Fabricante (Nombre,Direccion,Contacto,Tipo_Telefono_id) VALUES('"+Nombre+"','"+Direccion+"','"+Contacto+"','"+TipoTelefono+"')");             
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
