/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
    
      public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection conn = null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "password");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  conn;
    }
    
    
    
}
    

