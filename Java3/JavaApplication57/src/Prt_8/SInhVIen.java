/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prt_8;

/**
 *
 * @author ADMIN
 */
public class SInhVIen {
   public String maSv, hoTen, gioiTInh, maMon,tenMon;
    public double diem;

    public SInhVIen() {
    }

    public SInhVIen(String maSv, String hoTen, String gioiTInh, String maMon, String tenMon, double diem) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.gioiTInh = gioiTInh;
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.diem = diem;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTInh() {
        return gioiTInh;
    }

    public void setGioiTInh(String gioiTInh) {
        this.gioiTInh = gioiTInh;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
}
