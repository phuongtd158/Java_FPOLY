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
public class SinhVien1 implements Serializable {
    public String maMeo, hoTen, kyNang, gioiTinh, thieu;
    public double diem;

    public SinhVien1() {
    }

    public SinhVien1(String maMeo, String hoTen, String kyNang, double diem, String gioiTinh, String thieu) {
        this.maMeo = maMeo;
        this.hoTen = hoTen;
        this.kyNang = kyNang;
        this.diem = diem;
        this.gioiTinh = gioiTinh;
        this.thieu = thieu;
    }

    public String getMaMeo() {
        return maMeo;
    }

    public void setMaMeo(String maMeo) {
        this.maMeo = maMeo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getKyNang() {
        return kyNang;
    }

    public void setKyNang(String kyNang) {
        this.kyNang = kyNang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getThieu() {
        return thieu;
    }

    public void setThieu(String thieu) {
        this.thieu = thieu;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

  
    
}
