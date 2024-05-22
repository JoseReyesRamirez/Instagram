
package com.mycompany.proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class BDconsultas {
    
    public void insertarDato(String nom, String fechaStr, String correo, String user, String pass){
         BD bd = new BD();
        Statement stm=bd.Get_conn();
        
        String datos = "'"+user+"','"+correo+"','"+pass+"','"+nom+"','"+fechaStr+"'";
        String query = "INSERT INTO Usuarios (Username,Email,Contraseña,Nombre,FechaNa) VALUES ("+datos+")";
        System.out.print(query+".\n");
        try {
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Create_account.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Insert.\n");
    }
    
     public void crearPub(String desc, String path, String user){
         BD bd = new BD();
        Statement stm=bd.Get_conn();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaac = dateTime.format(formatters);
        String datos = "'"+fechaac+"','"+desc+"','"+user+"','"+path+"'";
        String query = "INSERT INTO Publicaciones (Fecha,Descripcion,Username, Path) VALUES ("+datos+")";
        try {
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(BDconsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(query);
        
        System.out.print("Insert.\n");
    }
    
    /*public ImageIcon extraerImg(){
         BD bd = new BD();
        Statement stm=bd.Get_conn();
        String query = "SELECT Imagen FROM Publicaciones WHERE Id =1";
        System.out.print("query\n");
        
        try {
            ResultSet rs = stm.executeQuery(query);
            byte[] bytesImagen = null;
             if (rs.next()) {
            bytesImagen = rs.getBytes("Imagen");
        }
            if (bytesImagen != null) {
            ImageIcon imagen = new ImageIcon(bytesImagen);
            return imagen;
        }
            
        System.out.print("extraida\n");
    }catch (SQLException ex) {
            Logger.getLogger(Create_account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }*/
    
     public String extraerPath(String IDP){
         BD bd = new BD();
        Statement stm=bd.Get_conn();
        String query = "SELECT Path FROM Publicaciones WHERE IDPublicacion ="+IDP;
        System.out.print("query\n");
       
        ResultSet rs = null;
        try {
            rs = stm.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(BDconsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        String direccion = null;
        try {
            direccion = rs.getString("Path");
        } catch (SQLException ex) {
            Logger.getLogger(BDconsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("extraida\n");
        return direccion;
   
    }
     
    
     
    //23161651
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





