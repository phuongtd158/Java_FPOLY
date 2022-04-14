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
public class Bai1 {

    public static void main(String[] args) {
        try {
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=FPL_DaoTao";
            Connection cn = DriverManager.getConnection(url, user, pass);
            if (cn != null) {
                System.out.println("Kết nối thành công");
                String sql = "select MASV, HOTEN, EMAIL\n"
                        + "from STUDENTS";
                //Sử dụng kết nối connection để tạo câu lệnh statement
                Statement stm = cn.createStatement();
                //thi hành Statement => lưu kết quả vào Resultset
                ResultSet rs = stm.executeQuery(sql);

                //Duyệt resultset => lấy dữ liệu làm việc của mình
                while (rs.next()) {
                    System.out.println(
                            rs.getString(1) + "\t"
                            + rs.getString(2) + "\t"
                            + rs.getString("EMAIL"));
                }
                //đóng
                cn.close();
                rs.close();
                stm.close();
            } else {
                System.out.println("Kết nối thất bại");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
