
package com.mycompany.proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BDconsultas {
    
    public void insertarDato(String nom, String fechaStr, String correo, String user, String pass){
         BD bd = new BD();
        Statement stm=bd.Get_conn();
        
        String datos = "'"+user+"','"+correo+"','"+pass+"','"+nom+"','"+fechaStr+"'";
        String query = "INSERT INTO Usuarios (Username,Email,Contraseña,Nombre,FechaNa) VALUES ("+datos+")";
        
        try {
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Create_account.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Insert\n");
    }
    
    public void Select(String b, String c){
         BD bd = new BD();
        Statement stm=bd.Get_conn();
        String datos = "'"+b+"','"+c+"'";
        String query = "SELECT * FROM Usuarios WHERE Username = '"+b+"' AND Contraseña = '";
        query=query+c+"'";
        System.out.print("query\n");
        try {
            ResultSet rs = stm.executeQuery(query);
            rs.next();
            System.out.print(rs.getString("Nombre"));

            
        } catch (SQLException ex) {
            Logger.getLogger(Create_account.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Insert\n");
    }
    
}





