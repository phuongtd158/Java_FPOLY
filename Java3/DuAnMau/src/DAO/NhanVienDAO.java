/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NhanVien;
import Utils.Auth;
import Utils.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
//EntityType: Cho vao ten Lop, KeyType:Bo va kieu du lieu cua khoa chinh
public class NhanVienDAO extends EdusysDAO<NhanVien, String> {

    final String INSERT_SQL = "insert into NHANVIEN(MaNV, MatKhau,HoTen, VaiTro) values(?, ?, ?, ?)";
    final String UPDATE_SQL = "update NHANVIEN set MatKhau = ?, HoTen = ?, VaiTro = ? where MaNV = ?";
    final String DELETE_SQL = "delete from NHANVIEN where MaNV = ?";
    final String SELECT_ALL_SQL = "select * from NHANVIEN";
    final String SELECY_BY_ID_SQL = "select * from NHANVIEN where MaNV = ?";
    final String UPDATE_DLT = "update KHOAHOC set MaNV = ? where MaNV = ? update NGUOIHOC set MaNV = ? where MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaNv(), entity.getMatKhau(), entity.getHoTen(), entity.getVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen(), entity.getVaiTro(), entity.getMaNv());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(UPDATE_DLT, Auth.user.getMaNv(), id, Auth.user.getMaNv(), id);
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySql(SELECY_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    //Truyền vào câu lệnh sql nào sẽ chạy câu lệnh đó
    @Override
    public List<NhanVien> selectBySql(String sqlString, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sqlString, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNv(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setVaiTro(rs.getString("VaiTro"));
                list.add(entity);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
