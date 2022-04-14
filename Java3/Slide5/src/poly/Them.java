/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class Them {

    public static void main(String[] args) {
        try {
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=FPL_DaoTao";
            Connection cn = DriverManager.getConnection(url, user, pass);
            if (cn != null) {
                System.out.println("Kết nối thành công");
                String sql = "insert into STUDENTS(MASV, HOTEN, EMAIL, SODT, GIOTINH, DIACHI, HINH) values(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement p = cn.prepareCall(sql);

                p.setString(1, "1");
                p.setString(2, "1");
                p.setString(3, "1");
                p.setString(4, "1");
                p.setInt(5, 1);
                p.setString(6, "1");
                p.setString(7, "1");

                p.executeUpdate();
                cn.close();
                p.close();
            } else {
                System.out.println("Kết nối thất bại");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
