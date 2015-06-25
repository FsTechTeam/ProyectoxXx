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
public class Producto {
    
       /**
    * metodo para ingresar un cliente 
    * @param Codigo
    * @param PrecioCosto
    * @param PrecioVenta
    * @param PrecioMercado
    * @param FechaCaducidad
    */
    
     public void insertar(String Codigo,double PrecioCosto,double PrecioVenta,double PrecioMercado,String FechaCaducidad) {
      Conexion cone= new Conexion();
        Connection conect=cone.getconexion() ;
         
         if(conect!=null){
            System.out.println("Conexion correcta");
        }
         try
        {
            Statement statement=(Statement) conect.createStatement();                    
            //statement.execute("INSERT INTO Clientes(Nombre,Nit,Direccion) VALUES('"+nombre+"','"+Nit+"','"+Direccion+"')");             
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
