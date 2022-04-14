/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Helper.DatabaseHelper;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class NguoiDungDAO {

    public NguoiDung checkLogin(String tenDangNhap, String matKhau) {
        Connection cn;
        try {
            cn = DatabaseHelper.ketNoi("FPL_DaoTao1");
            String sql = "select USERNAME, PASSWORD, ROLE\n"
                    + "from USERS where USERNAME = ? and PASSWORD = ?";
            PreparedStatement statement = cn.prepareStatement(sql);

            statement.setString(1, tenDangNhap);
            statement.setString(2, matKhau);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setTenDangNhap(tenDangNhap);
                nd.setVaiTro(rs.getString("ROLE"));
                return nd;
            }
        } catch (Exception e) {
        }

        return null;
    }
}
