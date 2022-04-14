/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HocVien;
import Utils.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class HocVienDAO extends EdusysDAO<HocVien, Integer> {

    final String INSERT_SQL = "INSERT INTO HOCVIEN(MaKH, MaNH, Diem) VALUES (?, ?, ?)";
    final String UPDATE_SQL = "update HOCVIEN set MaKH = ?, MaNH = ?, Diem = ? where MaHV = ?";
    final String DELETE_SQL = "DELETE FROM HOCVIEN WHERE MaHV = ?";
    final String SELECT_ALL_SQL = "select * from HOCVIEN";
    final String SELECY_BY_ID_SQL = "SELECT * FROM HOCVIEN WHERE MaHV = ?";

    @Override
    public void insert(HocVien entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem());
    }

    @Override
    public void update(HocVien entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem(), entity.getMaHV());
    }

    @Override
    public void delete(Integer id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<HocVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectById(Integer id) {
        List<HocVien> list = selectBySql(SELECY_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HocVien> selectBySql(String sqlString, Object... args) {
        List<HocVien> list = new ArrayList<>();
        ResultSet rs = JDBCHelper.query(sqlString, args);

        try {
            while (rs.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setDiem(rs.getFloat("Diem"));

                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<HocVien> selectByKhoaHoc(int MaKH) {
        String sql = "Select * from HOCVIEN where MaKH = ?";
        return selectBySql(sql, MaKH);
    }
}
