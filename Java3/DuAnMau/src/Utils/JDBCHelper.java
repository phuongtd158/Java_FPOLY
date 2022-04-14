/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class JDBCHelper {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Edusys";
    private static String user = "sa";
    private static String pass = "123";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Xay dung Prepastatement
     *
     * @param sql la cau lenh SQL chua: co the chua tham so, no co the la 1 loi
     * goi thu tuc
     * @param args la danh sach cac gia tri duoc cung cap cho cac tham so trong
     * cau lenh sql
     * @return PreparedStatement tao duoc
     * @throws loi cu phap
     *
     */
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement statement = null;
        if (sql.trim().startsWith("{")) {
            statement = connection.prepareCall(sql);
        } else {
            statement = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            statement.setObject(i + 1, args[i]);
        }
        return statement;

    }

    //  Thuc hien cac cau lenh SQL thao tac(INSERT,UPDATE, DELETE) hoac thu tuc luu
    public static int update(String sql, Object... args) {
        try {
            PreparedStatement statement = getStmt(sql, args);
            try {
                return statement.executeUpdate();
            } finally {
                statement.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Thuc hien cau lenh truy van SELECT
     *
     */
    public static ResultSet query(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //Tra ve du lieu
    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
