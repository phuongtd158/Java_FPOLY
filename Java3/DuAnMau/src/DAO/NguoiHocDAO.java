/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NguoiHoc;
import Utils.Auth;
import Utils.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class NguoiHocDAO extends EdusysDAO<NguoiHoc, String> {

    final String INSERT_SQL = " insert into NGUOIHOC(MaNH,MaNV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, GhiChu, NgayDK) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "update NGUOIHOC set MaNV = ?, HoTen = ?, GioiTinh = ?, NgaySinh = ?, DienThoai = ?, Email = ?, GhiChu = ?, NgayDK = ? where MaNH = ?";
    final String DELETE_SQL = "delete from NGUOIHOC where MaNH = ?";
    final String SELECT_ALL_SQL = "select * from NGUOIHOC";
        final String SELECY_BY_ID_SQL = "select * from NGUOIHOC where MANH = ?";
    final String dl = "delete from HOCVIEN where MANH = ?";

    @Override
    public void insert(NguoiHoc entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaNH(), Auth.user.getMaNv(), entity.getHoTen(), entity.getGioiTinh(), entity.getNgaySinh(), entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getNgayDK());
    }

    @Override
    public void update(NguoiHoc entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaNV(), entity.getHoTen(), entity.getGioiTinh(), entity.getNgaySinh(), entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getNgayDK(), entity.getMaNH());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(dl, id);
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectById(String id) {
        List<NguoiHoc> list = selectBySql(SELECY_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiHoc> selectBySql(String sqlString, Object... args) {
        List<NguoiHoc> list = new ArrayList<>();
        ResultSet rs = JDBCHelper.query(sqlString, args);

        try {
            while (rs.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(rs.getString("MaNH"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setGioiTinh(rs.getString("GioiTinh"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setNgayDK(rs.getDate("NgayDK"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<NguoiHoc> selectByKeyWord(String keyWord) {
        String sql = "SELECT * FROM NGUOIHOC where HoTen like ?";
        return this.selectBySql(sql, "%" + keyWord + "%");
    }

    public List<NguoiHoc> selectNotInCourse(int MaKH, String keyWord) {
        String sql = "SELECT * FROM NGUOIHOC WHERE HoTen like ?"
                + " and MaNH not in(SELECT MaNH FROM HOCVIEN WHERE MaKH = ?)";
        return selectBySql(sql, "%" + keyWord + "%", MaKH);
    }

}
