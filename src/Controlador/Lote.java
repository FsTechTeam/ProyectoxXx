/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Vader33
 */
public class Lote {
         /** 
  /* metodo para ingresar un cliente 
    * @param Numero
    * @param FechaVencimiento
    * @param Existencias
    * @param Costo
    * @param producto_presentacion
    */
    
     public void insertar(int Numero,String FechaVencimiento,int Existencias,double Costo,int producto_presentacion) {
        
        Conexion cone= new Conexion();
        Connection conect=cone.getconexion() ;
         
         
        if(conect!=null){
            System.out.println("Conexion correcta");
        }
         try
        {
            Statement statement=(Statement) conect.createStatement();                    
            statement.execute("INSERT INTO Lote (Numero,Fecha_Vencimiento,Existencias_Lote,Costo,Producto_Pesentacion_id) VALUES('"+Numero+"','"+FechaVencimiento+"','"+Existencias+"','"+Costo+"','"+producto_presentacion+"')");             
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
