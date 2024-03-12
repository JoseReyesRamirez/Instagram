/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CCCU
 */
public class BDconsultas {
    
    public void insertarDato(String b, String c){
         BD bd = new BD();
        Statement stm=bd.Get_conn();
        String datos = "'"+b+"','"+c+"'";
        String query = "INSERT INTO Tabla1 (nombre,edad) VALUES ("+datos+")";
        try {
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Create_account.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Insert\n");
    }
    
}





