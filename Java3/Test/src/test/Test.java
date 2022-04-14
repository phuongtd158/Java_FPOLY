/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databasename=FPL_DaoTao;";
            String userName = "sa";
            String password = "123";

            Connection con = DriverManager.getConnection(url, userName, password);
            Statement stmt = con.createStatement();
           

        } catch (ClassNotFoundException ex) {
            ex.getStackTrace();
        }
    }

}
