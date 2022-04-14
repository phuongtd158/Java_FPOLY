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
public class CapNhat {

    public static void main(String[] args) {
        try {
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Lab5_SOF203";
            Connection cn = DriverManager.getConnection(url, user, pass);
            if (cn != null) {
                System.out.println("Kết nối thành công");
                String sql = "update STUDENTS set MASV = ? where MASV = '1'";
                PreparedStatement p = cn.prepareStatement(sql);
                p.setString(1, "PH123");

                int up = p.executeUpdate();

                System.out.println("Số " + up);

                p.close();
                cn.close();

            } else {
                System.out.println("Kết nối thất bại");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
