/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Geek
 */
public class Conexion {
    
   public static Connection conectar = null;
    public Conexion() {
    }
    public Connection conexion() {

        try {
            String host = "192.168.10.141";
            String DB = "DBGastroClinica";
            String user = "root";
            String pass = "1234";
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://" + host + "/" + DB + "", user, pass);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
}
