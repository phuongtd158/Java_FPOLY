/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.ChuyenDe;
import Entity.KhoaHoc;
import Utils.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class ChuyenDeDAO extends EdusysDAO<ChuyenDe, String> {

    final String INSERT_SQL = "insert into CHUYENDE(MaCD, TenCD, HocPhi,ThoiLuong, Hinh, MoTa) values(?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "update CHUYENDE set TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa = ? where MaCD = ?";
    final String DELETE_SQL = "delete from CHUYENDE where MaCD = ?";
    final String SELECT_ALL_SQL = "select * from CHUYENDE";
    final String SELECY_BY_ID_SQL = "select * from CHUYENDE where MaCD = ?";
    final String DLT_KH = "delete from KHOAHOC where MaCD = ?";

    @Override
    public void insert(ChuyenDe entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaCD(), entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa());
    }

    @Override
    public void update(ChuyenDe entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa(), entity.getMaCD());
    }

    @Override
    public void delete(String id) {

        JDBCHelper.update(DLT_KH, id);
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectById(String id) {
        List<ChuyenDe> list = selectBySql(SELECY_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChuyenDe> selectBySql(String sqlString, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sqlString, args);
            while (rs.next()) {
                ChuyenDe entity = new ChuyenDe();
                entity.setMaCD(rs.getString("MaCD"));
                entity.setTenCD(rs.getString("TenCD"));
                entity.setHocPhi(rs.getFloat("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setMoTa(rs.getString("MoTa"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
