
package com.mycompany.proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {

    public void BD(){
        
    }
    public Statement Get_conn(){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
            String url = "jdbc:ucanaccess://" + ".\\DB_Instagram.accdb"; //Conectamos base de datos
            Connection con = DriverManager.getConnection(url);
            Statement stm = con.createStatement();
            return stm;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);

        }catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
/*
    bd_connection connection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
*/
}