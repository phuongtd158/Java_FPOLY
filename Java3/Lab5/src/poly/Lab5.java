/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSV";
            Connection con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Ket noi thanh cong");
                String sql = "select * from STUDENTS";
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql);

                while (rs.next()) { 
                    System.out.print(rs.getString(1) + ", ");
                    System.out.print(rs.getString(2) + ", ");
                    System.out.print(rs.getString(3) + ", ");
                    System.out.print(rs.getString(4) + ", ");
                    System.out.print(rs.getString(5) + "\n");
                }
                con.close();
            } else {
                System.out.println("That bai");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
