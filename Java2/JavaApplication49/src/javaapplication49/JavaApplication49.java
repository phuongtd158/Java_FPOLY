/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databasename=a;encode=false";
            String userName = "sa";
            String password = "123";

            Connection con = DriverManager.getConnection(url, userName, password);
            Statement stmt = con.createStatement();
            System.out.println("Thànhc ông");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
