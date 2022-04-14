/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class JavaApplication56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sever = "PEACEMINUSONE\\SQLEXPRESS01";
        String user = "sa";
        String pass = "123";
        String db = "Edusys1";
        int port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(pass);
        ds.setDatabaseName(db);
        ds.setServerName(sever);
        ds.setPortNumber(port);
        try (Connection con = ds.getConnection()) {
            System.out.println("ok");
            System.out.println(con.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
