/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databasename=a;encode=false";
            String userName = "sa";
            String password = "123";

            Connection con = DriverManager.getConnection(url, userName, password);
            Statement stmt = con.createStatement();
          

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
}
