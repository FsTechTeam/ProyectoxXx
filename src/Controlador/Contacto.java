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
public class Contacto {
            /**
    * metodo para ingresar un cliente 
    * @param Numero
    * @param Direccion
    * @param TipoTelefono
    */
        public void insertar(String Numero,String Direccion,int TipoTelefono) {
 
        Conexion cone= new Conexion();
        Connection conect=cone.getconexion() ;
        
            if(conect!=null){
            System.out.println("Conexion correcta");
        }
         try
        {
            Statement statement=(Statement) conect.createStatement();                    
            statement.execute("INSERT INTO Contacto (Numero,Direccion,Proveedor_id,Tipo_Telefono_id) VALUES('"+Numero+"','"+Direccion+"',Select MAX(id) from Proveedor,'"+TipoTelefono+"')");             
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
