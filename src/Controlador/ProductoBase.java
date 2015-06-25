/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Principal;
import java.sql.Connection;
import java.sql.Statement;



public class ProductoBase {
   /** 
  /* metodo para ingresar un cliente 
    * @param Codigo
    * @param Nombre
    * @param ProveedorId
    */
    
     public void insertar(String Codigo,String Nombre,int ProveedorId) {
        
        Conexion cone= new Conexion();
        Connection conect=cone.getconexion() ;
         
         
        if(conect!=null){
            System.out.println("Conexion correcta");
        }
         try
        {
            Statement statement=(Statement) conect.createStatement();                    
            statement.execute("INSERT INTO Producto (Nombre,CodigoP,Fabricante_id) VALUES('"+Nombre+"','"+Codigo+"','"+ProveedorId+"')");             
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
