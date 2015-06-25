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
public class Presentacion {
           /**
    * metodo para ingresar un cliente 
    * @param Presentacion    
    */
        public void insertar(String Presentacion) {
        Connection conect=(Connection) Principal.conexion;
        if(conect!=null){
            System.out.println("Conexion correcta");
        }
         try
        {
            Statement statement=(Statement) conect.createStatement();                    
            statement.execute("INSERT INTO Presentacion (Presentacion) VALUES('"+Presentacion+"')");             
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
