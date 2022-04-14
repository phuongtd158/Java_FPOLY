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
    public static void main(String[] args) {
        var sever = "PEACEMINUSONE\\SQLEXPRESS";
        var user = "sa";
        var password = "123";
        var db = "a";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(sever);
        ds.setPortNumber(port);

        try (Connection conn = ds.getConnection()) {
            System.out.println("Kết nối thành công");
            System.out.println(conn.getCatalog());
        } catch (Exception e) {
            System.out.println("Lỗi" +e);
        }
    }

}
