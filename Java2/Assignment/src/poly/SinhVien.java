/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;
import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SinhVien implements Serializable{
    private String maNv, tenNv, email;
    private int tuoi;
    private double luong;

    public SinhVien() {
    }

    public SinhVien(String maNv, String tenNv, String email, int tuoi, double luong) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.email = email;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maNv=" + maNv + ", tenNv=" + tenNv + ", email=" + email + ", tuoi=" + tuoi + ", luong=" + luong + '}';
    }
    
}
