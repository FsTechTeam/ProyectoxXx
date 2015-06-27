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
public class HistorialPrecio {
     /** 
  /* metodo para ingresar un cliente 
    * @param PrecioCalle
    * @param FechaPrecio
    * @param producto_presentacion_id
    */
    
     public void insertar(double PrecioCalle,String FechaPrecio,int producto_presentacion_id) {
        
        Conexion cone= new Conexion();
        Connection conect=cone.getconexion() ;
         
         
        if(conect!=null){
            System.out.println("Conexion correcta");
        }
         try
        {
            Statement statement=(Statement) conect.createStatement();                    
            statement.execute("INSERT INTO Historial_PrecioCalle (PrecioCalle,Fecha_Precio,Producto_Presentacion_id) VALUES('"+PrecioCalle+"','"+FechaPrecio+"','"+producto_presentacion_id+"')");             
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
