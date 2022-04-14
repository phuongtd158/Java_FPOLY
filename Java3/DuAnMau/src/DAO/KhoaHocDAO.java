/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.KhoaHoc;
import Utils.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class KhoaHocDAO extends EdusysDAO<KhoaHoc, Integer> {

    final String INSERT_SQL = "insert into KHOAHOC(MaCD,HocPhi, ThoiLuong,NgayKG,GhiChu, MaNV, NgayTao) values(?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "update KHOAHOC set MaCD = ?, HocPhi = ?, ThoiLuong = ?, NgayKG = ?, GhiChu = ?, NgayTao = ?, MaNV = ? where MaKH = ?";
    final String DELETE_SQL = "delete from KHOAHOC where MaKH = ?";
    final String SELECT_ALL_SQL = "select * from KHOAHOC";
    final String SELECY_BY_ID_SQL = "select * from KHOAHOC where MaKH = ?";
    final String DLT = " DELETE FROM dbo.HOCVIEN WHERE MaKH = ?";

    @Override
    public void insert(KhoaHoc entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayTao());
    }

    @Override
    public void update(KhoaHoc entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(), entity.getGhiChu(), entity.getNgayTao(), entity.getMaNV(), entity.getMaKH());
    }

    @Override
    public void delete(Integer id) {
        JDBCHelper.update(DLT, id);
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhoaHoc selectById(Integer id) {
        List<KhoaHoc> list = selectBySql(SELECY_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhoaHoc> selectBySql(String sqlString, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        ResultSet rs = JDBCHelper.query(sqlString, args);

        try {
            while (rs.next()) {
                KhoaHoc entity = new KhoaHoc();
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaCD(rs.getString("MaCD"));
                entity.setHocPhi(rs.getFloat("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setNgayKG(rs.getDate("NgayKG"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayTao(rs.getDate("NgayTao"));

                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<KhoaHoc> selectByChuyenDe(String maCD) {
        String sql = "Select * from KHOAHOC where MaCD = ?";
        return selectBySql(sql, maCD);
    }

    public List<Integer> selectYear() {
        String sql = "Select DISTINCT year(NgayKG) from KHOAHOC order by year(NgayKG) DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
