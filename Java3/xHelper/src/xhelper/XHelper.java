/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xhelper;

import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class XHelper {

    public static Connection ketNoi(String database_Name) {

        String user = "sa";
        String pass = "123";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + database_Name;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
