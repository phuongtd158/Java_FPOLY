/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author ADMIN
 */
public class Student {

    String maSv, hoTen, diaChi, email, sdt;
    boolean gioiTinh;

    public Student() {
    }

    public Student(String maSv, String hoTen, String diaChi, String email, String sdt, boolean gioiTinh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Student{" + "maSv=" + maSv + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", email=" + email + ", sdt=" + sdt + ", gioiTinh=" + gioiTinh + '}';
    }

}
