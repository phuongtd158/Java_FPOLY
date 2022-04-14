/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utils.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class ThongKeDAO {

    //getListOfArray() chỉ được phục vụ cho các phương thức còn lại. Nó dự vào tên PROC
    //mảng các cột để đọc dữ liệu trên mỗi bản ghi
//    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
//        try {
//            List<Object[]> list = new ArrayList<>();
//            ResultSet rs = JDBCHelper.query(sql, args);
//            while (rs.next()) {
//                Object[] vals = new Object[cols.length];
//                for (int i = 0; i < cols.length; i++) {
//                    vals[i] = rs.getObject(cols[i]);
//                }
//                list.add(vals);
//            }
//            rs.getStatement().getConnection().close();
//            return list;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
    public List<Object[]> getBangDiem(Integer maKH) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{CALL sp_BangDiem(?)}";
                rs = JDBCHelper.query(sql, maKH);

                while (rs.next()) {
                    double diem = rs.getFloat("Diem");
                    String xepLoai = "";
                    if (diem < 0) {
                        xepLoai = "Chưa nhập";
                    } else if (diem < 3) {
                        xepLoai = "Kém";
                    } else if (diem < 5) {
                        xepLoai = "Yếu";
                    } else if (diem < 6.5) {
                        xepLoai = "Trung bình";
                    } else if (diem < 7.5) {
                        xepLoai = "Khá";
                    } else if (diem < 9) {
                        xepLoai = "Giởi";
                    } else {
                        xepLoai = "Xuất sắc";
                    }

                    Object[] model = {rs.getString("MaNH"), rs.getString("HoTen"), diem, xepLoai};
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<Object[]> getLuongNguoiHoc() {
        List<Object[]> list = new ArrayList<>();

        try {

            String sql = "{CALL sp_TongKeNguoiHoc}";
            ResultSet rs = JDBCHelper.query(sql);

            while (rs.next()) {
                list.add(new Object[]{
                    rs.getInt("Nam"), rs.getInt("SoLuong"), rs.getDate("DauTien"), rs.getDate("CuoiCung")
                });
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<Object[]> getDiemChuyenDe() {
        List<Object[]> list = new ArrayList<>();

        try {

            String sql = "{CALL sp_ThongKeDiem}";
            ResultSet rs = JDBCHelper.query(sql);

            while (rs.next()) {
                list.add(new Object[]{
                    rs.getString("ChuyenDe"), rs.getInt("SoHV"), rs.getFloat("ThapNhat"), rs.getFloat("CaoNhat"), rs.getFloat("TrungBinh")
                });
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<Object[]> getDoanhThu(Integer nam) {
        List<Object[]> list = new ArrayList<>();

        try {

            String sql = "{CALL sp_ThongKeDoanhThu(?)}";
            ResultSet rs = JDBCHelper.query(sql, nam);

            while (rs.next()) {
                list.add(new Object[]{
                    rs.getString("ChuyenDe"), rs.getInt("SoKH"), rs.getInt("SoHV"), rs.getFloat("DoanhThu"), rs.getFloat("ThapNhat"),
                    rs.getFloat("CaoNhat"), rs.getFloat("TrungBinh")
                });
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public String getXepLoai(double diem) {
        String xepLoai = "";
        if (diem < 0) {
            xepLoai = "Chưa nhập";
        } else if (diem < 3) {
            xepLoai = "Kém";
        } else if (diem < 5) {
            xepLoai = "Yếu";
        } else if (diem < 6.5) {
            xepLoai = "Trung bình";
        } else if (diem < 7.5) {
            xepLoai = "Khá";
        } else if (diem < 9) {
            xepLoai = "Giởi";
        } else {
            xepLoai = "Xuất sắc";
        }
        return xepLoai;
    }
}
